package com.hackaboss.app.controllers;

import com.hackaboss.app.models.Evento;
import com.hackaboss.app.response.RespuestaEvento;
import com.hackaboss.app.servicios.EventoServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/eventos")
@RestController
public class EventoController {

    private final  EventoServicio servicio = new EventoServicio();

    //http://localhost:8080/eventos/todos
    @GetMapping("/todos")
    public List<Evento> listar() {

        return servicio.listaEventos();
    }

    //http://localhost:8080/eventos/2
    @GetMapping("/{id}")
    public Evento buscarEvento(@PathVariable Long id) {

        return servicio.buscarEvento(id);
    }


    //http://localhost:8080/eventos/nuevo
    @PostMapping
    public RespuestaEvento crearEvento(@RequestBody Evento evento){
        return servicio.crearEvento(evento);
    }


    //http://localhost:8080/eventos/nuevo POST -> enviar JSON evento
    @PostMapping("/nuevo")
    public ResponseEntity<?> crearEventoEntity(@RequestBody Evento evento) {
        return servicio.crearEventoResposeEntity(evento);
    }

    //http://localhost:8080/eventos/2
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarEvento (@PathVariable Long id, @RequestBody Evento eventoModificar){
        return ResponseEntity.ok(servicio.actualizarEvento(id,eventoModificar));
    }

    //http://localhost:8080/eventos/6 - PATH modificar el recurso parcialmente
    @PatchMapping("/{id}")
    public ResponseEntity<?>pathEvento(@PathVariable Long id, @RequestBody Evento eventoModificar) {
        return ResponseEntity.ok(servicio.modificarEvento(id,eventoModificar));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>eliminarEvento(@PathVariable Long id) {
        return servicio.eliminarEvento(id);
    }
}
