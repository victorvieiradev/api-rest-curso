package com.example.CURSO.controller;

import com.example.CURSO.model.enumeric.DadosUsuariosModel;
import com.example.CURSO.model.enumeric.RespostaModel;
import com.example.CURSO.model.enumeric.TopicoModel;
import com.example.CURSO.model.enumeric.UsuarioModel;
import com.example.CURSO.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @GetMapping(path = "/resposta")
    public List<RespostaModel> buscarTodasRespostas(){
        return respostaService.buscarTodasRespostas();
    }

    @GetMapping(path = "/resposta/{id}")
    public Optional<RespostaModel> buscarRespostaPorId(@PathVariable Long id){
        return respostaService.buscarRespostaPorId(id);
    }

    @DeleteMapping(path = "/resposta/{id}")
    public void excluirRespostaPorId(@PathVariable Long id){

        respostaService.deletarResposta(id);
    }

    @PostMapping(path = "/resposta")
    public RespostaModel cadastrarResposta (@RequestBody RespostaModel respostaModel){
        return respostaService.cadastrarResposta(respostaModel);
    }

    @PutMapping(path = "/resposta/{codigo}")
    public Optional<RespostaModel> buscarRespostaPoId(@RequestBody RespostaModel alterandoStatusMensagem){
        return null;
    }

}
