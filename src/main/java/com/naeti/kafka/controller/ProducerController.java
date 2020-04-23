package com.naeti.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ProducerController {

    private final KafkaTemplate kafkaTemplate;

    private ProducerController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @RequestMapping(value="/get/{topic}")
    public String getData(@PathVariable String topic, @RequestParam(value = "message", required = true, defaultValue = "") String message ){


        // mytopic에 현재 시간 + message를 produce 한다.
        kafkaTemplate.send(topic,  message);
        return "kafkaTemplate.send >>  " + message ;
    }
}
