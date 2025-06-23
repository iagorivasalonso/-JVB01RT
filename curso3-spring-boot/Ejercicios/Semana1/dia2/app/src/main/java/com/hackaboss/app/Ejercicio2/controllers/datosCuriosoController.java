package com.hackaboss.app.Ejercicio2.controllers;

import com.hackaboss.app.Ejercicio2.utils.utilsDatoCurioso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datoCurioso")
public class datosCuriosoController {

    utilsDatoCurioso utilsDatoCurioso = new utilsDatoCurioso();

    //     http://localhost:8080/datoCurioso
    @GetMapping()
    public List<String> obtenerTodosDatosCuriosos () {
         return utilsDatoCurioso.obtenerTodos();
    }

    // http://localhost:8080/datoCurioso/aleatorio
    @GetMapping("/aleatorio")
    public String datoCuriosoAleatorio() {
        return utilsDatoCurioso.obtenerAleatorio();
    }
}
