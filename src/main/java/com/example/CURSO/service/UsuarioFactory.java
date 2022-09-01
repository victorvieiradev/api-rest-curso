package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.DadosUsuariosModel;
import com.example.CURSO.model.enumeric.UsuarioModel;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFactory {
    public UsuarioModel novoUsuario(DadosUsuariosModel dados ){
        UsuarioModel usuario = new UsuarioModel();
        usuario.setId(dados.getId());
        usuario.setNome(dados.getNome());
        usuario.setEmail(dados.getEmail());
        usuario.setSenha(dados.getSenha());
        return usuario;
    }

}