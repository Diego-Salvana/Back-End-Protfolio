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
public class ExperienciaLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String empresa;
    private String funcion;
    private String anio;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(int id, String empresa, String funcion, String anio) {
        this.id = id;
        this.empresa = empresa;
        this.funcion = funcion;
        this.anio = anio;
    }

}
