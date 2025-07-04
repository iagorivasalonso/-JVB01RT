package com.hackaboss.app.services.interfaces;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.models.Curso;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICursoServicio {
    CursoDTO crearCurso();

    List<?> listaCursos();

    List<?> filtrarPorNombres(String nombre);

    List<?> ObtenerTemas();

    ResponseEntity<?> modificarCurso(int id);




    //Todo: metodos para el mapeo
    CursoDTO mapeoToDTO(Curso c);

    Curso mapeoToOBJ(CursoDTO c);


}
