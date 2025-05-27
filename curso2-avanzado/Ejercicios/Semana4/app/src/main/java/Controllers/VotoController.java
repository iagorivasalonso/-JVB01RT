package Controllers;

import entities.Voto;
import persistence.GenericoJPA;

import java.util.List;
import java.util.Map;

public class VotoController {
    private final GenericoJPA<Voto,Long>votoJPA;
    public VotoController(){
        this.votoJPA = new GenericoJPA<>(Voto.class);
    }
    
    public void create (String partido){
        Voto newVoto = new Voto();
        newVoto.setPartido(partido);
        votoJPA.create(newVoto);
    }

    public List<Voto> findAll() {
        return votoJPA.findAll();
    }
}
