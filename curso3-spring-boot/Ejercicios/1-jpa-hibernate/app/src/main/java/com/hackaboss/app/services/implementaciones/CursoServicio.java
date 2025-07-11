package com.hackaboss.app.services.implementaciones;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Curso;
import com.hackaboss.app.models.Tema;
import com.hackaboss.app.repositories.ICursoRepository;
import com.hackaboss.app.services.interfaces.ICursoServicio;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoServicio implements ICursoServicio {

    @Autowired
    ICursoRepository repository;

    @Autowired
    ITemaServicio its;

    @Override
    public CursoDTO crearCurso(CursoDTO cursoDTO) {

        Curso cursoNuevo = new Curso();
        cursoNuevo.setNombre(cursoDTO.getNombre());
        cursoNuevo.setTipo_curso(cursoDTO.getTipo_curso());
        cursoNuevo.setFecha_finalizacion(cursoDTO.getFecha_finalizacion());

        List<Tema> temas = cursoDTO.getListaTemas().stream().map( temaDTO -> {
             Tema tema = new Tema();
             tema.setNombre(temaDTO.getNombre());
             tema.setDescripcion(temaDTO.getDescripcion());
             tema.setCurso(cursoNuevo);

             return tema;

        }).toList();
        cursoNuevo.setListaTemas(temas);

        cursoDTO = mapeoToDTO(cursoNuevo);
        repository.save(cursoNuevo);
        return cursoDTO;
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
