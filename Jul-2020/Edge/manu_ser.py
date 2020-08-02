from kafka import KafkaProducer
import serial
import time
import json

s = serial.Serial(port = 'COM4', baudrate=4800, bytesize=8, stopbits=serial.STOPBITS_ONE)

s.close()
s.open()
sendmsg  = b"\x01\x03\x00\x00\x00\x01\x84\x0A" 

kafka_server = '192.168.3.48:9092'
topic ='eventhub7'

producer = KafkaProducer(bootstrap_servers=[kafka_server])

def probe(interval):
    # send msg to serial port
    s.write(sendmsg)

    # read response from serial port
    addr = s.read()
    funcode = s.read()
    bytenum = s.read()
    result= s.read(size=2)
    CRC1 = s.read()
    CRC2 = s.read()
    #content = " Address:" + str(addr) + " function code: " + str(funcode) + " bytes: " + str(bytenum) + " Result: " + str(result) + " CRC: " + str(CRC1) + str(CRC2)
    #print (content)
    sound_level = int.from_bytes(result,"big")/10
    print ("Sound Level: " + str(sound_level))
    sent_kafka(sound_level)
    time.sleep(interval)

def sent_kafka(data):
    eventdata = {'Sound Level': data}    
    try:
        future = producer.send(topic, json.dumps(eventdata).encode('utf-8'))
        producer.flush()
    except:
        print (future.get(timeout=10))
        pass

try:
    while True:
        probe(1)
except KeyboardInterrupt:
    print ("Press Ctl-C to stop!")
    pass

s.reset_input_buffer()
s.reset_output_buffer()
s.close()
