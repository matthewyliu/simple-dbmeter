# my environment
- MacBook with Catalina 10.15
- Kafka 2.4.0 installed with homebrew

# Kafka configuration
- In zookeeper.properties, ensure zookeeper listens on the default port 2181
- In server.properties, ensure Kafka listeer updated with assigned IP
  - advertised.listeners=PLAINTEXT://192.168.3.48:9092
- update MirrorMaker configue files
  - consumer: souurce-kafka.config
    - ensure the "bootstrap.servers=127.0.0.1:9092"
  - produucer: mirror-eventhub.config
    - Set the bootstrap.servers = your EventHub URL:9093
    - Replace the password field with your EventHub connection string

# startup commands
- start the zookeeper server: zookeeper-server-start zookeeper.properties
- start the kafka cluster: kafka-server-start server.properties
- start the MirrorMaker: kafka-mirror-maker --consumer.config source-kafka.config --num.streams 1 --producer.config mirror-eventhub.config --whitelist=".*"