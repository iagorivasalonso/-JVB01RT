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

    //    http://localhost:8080/vuelos
    @GetMapping("/vuelos")
    public ResponseEntity<?> todosLosVuelos(@RequestParam(required = false) String empresa,
                                          @RequestParam(required = false) String lugarLLegada,
                                          @RequestParam(required = false) String fechaLLegada) {
        return this.vueloServicioInterfaz.todosLosVuelos(empresa,lugarLLegada,fechaLLegada);
    }

    //    http://localhost:8080/vuelos/2
    @GetMapping("/vuelos/{id}")
    public ResponseEntity<?> busquedaVuelo(@PathVariable int id){
                return this.vueloServicioInterfaz.busquedaVuelo(id);
    }


    // http://localhost:8080/vuelos - POST -> enviar un JSON Vuelo
    @PostMapping("/vuelos")
    public ResponseEntity<?> insertarVuelos(@RequestBody @Valid VueloDTO nuevoVuelo) {
          return this.vueloServicioInterfaz.insertarVuelos(nuevoVuelo);
    }

    @PutMapping ("/vuelos/{id}")
    public ResponseEntity<VueloRespuesta> actualizarVuelo(@PathVariable int id, @RequestBody @Valid VueloDTO vueloActualizado) {
        return this.vueloServicioInterfaz.actualizarVuelo(id,vueloActualizado);
    }

    //  http://localhost:8080/vuelos/6 - DELETE Eliminar un recurso existente
    @DeleteMapping ("/vuelos/{id}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable int id) {
        return this.vueloServicioInterfaz.eliminarVuelo(id);
    }
}
