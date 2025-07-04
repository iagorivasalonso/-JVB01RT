package com.hackaboss.app.services.implementaciones;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.models.Curso;
import com.hackaboss.app.services.interfaces.ICursoServicio;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CursoServicio implements ICursoServicio {
    @Override
    public CursoDTO crearCurso() {
        return null;
    }

    @Override
    public List<?> listaCursos() {
        return List.of();
    }

    @Override
    public List<?> filtrarPorNombres(String nombre) {
        return List.of();
    }

    @Override
    public List<?> ObtenerTemas() {
        return List.of();
    }

    @Override
    public ResponseEntity<?> modificarCurso(int id) {
        return null;
    }

    @Override
    public CursoDTO mapeoToDTO(Curso c) {
        return null;
    }

    @Override
    public Curso mapeoToOBJ(CursoDTO c) {
        return null;
    }
}
