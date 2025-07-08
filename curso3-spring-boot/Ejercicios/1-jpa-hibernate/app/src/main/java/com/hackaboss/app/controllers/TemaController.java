package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Tema;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    private final ITemaServicio temaServicioInterfaz;

    public TemaController(ITemaServicio temaServicioInterfaz) {
        this.temaServicioInterfaz = temaServicioInterfaz;
    }

    @PostMapping("/nuevo")
    public TemaDTO nuevoTema (@RequestBody TemaDTO tema) {

        return temaServicioInterfaz.crearTema(tema);
    }

    @PutMapping("/{id}")
    public TemaDTO modificarTema(@PathVariable int id){
          return temaServicioInterfaz.modificarTema(id);
    }

}
