package com.hackaboss.app.Ejercicio1.controllers;

import com.hackaboss.app.Ejercicio1.utils.utilsRefran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/refranes")
public class refranController {

     utilsRefran utilsRefran = new utilsRefran();

    //    http://localhost:8080/refranes
    @GetMapping()
    public List<String> obtenerTodasLosRefranes () {
        return utilsRefran.obtenerTodos();
    }

    //    http://localhost:8080/refranes/aleatorio
    @GetMapping("/aleatorio")
    public String refranAleatorio () {
        return utilsRefran.obtenerAleatorio();
    }
}
