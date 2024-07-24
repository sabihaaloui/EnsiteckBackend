package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Cours;
import com.example.Gestion.Ensitech.Repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    @Autowired
    private CoursRepository coursRepository;

    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public Optional<Cours> getCours(Long id) {
        return coursRepository.findById(id);
    }

    public Cours updateCours(Long id, Cours coursDetails) {
        Cours cours = coursRepository.findById(id).orElseThrow(() -> new RuntimeException("Cours not found"));
        cours.setTheme(coursDetails.getTheme());
        cours.setNombreHeures(coursDetails.getNombreHeures());
        cours.setEnseignant(coursDetails.getEnseignant());
        return coursRepository.save(cours);
    }

    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }

    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }
}
