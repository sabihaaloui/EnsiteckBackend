package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Enseignant;
import com.example.Gestion.Ensitech.Repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    @Autowired
    private EnseignantRepository enseignantRepository;

    public Enseignant createEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    public Optional<Enseignant> getEnseignant(Long id) {
        return enseignantRepository.findById(id);
    }

    public Enseignant updateEnseignant(Long id, Enseignant enseignantDetails) {
        Enseignant enseignant = enseignantRepository.findById(id).orElseThrow(() -> new RuntimeException("Enseignant not found"));
        enseignant.setNom(enseignantDetails.getNom());
        enseignant.setPrenom(enseignantDetails.getPrenom());
        enseignant.setEmail(enseignantDetails.getEmail());
        enseignant.setAdresse(enseignantDetails.getAdresse());
        enseignant.setTelephone(enseignantDetails.getTelephone());
        enseignant.setMatiere(enseignantDetails.getMatiere());
        return enseignantRepository.save(enseignant);
    }

    public void deleteEnseignant(Long id) {
        enseignantRepository.deleteById(id);
    }

    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }
}