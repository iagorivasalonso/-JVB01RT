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

    @GetMapping("/obtener/{nombre}")
    public List<?> obtenerPorNombre(@PathVariable String nombre){
         return cursoServicioInterfaz.filtrarPorNombres(nombre);
    }


    @GetMapping("/temasCurso/{nombre}")
    public List<?> obtenerTemasCurso(@PathVariable String nombre){
        System.out.println("Entra=====================================");
        return cursoServicioInterfaz.ObtenerTemas(nombre);
    }

    @PutMapping("/{id}")
    public CursoDTO modificarCurso(@PathVariable int id,@RequestBody CursoDTO curso){
        return cursoServicioInterfaz.modificarCurso(id,curso);
    }
}
