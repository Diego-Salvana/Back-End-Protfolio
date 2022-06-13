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
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String iconoHTML;
    private String titulo;
    private int porcentaje;

    public Habilidad() {
    }

    public Habilidad(Long id, String iconoHTML, String titulo, int porcentaje) {
        this.id = id;
        this.iconoHTML = iconoHTML;
        this.titulo = titulo;
        this.porcentaje = porcentaje;
    }

}
