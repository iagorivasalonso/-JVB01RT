package com.hackaboss.app.Ejercicio2.controllers;

import com.hackaboss.app.Ejercicio2.utils.UtilsDatos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codigoMorse")
public class datosController {

    UtilsDatos utilsDatos = new UtilsDatos();

    //http://localhost:8080/codigoMorse/verificar/a

    @GetMapping("/verificar/{entrada:[a-zA-Z\\s]+}")
    public String letra (@PathVariable String entrada){

        return utilsDatos.esLetra(entrada);
    }

    //http://localhost:8080/codigoMorse/verificar/2
    @GetMapping("/verificar/{entrada:[0-9]}")
    public String numeros (@PathVariable String entrada){
        return utilsDatos.esNumero(entrada) ;
    }


}
