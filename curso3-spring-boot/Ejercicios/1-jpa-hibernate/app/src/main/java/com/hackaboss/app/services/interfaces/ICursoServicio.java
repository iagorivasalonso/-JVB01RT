package com.hackaboss.app.services.interfaces;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.models.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICursoServicio {
    CursoDTO crearCurso(CursoDTO curso);

    List<?> listaCursos();

    List<?> filtrarPorNombres(String nombre);

    List<?> ObtenerTemas(String nombre);

    CursoDTO modificarCurso(int id, CursoDTO curso);




    //Todo: metodos para el mapeo
    CursoDTO mapeoToDTO(Curso c);

    Curso mapeoToOBJ(CursoDTO c);


}
