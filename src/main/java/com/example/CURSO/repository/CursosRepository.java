package com.example.CURSO.repository;

import com.example.CURSO.model.enumeric.CursosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<CursosModel, Long> {
}
