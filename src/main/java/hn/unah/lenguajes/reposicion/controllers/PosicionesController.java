package hn.unah.lenguajes.reposicion.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.reposicion.models.Posiciones;
import hn.unah.lenguajes.reposicion.service.PosicionesServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/posiciones")
public class PosicionesController {
    
    @Autowired
    private PosicionesServicio posicionesServicio;

    @GetMapping("/tabla")
    public List<Posiciones> obtenerPosiciones() {
        return this.posicionesServicio.tablaPosiciones();
    }
    

}
