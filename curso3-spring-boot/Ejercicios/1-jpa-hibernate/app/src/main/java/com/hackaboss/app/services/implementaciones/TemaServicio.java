package com.hackaboss.app.services.implementaciones;

import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.models.Tema;
import com.hackaboss.app.repositories.ITemaRepository;
import com.hackaboss.app.services.interfaces.ITemaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TemaServicio implements ITemaServicio {

    @Autowired
    ITemaRepository repository;

    @Override
    public TemaDTO crearTema(TemaDTO temaDTO) {

        Tema tema = new Tema();
        tema.setNombre(temaDTO.getNombre());
        tema.setDescripcion(temaDTO.getDescripcion());

        Tema temaGuardado = repository.save(tema);
        return mapeoToDTO(temaGuardado);
    }

    @Override
    public TemaDTO modificarTema(int id, TemaDTO t) {

        Boolean existe = repository.existsById(id);

        if(existe)
        {
            t.setId_tema(id);
            Tema tema = this.mapeoToOBJ(t);
            Tema temaActualizado = repository.save(tema);
            return this.mapeoToDTO(temaActualizado);
        }
        else
        {
            return new TemaDTO();
        }

    }

    @Override
    public TemaDTO mapeoToDTO(Tema t) {
        return new TemaDTO(t.getId_tema(),t.getNombre(),t.getDescripcion());
    }

    @Override
    public Tema mapeoToOBJ(TemaDTO t) {
        return new Tema(t.getId_tema(),t.getNombre(),t.getDescripcion());
    }
}
