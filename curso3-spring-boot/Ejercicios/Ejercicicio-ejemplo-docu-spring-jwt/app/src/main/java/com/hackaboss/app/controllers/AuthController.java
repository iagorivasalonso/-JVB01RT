package com.hackaboss.app.controllers;

import com.hackaboss.app.dtos.AuthDTO;
import com.hackaboss.app.service.IJwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    IJwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthDTO request){
        //ira a un servicio para que busque al usuario y valide la contraseña

        String token = jwtService.generateToken(request.getUsername(), "hola mundo, poco original");

        return ResponseEntity.ok().body(Map.of("token",token));
    }
}
