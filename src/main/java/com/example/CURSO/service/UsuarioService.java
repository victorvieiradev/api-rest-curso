package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.UsuarioModel;
import com.example.CURSO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<UsuarioModel> listarUsuariosCadastrados(){
        return  usuarioRepository.findAll();
    }

}
