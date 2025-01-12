package org.example.demokafka.services;


import org.example.demokafka.entities.Employe;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsommateur {
    private static final String TOPIC = "employe_topic";

    public void consommeEmploye(Employe employe) {
        System.out.println("Employe consommé: " + employe);
    }
}
