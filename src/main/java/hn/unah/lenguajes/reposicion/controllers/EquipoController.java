package hn.unah.lenguajes.reposicion.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.reposicion.models.Equipos;
import hn.unah.lenguajes.reposicion.models.Posiciones;
import hn.unah.lenguajes.reposicion.service.EquipoServicio;
import jakarta.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    
    @Autowired
    private EquipoServicio equipoServicio;

    @GetMapping("/todos")
    public List<Equipos> obtenerTodos() {
        return this.equipoServicio.obtenerTodos();
    }

    @GetMapping("/buscar")
    public Equipos buscarTodos(@RequestParam long codigoEquipo) {
        return this.equipoServicio.buscar(codigoEquipo);
    }

    @PostMapping("/crear")
    public Equipos crearEquipo(@RequestBody Equipos equipo) {
        Posiciones posiciones = new Posiciones();
        posiciones.setEmpates(0);
        posiciones.setGanados(0);
        posiciones.setPerdidos(0);
        posiciones.setGolesFavor(0);
        posiciones.setGolesContra(0);
        posiciones.setPuntos(0);
        posiciones.setCodigoEquipo(equipo.getCodigoEquipo());
        return this.equipoServicio.crearEquipo(equipo);
    }

    @DeleteMapping("/eliminar")
    public String eliminar(@RequestParam long codigoEquipo){
        return this.equipoServicio.eliminar(codigoEquipo);
    }
    
    @GetMapping("/simular")
    public List<Equipos> simular() {
        int count = this.equipoServicio.obtenerTodos().size();
        List<Equipos> equipos = this.equipoServicio.obtenerTodos();
        System.out.println("Cantidad de equipos: " + count);
        if(count < 6){
            int i = 6 - count;
               for(int j = 0; j < i; j++){
                 Equipos equipo = new Equipos();
                 equipo.setNombre("Equipo " + (count + j + 1));
                 equipo.setAtaque((Double) (Math.random() * (100 - 40 + 1) + 40));
                 equipo.setDefensa((Double) (Math.random() * (100 - 40 + 1) + 40));
                 this.equipoServicio.crearEquipo(equipo);
               } 
         }

         for(int i=0; i<count; i++){
            for (int j=0; j<count; j++) {
                if (i!=j) {
                    System.out.printf(equipos.get(i).getNombre().toString(), equipos.get(j).getNombre().toString() , "\n");
                }
    
            }
         }
        return this.equipoServicio.obtenerTodos();
    }

}
