package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CalificacionesDTO;
import com.hackaboss.app.dtos.EstudianteDTO;
import com.hackaboss.app.models.Calificaciones;
import com.hackaboss.app.models.Estudiante;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EstudianteCalificacionServicio  implements IEstudianteCalificacionServicio {

    private List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
    private List<CalificacionesDTO> calificaciones = new ArrayList<>();



    public EstudianteCalificacionServicio() {


        Estudiante e1 = new Estudiante(1001, "Luis", "González", new Date(102, 2, 15));    // 2002-03-15
        estudiantesDTO.add(mapeoEstudiantesDTO(e1));
        Estudiante e2 = new Estudiante(1002, "Ana", "Martínez", new Date(103, 6, 9));      // 2003-07-09
        estudiantesDTO.add(mapeoEstudiantesDTO(e2));
        Estudiante e3 = new Estudiante(1003, "Carlos", "Ramírez", new Date(101, 0, 25));   // 2001-01-25
        estudiantesDTO.add(mapeoEstudiantesDTO(e3));
        Estudiante e4 = new Estudiante(1004, "Lucía", "Fernández", new Date(104, 8, 5));   // 2004-09-05
        estudiantesDTO.add(mapeoEstudiantesDTO(e4));

        calificaciones.add(mapeoCalificacionesDTO(new Calificaciones(Arrays.asList(2.9,8.6),0.0,e1)));
        calificaciones.add(mapeoCalificacionesDTO(new Calificaciones(Arrays.asList(9.0, 7.5, 8.0), 0.0, e2)));
        calificaciones.add(mapeoCalificacionesDTO(new Calificaciones(Arrays.asList(6.5, 6.0), 0.0, e3)));
        calificaciones.add(mapeoCalificacionesDTO(new Calificaciones(Arrays.asList(9.0, 9.8, 9.9, 10.0), 0.0, e4)));
    }


    @Override
    public List<EstudianteDTO> listar() {

        return  this.mapeoListaEstudiantesDTO(this.estudiantesDTO);
    }

    @Override
    public double mediaEstudiante(int nMatricula) {

        Optional<EstudianteDTO> estudiante = this.estudiantesDTO.stream().filter(e -> e.getNumero_matricula()==nMatricula).findFirst();
        
        return calificaciones.stream()
                .filter(c -> c.getEstudiante().equals(estudiante.get()))
                .flatMap(c -> c.getCalificaciones().stream())
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public List<CalificacionesDTO> notasEstudiantes() {

        return this.calificaciones.stream()
                .map(c -> new CalificacionesDTO(
                        c.getCalificaciones(),
                        c.getPromedio(),
                        c.getEstudiante()
                ))
                .sorted(Comparator.comparing(CalificacionesDTO::getPromedio)) // ordenar por promedio si quieres
                .toList();
    }

    @Override
    public CalificacionesDTO mapeoCalificacionesDTO(Calificaciones c) {
        return new CalificacionesDTO(c.getCalificaciones(),c.getPromedio(),c.getEstudiante());
    }

    @Override
    public CalificacionesDTO mapeoCalificacionesOBJ(CalificacionesDTO cDTO) {
        return new CalificacionesDTO(cDTO.getCalificaciones(),cDTO.getPromedio(),cDTO.getEstudiante());
    }

    @Override
    public EstudianteDTO mapeoEstudiantesDTO(Estudiante e) {
        return new EstudianteDTO(e.getNumero_matricula(),e.getNombre(),e.getApellido(),e.getFechaNacimiento());
    }

    @Override
    public EstudianteDTO mapeoCalificacionesOBJ(EstudianteDTO eDTO) {
        return new EstudianteDTO(eDTO.getNumero_matricula(),eDTO.getNombre(),eDTO.getApellido(),eDTO.getFechaNacimiento());
    }

    public List<EstudianteDTO> mapeoListaEstudiantesDTO(List<EstudianteDTO> listaEstudiantes) {
        List<EstudianteDTO> listaDTO = new ArrayList<>();
        for (EstudianteDTO e : listaEstudiantes) {
            listaDTO.add(e);
        }
        return listaDTO;
    }

}
