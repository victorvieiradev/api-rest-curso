package com.example.CURSO.controller;


import com.example.CURSO.model.enumeric.CursosModel;
import com.example.CURSO.service.CursosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CursosController {

    @Autowired
    private CursosServices cursosServices;

    @GetMapping (path ="/cursos" )
    public List <CursosModel>  buscarTodos (){
        return cursosServices.buscarTodos();

    }

    @GetMapping (path ="/cursos/{id}" )
    public Optional<CursosModel> buscarPorId (@PathVariable long id){
        return cursosServices.buscarporId(id);
    }

    @PutMapping  (path = "/cursos/{id}" )
    public CursosModel atlerar (@RequestBody CursosModel cursosModel, @PathVariable Long io){
        return cursosServices.alterarCursos(cursosModel);

    }

    @PostMapping (path = "/cursos")
    public CursosModel cadastrrarCursos(@RequestBody CursosModel cursosModel, @PathVariable Long id){
        return cursosServices.cadastra(cursosModel);

    }
    @DeleteMapping(path = "/gerenciador/{id}")
    public  void deletarCursos(@PathVariable long id){
        cursosServices.deleteId(id);
    }


}
