package com.AP.Portfolio.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DatosPersonales {

    @Id
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    private String edad;
    private String acerca;

    public DatosPersonales() {
    }

    public DatosPersonales(String nombre, String apellido, String edad, String acerca) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.acerca = acerca;
    }

}
