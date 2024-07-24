package com.example.Gestion.Ensitech.Repository;

import com.example.Gestion.Ensitech.Entities.Ensitech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnsitechRepository  extends JpaRepository<Ensitech,Long> {
}
