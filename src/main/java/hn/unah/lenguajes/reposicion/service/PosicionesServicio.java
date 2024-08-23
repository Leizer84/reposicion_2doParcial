package hn.unah.lenguajes.reposicion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.reposicion.models.Posiciones;
import hn.unah.lenguajes.reposicion.repositorios.PosicionesRepositorio;

@Service
public class PosicionesServicio {
    
    @Autowired
    private PosicionesRepositorio posicionesRepositorio;

    public List<Posiciones> tablaPosiciones(){
        return this.posicionesRepositorio.findAll();
    }

    public Posiciones crearPosicion(Posiciones posicion){
        return this.posicionesRepositorio.save(posicion);
    }
}
