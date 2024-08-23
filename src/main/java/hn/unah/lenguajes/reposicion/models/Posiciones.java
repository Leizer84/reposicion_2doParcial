package hn.unah.lenguajes.reposicion.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "posiciones")
@Data
public class Posiciones {

   
    @Id
    @Column(name = "codigoequipo")
    private long codigoEquipo;

    @Column(name = "empates")
    private int empates;

    @Column(name = "ganados")
    private int ganados;

    @Column(name = "perdidos")
    private int perdidos;

    @Column(name = "golesfavor")
    private int golesFavor;

    @Column(name = "golescontra")
    private int golesContra;

    @Column(name = "puntos")
    private int puntos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoequipo")
    private Equipos equipo;

}
