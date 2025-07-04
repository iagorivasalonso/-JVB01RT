package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.services.interfaces.ICursoServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    public final ICursoServicio cursoServicioInterfaz;

    public CursoController(ICursoServicio cursoServicioInterfaz) {
        this.cursoServicioInterfaz = cursoServicioInterfaz;
    }

    @PostMapping("/nuevo")
    public CursoDTO nuevoCurso () {
        return cursoServicioInterfaz.crearCurso();
    }

    @GetMapping("/todos")
    public List<?> verCursos(){
      return cursoServicioInterfaz.listaCursos();
    }

    @GetMapping("/obtener{nombre}")
    public List<?> obtenerPorNombre(@PathVariable String nombre){
         return cursoServicioInterfaz.filtrarPorNombres(nombre);
    }


    @GetMapping("/temasCurso")
    public List<?> obtenerTemasCurso(){
        return cursoServicioInterfaz.ObtenerTemas();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificarCurso(@PathVariable int id){
        return cursoServicioInterfaz.modificarCurso(id);
    }
}
