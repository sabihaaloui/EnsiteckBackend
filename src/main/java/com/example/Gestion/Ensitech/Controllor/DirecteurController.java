package com.example.Gestion.Ensitech.Controllor;

import com.example.Gestion.Ensitech.Entities.Directeur;
import com.example.Gestion.Ensitech.Services.DirecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/directeurs")
public class DirecteurController {
    @Autowired
    private DirecteurService directeurService;

    @PostMapping
    public Directeur createDirecteur(@RequestBody Directeur directeur) {
        return directeurService.createDirecteur(directeur);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Directeur> getDirecteur(@PathVariable Long id) {
        Optional<Directeur> directeur = directeurService.getDirecteur(id);
        return directeur.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Directeur> updateDirecteur(@PathVariable Long id, @RequestBody Directeur directeurDetails) {
        return ResponseEntity.ok(directeurService.updateDirecteur(id, directeurDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDirecteur(@PathVariable Long id) {
        directeurService.deleteDirecteur(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Directeur> getAllDirecteurs() {
        return directeurService.getAllDirecteurs();
    }
}