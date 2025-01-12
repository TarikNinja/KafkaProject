package org.example.demokafka.controller;


import org.example.demokafka.services.KafkaProducteur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employe")
public class EmployeController {
    private final KafkaProducteur kafkaProducteur;

    public EmployeController(KafkaProducteur kafkaProducteur) {
        this.kafkaProducteur = kafkaProducteur;
    }

}
