package com.danarim.kafkaConsumer.service;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.danarim.kafkaConsumer.config.KafkaTopicConfig.*;

@Service
public class KafkaConsumer {

    private static final Log log = LogFactory.getLog(KafkaConsumer.class);

    @KafkaListener(topics = TOPIC_TOPIC1, groupId = GROUP_ID)
    public void consume(String message) {
        log.info(String.format("$$ -> Consumed Message -> %s", message));
    }

    @KafkaListener(topics = TOPIC_TOPIC2, groupId = GROUP_ID)
    public void consume2(String message) {
        log.info(String.format("$$ -> Consumed Message -> %s", message));
    }
}
