package com.example.CURSO.model.enumeric;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@Entity
@Getter
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

}
