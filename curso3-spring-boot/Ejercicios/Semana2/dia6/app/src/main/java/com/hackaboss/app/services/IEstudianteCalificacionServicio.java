package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CalificacionesDTO;
import com.hackaboss.app.dtos.EstudianteDTO;
import com.hackaboss.app.models.Calificaciones;
import com.hackaboss.app.models.Estudiante;

import java.util.List;

public interface IEstudianteCalificacionServicio {

    List<EstudianteDTO> listar();
    double mediaEstudiante(int nMatricula);
    List<CalificacionesDTO> notasEstudiantes();

    //Todo: metodos para el mapeo
    CalificacionesDTO mapeoCalificacionesDTO(Calificaciones c);

    CalificacionesDTO mapeoCalificacionesOBJ(CalificacionesDTO cDTO);

    EstudianteDTO mapeoEstudiantesDTO(Estudiante e);

}
