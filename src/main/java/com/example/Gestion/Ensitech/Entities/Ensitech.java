package com.example.Gestion.Ensitech.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ensitech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String adresse;
    private String telephone;

    @OneToOne
    private Directeur directeur;

    // Getters and Setters

}
