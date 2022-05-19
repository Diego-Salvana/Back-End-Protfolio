package com.AP.Portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String institucion;
    private String carrera;
    private String estado;
 

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String carrera, String estado) {
        this.id = id;
        this.institucion = institucion;
        this.carrera = carrera;
        this.estado = estado;
    }

}


