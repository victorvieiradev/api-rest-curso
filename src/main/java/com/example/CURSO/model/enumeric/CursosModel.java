package com.example.CURSO.model.enumeric;

import com.example.CURSO.model.enumeric.enun.Categorias;
import com.example.CURSO.model.enumeric.enun.StatusTopico;
import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "cursos")

public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "categorias")
    @Enumerated(value = EnumType.STRING)
    private Categorias categorias;

    @Column(name = "statusTópicos")
    @Enumerated(value = EnumType .STRING)
    private StatusTopico statusTopico;

}
