package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CalificacionesDTO;
import com.hackaboss.app.dtos.EstudianteDTO;
import com.hackaboss.app.models.Calificaciones;
import com.hackaboss.app.models.Estudiante;

import java.util.List;

public interface IEstudianteCalificacionServicio {

    List<Estudiante> listar();
    double mediaEstudiante(int nMatricula);
    List<CalificacionesDTO> notasEstudiantes();

    //Todo: metodos para el mapeo
    CalificacionesDTO mapeoCalificacionesDTO(Calificaciones c);

    CalificacionesDTO mapeoCalificacionesOBJ(CalificacionesDTO cDTO);

    EstudianteDTO mapeoCalificacionesDTO(EstudianteDTO e);

    EstudianteDTO mapeoCalificacionesOBJ(EstudianteDTO eDTO);
}
