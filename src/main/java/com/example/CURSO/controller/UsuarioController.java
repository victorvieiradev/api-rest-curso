package com.example.CURSO.controller;

import com.example.CURSO.model.enumeric.UsuarioModel;
import com.example.CURSO.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping(path = "/usuario")
    public List<UsuarioModel> listarUsuariosCadastrados(){
        return usuarioService.listarUsuariosCadastrados()
    }
    @GetMapping(path = "/usuario/{id}")
    public Optional<UsuarioModel> buscarUsuarioPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }
    @DeleteMapping(path = "/usuario/{id}")
    public void excluirUsuarioPorId(@PathVariable Long id){
        usuarioService.excluirUsuarioPeloId(id);
    }
    
}
