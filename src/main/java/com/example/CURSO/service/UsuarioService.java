package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.UsuarioModel;
import com.example.CURSO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<UsuarioModel> listarUsuariosCadastrados(){
        return  usuarioRepository.findAll();
    }
    public void excluirUsuarioPeloId(Long id){
        return usuarioRepository.deleteById(id);
    }
    public Optional<UsuarioModel> buscarPorId(Long id){
        return usuarioRepository.findById(id);
    }


}
