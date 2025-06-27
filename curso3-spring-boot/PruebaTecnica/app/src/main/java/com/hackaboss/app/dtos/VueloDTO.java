package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VueloDTO {

    @JsonProperty("publicId")
    private int id;
    @JsonProperty("publicNombreVuelo")
    private String nombreVuelo;
    @JsonProperty("publicEmpresa")
    private String empresa;
    @JsonProperty("publicLugarSalida")
    private String lugarSalida;
    @JsonProperty("publicLugarLlegada")
    private String lugarLlegada;
    @JsonProperty("publicFechaSalida")
    private LocalDate fechaSalida;
    @JsonProperty("publicFechaLlegada")
    private LocalDate fechaLlegada;
}
