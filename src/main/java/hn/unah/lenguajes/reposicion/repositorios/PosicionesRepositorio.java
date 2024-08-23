package hn.unah.lenguajes.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.reposicion.models.Posiciones;

public interface PosicionesRepositorio extends JpaRepository<Posiciones, Long>{
    
}
