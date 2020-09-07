package com.github.matthewyliu.kafka.streams;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.kstream.Produced;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;


import java.util.Properties;


public class EvalNoiseInKStreams {
    public static void main(String[] args) {
        Properties config = new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG,"EvalNoiseInKStreams");
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        StreamsBuilder builder = new StreamsBuilder();

        KStream<String,String> source = builder.stream("eventhub7");
        source.peek((key, value) -> System.out.println("Old Key => "+ key + "  Old Value => " + value));
        KStream<String,String> proceeded = source
                .flatMap(
                        (key,value) -> {
                            List<KeyValue<String,String>> result = new LinkedList<>();
                            Float noiseLevel = Float.parseFloat(value.replaceAll("[^0-9.]",""));
                            String newKey = evalSoundLevel(noiseLevel);
                            String newValue = "{\"Impact\":" + evalSoundImpact(noiseLevel).toString() + "}";
                            result.add(KeyValue.pair(newKey,newValue));
                            return result;
                        }
                );
        proceeded.peek((key, value) -> System.out.println("New Key => "+ key + "  New Value => " + value));
        proceeded.to("eventhub8");

        //Duration windowsSizeMs = Duration.ofMinutes(1);
        //Duration advanceSs = Duration.ofSeconds(10);

        KTable<Windowed<String>, Long> soundLevelCounts = proceeded
                .groupByKey()
                .windowedBy(TimeWindows.of(Duration.ofMinutes(1)))
                .count();

        KStream<Windowed<String>, Long> result = soundLevelCounts.toStream();
        result.peek((key, value) -> System.out.print("Windows Key =>" + key + " Windows Value => " + value + "\n"));

    /*
        KStream<String,String> output = result
                .flatMap(
                        (key,value) -> {
                            List<KeyValue<String,String>> outputList = new LinkedList<>();
                            String[] keySplits = key.toString().replaceAll("\\[|\\]","").split("@");
                            String outputValue = "{\"" + keySplits[0] + "\":" + Long.toString(value) + "}";
                            outputList.add(KeyValue.pair(key.toString(),outputValue));
                            return outputList;
                        }
                );
        output.peek((key, value) -> System.out.print("Output Key =>" + key + " Output Value => " + value + "\n"));

        //output.to("eventhub9");

        //result.to("eventhub9",Produced.with(WindowedSerdes.timeWindowedSerdeFrom(String.class), Serdes.Long()));
    */
        KafkaStreams streams = new KafkaStreams(builder.build(), config);

        final CountDownLatch latch = new CountDownLatch(1);

        // attach shutdown handler to catch control-c
        Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook") {
            @Override
            public void run() {
                streams.close();
                latch.countDown();
            }
        });

        try {
            streams.start();
            latch.await();
        } catch (final Throwable e) {
            System.exit(1);
        }
        System.exit(0);
    }

    private static String evalSoundLevel(Float soundLevel){
        if (soundLevel < 0.0){
            return "Invalid";
        }else if(soundLevel<40.0){
            return "Quiet";
        }else if(soundLevel<70.0){
            return "Some Noisy";
        }else if(soundLevel<90.0){
            return "Annoying";
        }else {
            return "Dangerous";
        }
    }

    private static Integer evalSoundImpact(Float soundLevel){
        if (soundLevel < 0.0){
            return 0;
        }else if(soundLevel<40.0){
            return 1;
        }else if(soundLevel<70.0){
            return 2;
        }else if(soundLevel<90.0){
            return 3;
        }else {
            return 4;
        }
    }
}
