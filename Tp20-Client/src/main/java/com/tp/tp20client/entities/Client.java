package com.tp.tp20client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity  // Marque cette classe comme une entité JPA
@Data    // Génère getters, setters, toString, equals, hashCode
@NoArgsConstructor  // Génère un constructeur sans arguments
@AllArgsConstructor // Génère un constructeur avec tous les arguments
@Getter
@Setter
public class Client {

    @Id  // Marque ce champ comme clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incrémentation
    private Long id;

    private String nom;  // Nom du client
    private Float age;   // Âge du client

}
