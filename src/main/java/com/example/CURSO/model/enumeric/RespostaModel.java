package com.example.CURSO.model.enumeric;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "resposta")
public class RespostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 30, nullable = false)
    private String mensagem;

    @Column(length = 12, nullable = false)
    private LocalDate dataCriacao;

    @Column(length = 10)
    private boolean solucao = false;

    @Column(name = "status", length = 12)
    private String status;
}
