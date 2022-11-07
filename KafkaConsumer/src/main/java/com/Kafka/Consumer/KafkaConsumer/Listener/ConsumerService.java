package com.Kafka.Consumer.KafkaConsumer.Listener;


import com.Kafka.Consumer.KafkaConsumer.Model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "generalPOC",groupId = "group_id")
    public void consumeString(String message){
        System.out.println("String Message:"+message);
    }

    @KafkaListener(topics = "jsonPOC",groupId = "group_id_json",containerFactory = "jsonKafkaListenerConsumerFactory")
    public void consumeJson(User user){
        System.out.println("JSON Message:"+user.toString());
    }


}
