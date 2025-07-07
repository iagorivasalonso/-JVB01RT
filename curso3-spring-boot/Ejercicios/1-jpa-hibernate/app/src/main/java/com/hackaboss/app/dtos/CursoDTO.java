package com.hackaboss.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackaboss.app.models.Tema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CursoDTO {

    @JsonProperty("cursoId")
    private int id_curso;
    @JsonProperty("cursoNombre")
    private String nombre;
    @JsonProperty("cursoTipo")
    private String tipo_curso;
    @JsonProperty("cursoFechaFin")
    private Date fecha_finalizacion;
    @JsonProperty("cursoListaTemas")
    private List<TemaDTO> listaTemas;
}
