package com.hackaboss.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificaciones {

     private List<Double> calificaciones;
     private double promedio;
     private Estudiante estudiante;

}
