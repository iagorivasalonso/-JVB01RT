package com.hackaboss.app.controllers;
import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.response.VueloRespuesta;
import com.hackaboss.app.services.IVueloServicio;
import jakarta.validation.Valid;
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
    public ResponseEntity<?> todosLosVuelos(@RequestParam(required = false) String empresa,
                                          @RequestParam(required = false) String lugarLLegada,
                                          @RequestParam(required = false) String fechaLLegada) {

        return this.vueloServicioInterfaz.todosLosVuelos(empresa,lugarLLegada,fechaLLegada);
    }

    @GetMapping("/vuelos/{id}")
    public ResponseEntity<?> busquedaVuelo(@PathVariable int id){
                return this.vueloServicioInterfaz.busquedaVuelo(id);
    }

    @PostMapping("/vuelos")
    public ResponseEntity<?> insertarVuelos(@RequestBody @Valid VueloDTO nuevoVuelo) {
          return this.vueloServicioInterfaz.insertarVuelos(nuevoVuelo);
    }

    @PutMapping ("/vuelos/{id}")
    public ResponseEntity<VueloRespuesta> actualizarVuelo(@PathVariable int id, @RequestBody @Valid VueloDTO vueloActualizado) {
        return this.vueloServicioInterfaz.actualizarVuelo(id,vueloActualizado);
    }

    @DeleteMapping ("/vuelos/{id}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable int id) {
        return this.vueloServicioInterfaz.eliminarVuelo(id);
    }
}
