package org.example.demokafka.services;


import org.example.demokafka.entities.Employe;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducteur {
    private static final String TOPIC = "employe_topic";
    private final KafkaTemplate<String, Employe> kafkaTemplate;

    public KafkaProducteur(KafkaTemplate<String, Employe> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void envoyeEmploye(Employe employe) {
        System.out.println("Employe envoyé: " + employe);
        kafkaTemplate.send(TOPIC, employe);
    }
}
