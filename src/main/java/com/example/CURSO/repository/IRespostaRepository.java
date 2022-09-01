package com.example.CURSO.repository;

import com.example.CURSO.model.enumeric.RespostaModel;
import com.example.CURSO.model.enumeric.enun.Categorias;
import com.example.CURSO.model.enumeric.enun.StatusTopico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRespostaRepository extends JpaRepository<RespostaModel, Long> {

    List<RespostaModel> findByStatusTopico(StatusTopico statusTopico);

    List<RespostaModel> findByCategorias(Categorias categorias);
}
