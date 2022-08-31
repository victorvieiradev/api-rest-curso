package com.example.CURSO.repository;

import com.example.CURSO.model.enumeric.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<UsuarioModel, Long> {
}
