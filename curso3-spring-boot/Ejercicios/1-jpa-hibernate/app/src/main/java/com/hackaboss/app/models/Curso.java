package com.hackaboss.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;

    private String nombre;

    private String tipo_curso;

    private Date fecha_finalizacion;


    //relaciones
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Tema> listaTemas;

}
