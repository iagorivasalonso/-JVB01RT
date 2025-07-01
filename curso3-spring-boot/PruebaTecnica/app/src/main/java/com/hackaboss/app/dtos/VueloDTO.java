package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "La fecha de salida es obligatoria")
    @FutureOrPresent(message = "La fecha de llegada debe ser hoy o futura")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaSalida;
    @JsonProperty("publicFechaLlegada")
    @FutureOrPresent(message = "La fecha de llegada debe ser hoy o futura")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaLlegada;
}
