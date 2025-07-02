package com.hackaboss.app.utils;

import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDate;


@ControllerAdvice
public class Exeptions {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity  manejarErroresValidacion (HttpMessageNotReadableException ex){


        String [] capError = ex.getMessage().split("\\'");

        VueloRespuesta vRespuesta =  new VueloRespuesta(
                "Error: "+capError[1]+", no tiene formato de fecha",
                HttpStatus.NOT_FOUND.value(),
                LocalDate.now());

        return ResponseEntity.badRequest().body(vRespuesta);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> manejarErroresValidacion(MethodArgumentNotValidException ex) {

        String [] capError = ex.getMessage().split("message");
        int ultimaposicion = capError.length-1;

        String error0=capError[ultimaposicion];
        String error= error0.substring(2,error0.length()-3);
        System.err.println(error);

        VueloRespuesta vRespuesta =  new VueloRespuesta(
                error,
                HttpStatus.NOT_FOUND.value(),
                LocalDate.now());

        return ResponseEntity.badRequest().body(vRespuesta);
    }

}
