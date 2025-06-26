package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {


    @JsonProperty("estudianteNMatricula")
    private int numero_matricula;
    @JsonProperty("estudianteNombre")
    private String nombre;
    @JsonProperty("estudianteApellido")
    private String apellido;
    @JsonProperty("estudianteFechaNacimiento")
    private Date fechaNacimiento;
}
