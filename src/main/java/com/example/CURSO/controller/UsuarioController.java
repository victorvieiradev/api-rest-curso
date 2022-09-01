package com.example.CURSO.controller;

import com.example.CURSO.model.enumeric.DadosUsuariosModel;
import com.example.CURSO.model.enumeric.ExibirUsuario;
import com.example.CURSO.model.enumeric.UsuarioModel;
import com.example.CURSO.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping(path = "/usuario")
    public List<ExibirUsuario> listarUsuariosCadastrados(){return usuarioService.listarUsuariosCadastrados();}
    @GetMapping(path = "/usuario/{id}")
    public Optional<UsuarioModel> buscarUsuarioPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }
    @DeleteMapping(path = "/usuario/{id}")
    public void excluirUsuarioPorId(@PathVariable Long id){
        usuarioService.excluirUsuarioPeloId(id);
    }
    @PostMapping(path = "/usuario")
    public UsuarioModel cadastrar(@RequestBody DadosUsuariosModel dados ){
        return usuarioService.cadastrarUsuario(dados);
    }
}
