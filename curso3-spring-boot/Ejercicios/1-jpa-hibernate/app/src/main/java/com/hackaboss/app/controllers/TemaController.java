package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    private final ITemaServicio temaServicioInterfaz;

    public TemaController(ITemaServicio temaServicioInterfaz) {
        this.temaServicioInterfaz = temaServicioInterfaz;
    }

    @PostMapping("/nuevo")
    public TemaDTO nuevoTema () {
        return temaServicioInterfaz.crearTema();
    }

    @PutMapping("/{id}")
    public TemaDTO modificarTema(@PathVariable int id){
          return temaServicioInterfaz.modificarTema(id);
    }

}
