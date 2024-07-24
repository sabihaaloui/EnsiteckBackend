package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Directeur;
import com.example.Gestion.Ensitech.Entities.Ensitech;
import com.example.Gestion.Ensitech.Repository.EnsitechRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EnsitechService {
    @Autowired
    private EnsitechRepository ensitechRepository;
/*
    public static Ensitech updateEnsitech(Long id, Ensitech ensitech) {
    }
*/
    public Ensitech createEcole(Ensitech Ensitech) {
        return ensitechRepository.save(Ensitech);
    }

    public Optional<Ensitech> getEcole(Long id) {
        return ensitechRepository.findById(id);
    }
/*
    public Ensitech updateEnsitech(Long id, Ensitech Ensitech) {
        Ensitech ensitech = EnsitechRepository.findById(id).orElseThrow(() -> new RuntimeException("Ensitech not found"));
        ensitech.setNom(ensitech.getNom());
        ensitech.setEmail(ensitech.getEmail());
        ensitech.setAdresse(ensitech.getAdresse());
        ensitech.setTelephone(ensitech.getTelephone());
        ensitech.setDirecteur(ensitech.getDirecteur());
        return ensitechRepository.save(ensitech);
    }
*/
    public void deleteEnsitech(Long id) {
        ensitechRepository.deleteById(id);
    }
/*
    public List<Ensitech> getAllEnsitech() {
        return EnsitechRepository.findAll();

    }
*/
}
