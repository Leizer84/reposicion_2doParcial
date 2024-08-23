package hn.unah.lenguajes.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.reposicion.models.Equipos;

@Repository
public interface EquiposRepositorio extends JpaRepository<Equipos, Long> {
    
}
