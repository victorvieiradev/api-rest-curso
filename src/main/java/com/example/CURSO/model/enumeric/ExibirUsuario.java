package com.example.CURSO.model.enumeric;

import java.util.List;
import java.util.stream.Collectors;

public class ExibirUsuario {
    private Long id;
    private String nome;
    private String email;
    public ExibirUsuario(UsuarioModel usuario ){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
    public static List<ExibirUsuario> converter(List<UsuarioModel> usuario ){
        return usuario.stream().map(ExibirUsuario::new).collect(Collectors.toList());
    }
}
