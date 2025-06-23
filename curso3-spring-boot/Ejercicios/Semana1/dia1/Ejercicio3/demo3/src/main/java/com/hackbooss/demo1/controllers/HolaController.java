package com.hackbooss.demo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String holaController(){
        return "¡Hola Mundo! \uD83D\uDC4F";
    }

}