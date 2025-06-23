package com.hackaboss.app.Ejercicio1.controllers;

import com.hackaboss.app.Ejercicio1.utils.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversion")
public class conversorControllers {

    Conversor conversor = new Conversor();

    @GetMapping("/{numero}")
    public String conversion(@PathVariable int numero) {
            return Conversor.convertirUnidades(numero);
    }
}
