package com.hackaboss.app.utils;

import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDate;
import java.util.List;


@ControllerAdvice
public class fechaValid {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity  manejarErroresValidacion (HttpMessageNotReadableException ex){


        String [] capError = ex.getMessage().split("\\'");

        VueloRespuesta vRespuesta =  new VueloRespuesta(
                "Error: "+capError[1]+", no tiene formato de fecha",
                HttpStatus.NOT_FOUND.value(),
                LocalDate.now());

        return ResponseEntity.badRequest().body(vRespuesta);
    }

}
