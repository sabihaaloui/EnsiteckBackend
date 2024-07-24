package com.example.Gestion.Ensitech.Controllor;

import com.example.Gestion.Ensitech.Entities.Ensitech;
import com.example.Gestion.Ensitech.Services.EnsitechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping("/api/ecoles")
    public class EnsitechController {
    @Autowired
    private EnsitechService ecoleService;

    @PostMapping
    public Ensitech createEcole(@RequestBody Ensitech ecole) {
        return ecoleService.createEcole(ecole);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ensitech> getEcole(@PathVariable Long id) {
        Optional<Ensitech> ecole = ecoleService.getEcole(id);
        return ecole.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
/*
    @PutMapping("/{id}")
    public ResponseEntity<Ensitech> updateEnsitech(@PathVariable Long id, @RequestBody Ensitech ensitech) {
        return ResponseEntity.ok(EnsitechService.updateEnsitech(id,ensitech));
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEcole(@PathVariable Long id) {
        ecoleService.deleteEnsitech(id);
        return ResponseEntity.noContent().build();
    }
/*
    @GetMapping
    public List<Ensitech> getAllEcoles() {
        return ecoleService.getAllEnsitech();
    }

 */
}