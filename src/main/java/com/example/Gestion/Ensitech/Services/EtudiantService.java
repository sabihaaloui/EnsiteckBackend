package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Etudiant;
import com.example.Gestion.Ensitech.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Optional<Etudiant> getEtudiant(Long id) {
        return etudiantRepository.findById(id);
    }

    public Etudiant updateEtudiant(Long id, Etudiant etudiantDetails) {
        Etudiant etudiant = etudiantRepository.findById(id).orElseThrow(() -> new RuntimeException("Etudiant not found"));
        etudiant.setNom(etudiantDetails.getNom());
        etudiant.setPrenom(etudiantDetails.getPrenom());
        etudiant.setEmail(etudiantDetails.getEmail());
        etudiant.setAdresse(etudiantDetails.getAdresse());
        etudiant.setTelephone(etudiantDetails.getTelephone());
        etudiant.setDateNaissance(etudiantDetails.getDateNaissance());
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}