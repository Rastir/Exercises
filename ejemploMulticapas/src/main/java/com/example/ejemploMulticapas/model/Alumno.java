package com.example.ejemploMulticapas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {
    }
    
    
    
}
