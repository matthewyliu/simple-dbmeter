# Create the Azure Event Hub
## Create the Event Hub Namespaces
- Ensure select the Pricing tier as standard, which support Kafka endpoint
- Create a new Shared access policy and grant Send & Listen access. Its connection string is set in the Kafka MirroMaker [prodcuer config](../Bus/mirror-eventhub.config)
## Create the Event Hub 
- create a Event Hub. The name MUST be the same as the [Kafka topic name in the send script](../Edge/manu_ser.py) to be replicated from bus

# Create the Azure Stream Analytics Job
## inputs
add a stream input as Event Hub and connect to the one created above

## output
add a sink as PowerBI. Select your PowerBI workspace, dataset name and table name. Do the authentication and save, after which the output will keep permanant access to your PowerBI.

## Query
edit the query to slect the fileds to be output to the PowerBI dataset.

# Create the PowerBI Dashboard
- after the Stream Analytics job runs without problem, the PowerBI dataset will be created automatically.
- in PowerBI portal, add tiles with real-time data pointing to the generated dataset
