package com.example.CURSO.controller;

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
    public TopicoModel cadastrarTopico(@RequestBody TopicoModel topicoCurso){return topicoService.cadastrarTopico(topicoCurso);
    }

    @PutMapping(path = "/topico/{codigo}")
    public Optional<TopicoModel> buscarUmTopico(@RequestBody TopicoModel alterando){return null;} //topicoService;

    @DeleteMapping(path = "/topico/{codigo}")
    public void deletandoTopico(@PathVariable Long codigo){topicoService.deletarTopico(codigo);
    }

}
