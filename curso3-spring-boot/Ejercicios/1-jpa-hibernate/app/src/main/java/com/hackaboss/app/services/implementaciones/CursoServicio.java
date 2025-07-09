package com.hackaboss.app.services.implementaciones;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Curso;
import com.hackaboss.app.models.Tema;
import com.hackaboss.app.repositories.ICursoRepository;
import com.hackaboss.app.services.interfaces.ICursoServicio;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServicio implements ICursoServicio {

    @Autowired
    ICursoRepository repository;

    @Autowired
    ITemaServicio its;

    @Override
    public CursoDTO crearCurso() {
        return null;
    }

    @Override
    public List<CursoDTO> listaCursos() {
        List<Curso> cursos = repository.findAll();
        return cursos.stream()
                .map(this::mapeoToDTO)
                .toList();
    }

    @Override
    public List<CursoDTO> filtrarPorNombres(String nombre) {

        List<Curso> cursos = repository.findAll();

        return cursos.stream()
                .filter( c -> c.getNombre().equals(nombre))
                .map(this::mapeoToDTO)
                .toList();
    }

    @Override
    public List<TemaDTO> ObtenerTemas(String nombre) {

        List<Curso> cursos = repository.findAll();

        Curso cursoEncontrado = cursos.stream()
                .filter(c-> c.getNombre().equals(nombre)).findFirst().orElse(null);
        System.err.println(cursoEncontrado);
        List<TemaDTO> listaTemas = cursoEncontrado.getListaTemas()
                .stream().map(its::mapeoToDTO)
                .toList();

        return listaTemas;
    }

    @Override
    public CursoDTO modificarCurso(int id, CursoDTO c) {

        Boolean existe = repository.existsById(id);

        if(existe)
        {
            c.setId_curso(id);
            Curso curso = this.mapeoToOBJ(c);
            Curso cursoActualizado = repository.save(curso);
            System.err.println( cursoActualizado);
            return this.mapeoToDTO(cursoActualizado);
        }
        else
        {
            return new CursoDTO();
        }
    }

    @Override
    public CursoDTO mapeoToDTO(Curso c) {
        List<TemaDTO> temas = c.getListaTemas().stream().map(its::mapeoToDTO).toList();
        return new CursoDTO(c.getId_curso(),c.getNombre(),c.getTipo_curso(),c.getFecha_finalizacion(),temas);
    }

    @Override
    public Curso mapeoToOBJ(CursoDTO c) {
        List<Tema> temas = c.getListaTemas().stream().map(its::mapeoToOBJ).toList();
        return new Curso(c.getId_curso(),c.getNombre(),c.getTipo_curso(),c.getFecha_finalizacion(),temas);
    }
}
