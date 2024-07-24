package com.example.Gestion.Ensitech.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    private String matiere;

    @OneToMany(mappedBy = "enseignant")
    private List<Cours> cours;

    // Getters and Setters
}