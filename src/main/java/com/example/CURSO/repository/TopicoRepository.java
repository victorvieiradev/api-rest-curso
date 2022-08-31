package com.example.CURSO.repository;

import com.example.CURSO.model.enumeric.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository <TopicoModel, Long> {

}
