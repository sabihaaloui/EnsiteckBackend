package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Directeur;
import com.example.Gestion.Ensitech.Repository.DirecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirecteurService {
    @Autowired
    private DirecteurRepository directeurRepository;

    public Directeur createDirecteur(Directeur directeur) {
        return directeurRepository.save(directeur);
    }

    public Optional<Directeur> getDirecteur(Long id) {
        return directeurRepository.findById(id);
    }

    public Directeur updateDirecteur(Long id, Directeur directeurDetails) {
        Directeur directeur = directeurRepository.findById(id).orElseThrow(() -> new RuntimeException("Directeur not found"));
        directeur.setNom(directeurDetails.getNom());
        directeur.setPrenom(directeurDetails.getPrenom());
        directeur.setEmail(directeurDetails.getEmail());
        directeur.setAdresse(directeurDetails.getAdresse());
        directeur.setTelephone(directeurDetails.getTelephone());
        return directeurRepository.save(directeur);
    }

    public void deleteDirecteur(Long id) {
        directeurRepository.deleteById(id);
    }

    public List<Directeur> getAllDirecteurs() {
        return directeurRepository.findAll();
    }
}