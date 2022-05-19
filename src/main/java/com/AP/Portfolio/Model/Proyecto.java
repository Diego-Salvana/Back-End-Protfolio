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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String descripcion;
    private String link;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String descripcion, String link) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
    }

}
