package com.example.Gestion.Ensitech.Services;

import com.example.Gestion.Ensitech.Entities.Responsable;
import com.example.Gestion.Ensitech.Repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ResponsableService {
    @Autowired
    private ResponsableRepository responsableRepository;

    public Responsable createResponsable(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    public Optional<Responsable> getResponsable(Long id) {
        return responsableRepository.findById(id);
    }
/*
    public Responsable updateResponsable(Long id, Responsable responsable) {
        Responsable responsable = Responsable.findById(id).orElseThrow(() -> new RuntimeException("Responsable not found"));
        responsable.setNom(responsable.getNom());
        responsable.setPrenom(responsable.getPrenom());
        responsable.setEmail(responsable.getEmail());
        responsable.setAdresse(responsable.getAdresse());
        responsable.setTelephone(responsable.getTelephone());
        return responsable.save(responsable);
    }
*/
    public void deleteResponsableEtudes(Long id) {
        responsableRepository.deleteById(id);
    }

    public List<Responsable> getAllResponsableEtudes() {
        return responsableRepository.findAll();
    }

}
