package com.example.CURSO.controller;

import com.example.CURSO.model.enumeric.RespostaModel;
import com.example.CURSO.model.enumeric.TopicoModel;
import com.example.CURSO.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping(path = "/topico")
    public List<TopicoModel> buscarTodosOsTopicos(){
        return topicoService.buscarOsTopicosTodos();
    }
    @GetMapping(path = "/topico/{codigo}")
    public Optional<TopicoModel> buscarUmTopico(@PathVariable Long codigo){return topicoService.buscarTopicoEspecifico(codigo);
    }
    @PostMapping(path = "/topico")
    public TopicoModel cadastrarTopico(@RequestBody TopicoModel topicoCurso, RespostaModel respostaModel){return topicoService.cadastrarTopico(topicoCurso,respostaModel);
    }
    @PutMapping(path = "/topico/{codigo}")
    public TopicoModel buscarUmTopico(@RequestBody TopicoModel topicoModel){
        return topicoService.alterandoTopicoEspecifico(topicoModel);}
    @DeleteMapping(path = "/topico/{codigo}")
    public void deletandoTopico(@PathVariable Long codigo){topicoService.deletarTopico(codigo);
    }

}
