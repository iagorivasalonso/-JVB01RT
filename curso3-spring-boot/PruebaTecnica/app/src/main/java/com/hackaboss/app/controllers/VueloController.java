package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.services.IVueloServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VueloController {

     private final IVueloServicio vueloServicioInterfaz;

    public VueloController(IVueloServicio vueloServicioInterfaz) {
        this.vueloServicioInterfaz = vueloServicioInterfaz;
    }

    @GetMapping("/vuelos")
    public List<VueloDTO> todosLosVuelos() {
        return this.vueloServicioInterfaz.todosLosVuelos();
    }

    @GetMapping("/vuelos/{id}")
    public VueloDTO busquedaVuelo(@PathVariable int id){
                return this.vueloServicioInterfaz.busquedaVuelo(id);
    }

    @PostMapping("/vuelos")
    public VueloDTO insertarVuelos(@RequestBody VueloDTO nuevoVuelo) {
          return this.vueloServicioInterfaz.insertarVuelos(nuevoVuelo);
    }

    @PutMapping ("/vuelos/{id}")
    public ResponseEntity<?> actualizarVuelo(@PathVariable int id) {
        return this.vueloServicioInterfaz.actualizarVuelo(id);
    }

    @DeleteMapping ("/vuelos/{id}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable int id) {
        return this.vueloServicioInterfaz.eliminarVuelo(id);
    }
}
