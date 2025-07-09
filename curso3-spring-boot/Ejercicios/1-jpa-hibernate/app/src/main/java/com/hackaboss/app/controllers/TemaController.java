package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/temas")
public class TemaController {

    private final ITemaServicio temaServicioInterfaz;

    public TemaController(ITemaServicio temaServicioInterfaz) {
        this.temaServicioInterfaz = temaServicioInterfaz;
    }

    @PostMapping("/nuevo")
    public TemaDTO nuevoTema (@RequestBody TemaDTO t) {

        return temaServicioInterfaz.crearTema(t);
    }

    @PutMapping("/{id}")
    public TemaDTO modificarTema(@PathVariable int id,@RequestBody TemaDTO tema){
          return temaServicioInterfaz.modificarTema(id,tema);
    }

}
