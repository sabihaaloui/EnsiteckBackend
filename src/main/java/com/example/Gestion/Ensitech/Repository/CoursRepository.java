package com.example.Gestion.Ensitech.Repository;

import com.example.Gestion.Ensitech.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
}
