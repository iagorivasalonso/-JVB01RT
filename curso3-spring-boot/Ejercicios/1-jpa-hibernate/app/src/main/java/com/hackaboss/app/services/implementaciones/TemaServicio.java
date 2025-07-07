package com.hackaboss.app.services.implementaciones;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Tema;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.stereotype.Service;

@Service
public class TemaServicio implements ITemaServicio {
    @Override
    public TemaDTO crearTema() {
        return null;
    }

    @Override
    public TemaDTO modificarTema(int id) {
        return null;
    }

    @Override
    public TemaDTO mapeoToDTO(Tema t) {
        return new TemaDTO(t.getId_tema(),t.getNombre(),t.getDescripcion());
    }

    @Override
    public Tema mapeoToOBJ(TemaDTO t) {
        return null;
    }
}
