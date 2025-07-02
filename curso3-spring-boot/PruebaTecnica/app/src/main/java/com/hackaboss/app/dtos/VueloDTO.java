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
    @NotNull(message = "El nombre del vuelo no puede ser null")
    private String nombreVuelo;
    @JsonProperty("publicEmpresa")
    @NotNull(message = "El nombre de la empresa no puede ser null")
    private String empresa;
    @JsonProperty("publicLugarSalida")
    @NotNull(message = "El lugar de salida no puede ser null")
    private String lugarSalida;
    @JsonProperty("publicLugarLlegada")
    @NotNull(message = "El lugar de llegada no puede ser null")
    private String lugarLlegada;
    @JsonProperty("publicFechaSalida")
    @NotNull(message = "La fecha de salida no puede ser null")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaSalida;
    @JsonProperty("publicFechaLlegada")
    @NotNull(message = "La fecha de salida no puede ser null")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaLlegada;
}
