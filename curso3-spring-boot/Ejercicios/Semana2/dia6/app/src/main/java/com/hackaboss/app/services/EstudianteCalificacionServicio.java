package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CalificacionesDTO;
import com.hackaboss.app.dtos.EstudianteDTO;
import com.hackaboss.app.models.Calificaciones;
import com.hackaboss.app.models.Estudiante;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EstudianteCalificacionServicio  implements IEstudianteCalificacionServicio {

    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Calificaciones> calificacionesDTO = new ArrayList<>();



    public EstudianteCalificacionServicio() {


        Estudiante e1 = new Estudiante(1001, "Luis", "González", new Date(102, 2, 15));    // 2002-03-15
        estudiantes.add(e1);
        Estudiante e2 = new Estudiante(1002, "Ana", "Martínez", new Date(103, 6, 9));      // 2003-07-09
        estudiantes.add(e2);
        Estudiante e3 = new Estudiante(1003, "Carlos", "Ramírez", new Date(101, 0, 25));   // 2001-01-25
        estudiantes.add(e3);
        Estudiante e4 = new Estudiante(1004, "Lucía", "Fernández", new Date(104, 8, 5));   // 2004-09-05
        estudiantes.add(e4);

        calificacionesDTO.add(new Calificaciones(Arrays.asList(2.9,8.6),0.0,e1));
        calificacionesDTO.add(new Calificaciones(Arrays.asList(9.0, 7.5, 8.0), 0.0, e2));
        calificacionesDTO.add(new Calificaciones(Arrays.asList(6.5, 6.0), 0.0, e3));
        calificacionesDTO.add(new Calificaciones(Arrays.asList(9.0, 9.8, 9.9, 10.0), 0.0, e4));
    }


    @Override
    public List<EstudianteDTO> listar() {

        return this.estudiantes.stream().map(this::mapeoEstudiantesDTO).toList();

    }

    @Override
    public double mediaEstudiante(int nMatricula) {

        Optional<Estudiante> estudiante = this.estudiantes.stream().filter(e -> e.getNumero_matricula()==nMatricula).findFirst();
        
        return calificacionesDTO.stream()
                .filter(c -> c.getEstudiante().equals(estudiante.get()))
                .flatMap(c -> c.getCalificaciones().stream())
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public List<CalificacionesDTO> notasEstudiantes() {

        return this.calificacionesDTO.stream()
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

}
