package com.hackaboss.app.services.interfaces;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Tema;

public interface ITemaServicio {

    TemaDTO crearTema(TemaDTO tema);

    TemaDTO modificarTema(int id, TemaDTO temaDTO);




    //Todo: metodos para el mapeo
    TemaDTO mapeoToDTO(Tema t);

    Tema mapeoToOBJ(TemaDTO t);
}
