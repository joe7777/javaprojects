package com.learnkafka.producer;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerKafka {
    
	public static void main(String[] args) {
		
		Integer partition = new Integer(1);
		
		Properties properties=new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		//properties.put("partitioner.class", "com.learnkafka.partitioner.ProducerPartitioner");

		KafkaProducer<String,String> myProducer= new KafkaProducer<String,String>(properties);
		
			try {
			
			for(int i=250;i<500;i++){
				
				/*
				Date today = new Date();
			    Timestamp ts1 = new Timestamp(today.getTime());
			    Integer tsTime1 = ts1.getNanos();
			    */
				
				// approche 1 precisier la partition
				//myProducer.send(new  ProducerRecord<String, String>("my-second-topic1", partition, "Message 1","Message Value : " + Integer.toString(i)));
				
				// apporche 2 ne pas preciser mais avec le meme hash
				//myProducer.send(new  ProducerRecord<String, String>("my-second-topic1", "message","Message Value : " + Integer.toString(i)));
				
				// Ne pas preciser la partition Round Robin
				myProducer.send(new  ProducerRecord<String, String>("my-second-topic1","Message Value : " + Integer.toString(i)));
				// apporche 3 key hshing
				//myProducer.send(new  ProducerRecord<String, String>("my-second-topic1", "Message", "Message Value : " + Integer.toString(i)));
				//myProducer.send(new  ProducerRecord<String, String>("my-second-topic1", partition, "Message 1" , "url:<local-directory-path>/file"));

				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			myProducer.close();
		}
	}

}
