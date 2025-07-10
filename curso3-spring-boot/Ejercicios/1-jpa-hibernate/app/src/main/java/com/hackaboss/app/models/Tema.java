package com.hackaboss.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tema;

    private String nombre;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private  Curso curso;
}
