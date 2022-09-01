package com.example.CURSO.model.enumeric;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

//@AllArgsConstructor
@Entity
@Getter
//@NoArgsConstructor
@Setter
@Table(name = "topico")

public class TopicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 15, nullable = false)
    private String titulo;

    @Column(length = 15, nullable = false)
    private String mensagem;

    @Column(length = 15, nullable = false)
    private LocalDate dataCriacao;

    public TopicoModel(Long codigo, String titulo, String mensagem, LocalDate dataCriacao){
        this.codigo=codigo;
        this.titulo=titulo;
        this.mensagem=mensagem;
        this.dataCriacao=dataCriacao;

        if(this.getDataCriacao()==null){
            //LocalDate dataCriacao = LocalDate.now();
            this.setDataCriacao(LocalDate.now());
        }
    }


}





