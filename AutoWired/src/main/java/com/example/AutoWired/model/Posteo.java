package com.example.AutoWired.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Posteo {
    
    private Long id;
    private String nombre;
    private String titulo;

    public Posteo(Long id, String nombre, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
    }
    
    
    
}
