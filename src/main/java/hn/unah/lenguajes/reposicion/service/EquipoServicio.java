package hn.unah.lenguajes.reposicion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.reposicion.models.Equipos;
import hn.unah.lenguajes.reposicion.models.Posiciones;
import hn.unah.lenguajes.reposicion.repositorios.EquiposRepositorio;

@Service
public class EquipoServicio {
    
    @Autowired
    private EquiposRepositorio equiposRepositorio;

    public Equipos crearEquipo(Equipos equipo){
        return this.equiposRepositorio.save(equipo);
    }

    public List<Equipos> obtenerTodos(){
        return this.equiposRepositorio.findAll();
    }

    public String eliminar(Long equipo){
        this.equiposRepositorio.deleteById(equipo);
        return "Se ha eliminado";
    }

    public Equipos buscar(Long equipo){
        return this.equiposRepositorio.findById(equipo).get();
    }

}
