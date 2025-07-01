package com.hackaboss.app.utils;

import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@ControllerAdvice
public class fechaValid {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity  manejarErroresValidacion (HttpMessageNotReadableException ex){
        //System.err.println(ex.getMessage());

        VueloRespuesta vRespuesta =  new VueloRespuesta(
                "La fecha es incorrecta (" + ex.getMessage() + ")" ,
                HttpStatus.NOT_FOUND.value(),
                LocalDate.now());

        return ResponseEntity.badRequest().body(vRespuesta);
    }

}
