package com.hackaboss.app.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VueloRespuesta {

    private String mensaje;
    private int estadoCodigo;
    private LocalDate fechaHora;


}
