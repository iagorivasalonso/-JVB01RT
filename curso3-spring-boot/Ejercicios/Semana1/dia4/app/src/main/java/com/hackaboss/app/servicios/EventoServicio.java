package com.hackaboss.app.servicios;

import com.hackaboss.app.models.Evento;
import com.hackaboss.app.response.RespuestaEvento;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class EventoServicio {

    private final List<Evento> eventos = new ArrayList<>();

    public EventoServicio(){

        eventos.add(new Evento(1L, "fiestaVerano", "ddd", LocalDate.of(2025, 6, 30), LocalTime.of(20, 30)));
        eventos.add(new Evento(2L, "conciertoRock", "música en vivo", LocalDate.of(2025, 7, 10), LocalTime.of(19, 0)));
        eventos.add(new Evento(3L, "feriaGastronomica", "comida internacional", LocalDate.of(2025, 8, 5), LocalTime.of(12, 0)));
        eventos.add(new Evento(4L, "maratonCiudad", "evento deportivo", LocalDate.of(2025, 9, 15), LocalTime.of(8, 30)));
        eventos.add(new Evento(5L, "nocheCine", "proyección al aire libre", LocalDate.of(2025, 7, 25), LocalTime.of(21, 15)));
    }

    public List<Evento> listaEventos() {

        return this.eventos;
    }

    public Evento buscarEvento(Long id) {

        return this.eventos.stream().filter( Evento ->Evento.getId().equals(id))
                .findFirst().get();
    }

    public RespuestaEvento crearEvento(Evento evento) {

        try{
            evento.setId(this.eventos.size() + 1L);
            this.eventos.add(evento);

            return new RespuestaEvento("evento creado",201,"POST-OK");

        } catch (Exception e) {
            return new RespuestaEvento("evento No creado",201,"POST-ERROR");
        }
    }

    public ResponseEntity<?> crearEventoResposeEntity(Evento evento) {

        evento.setId(this.eventos.size() + 1L);
        this.eventos.add(evento);

        HttpHeaders headers = new HttpHeaders();
        headers.add("pass-token", "KJSDHJNSKJFDSFSD24FDF24FD24FD42DF");

        RespuestaEvento re = new RespuestaEvento("eventoGuardado", HttpStatus.CREATED.value(),"POS-OK");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body(re);
    }
}
