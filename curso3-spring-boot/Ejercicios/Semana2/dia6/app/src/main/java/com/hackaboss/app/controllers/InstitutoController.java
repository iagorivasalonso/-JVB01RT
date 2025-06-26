package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.CalificacionesDTO;
import com.hackaboss.app.dtos.EstudianteDTO;
import com.hackaboss.app.models.Estudiante;
import com.hackaboss.app.services.EstudianteCalificacionServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class InstitutoController {

    EstudianteCalificacionServicio institutoServicio = new EstudianteCalificacionServicio();

    //http://localhost:8080/estudiantes
    @GetMapping("/estudiantes")
    public List<EstudianteDTO> obtenerTodos() {
        return institutoServicio.listar();
    }

    //http://localhost:8080/calificaciones/1001
    @GetMapping("/calificaciones/{nMatricula}")
    public double mediaEstudiante(@PathVariable int nMatricula) {

        return institutoServicio.mediaEstudiante(nMatricula);
    }
    @GetMapping("/calificaciones/ordenDesc")
    public List<CalificacionesDTO> califEstudiante() {

        return institutoServicio.notasEstudiantes();
    }

}
