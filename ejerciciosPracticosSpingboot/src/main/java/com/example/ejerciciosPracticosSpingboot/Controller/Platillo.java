package com.example.ejerciciosPracticosSpingboot.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Platillo {
    
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;

    public Platillo() {
    }

    public Platillo(int id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
    
}
