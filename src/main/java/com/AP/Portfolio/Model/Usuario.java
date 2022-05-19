
package com.AP.Portfolio.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String usuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Long id, String usuario, String contraseña) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contraseña;
    }
    
    
    
}
