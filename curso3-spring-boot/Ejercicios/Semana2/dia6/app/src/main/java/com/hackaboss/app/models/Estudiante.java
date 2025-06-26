package com.hackaboss.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Estudiante {

    private int numero_matricula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
}
