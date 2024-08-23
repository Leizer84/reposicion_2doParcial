package hn.unah.lenguajes.reposicion.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "equipos")
@Data
public class Equipos {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoequipo")
    private long codigoEquipo;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "ataque")
    private Double ataque;

    @Column(name = "defensa")
    private Double defensa;

    @JsonIgnore
    @OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
    private Posiciones posiciones;

	
}
