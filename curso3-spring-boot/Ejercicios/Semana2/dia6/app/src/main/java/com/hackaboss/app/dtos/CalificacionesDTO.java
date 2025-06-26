package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackaboss.app.models.Estudiante;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CalificacionesDTO {


    @JsonProperty("estudianteCalificaciones")
    private List<Double> calificaciones;
    @JsonProperty("estudiantePromedio")
    private double promedio;
    @JsonProperty("estudianteEstudiante")
    private Estudiante estudiante;
}
