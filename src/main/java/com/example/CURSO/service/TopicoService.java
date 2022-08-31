package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.TopicoModel;
import com.example.CURSO.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public List<TopicoModel> buscarOsTopicos(){
        return topicoRepository.findAll();

    }

    public Optional<TopicoModel> buscarTopicoEspecifico(Long idConta){
        return topicoRepository.findById(idConta);
    }

    public TopicoModel cadastrarTopico (TopicoModel topicoModel){
        topicoModel.getTitulo();
        topicoModel.getMensagem();
        topicoModel.getDataCriacao();

        return topicoRepository.save(topicoModel);
    }

    public void deletarTopico(Long codigo){topicoRepository.deleteById(codigo);
    }

}
