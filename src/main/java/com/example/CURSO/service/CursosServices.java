package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.CursosModel;
import com.example.CURSO.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursosServices {

    @Autowired
    private CursosRepository cursosRepository;

    public List<CursosModel> buscarTodos(){
        return cursosRepository.findAll();
    }

    public Optional<CursosModel> buscarporId (Long id) {
        return cursosRepository.findById(id);
    }

    public CursosModel cadastra (CursosModel cursosModel){
        return cursosRepository.save(cursosModel);
    }

    public CursosModel alterarCursos(CursosModel cursosModel){
        return cursosRepository.save(cursosModel);

    }

    public void deleteId(Long id) {
        cursosRepository.deleteById(id);
    }
}

