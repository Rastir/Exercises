package com.academiaFlaca.ejercicios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre;
    private String descripcion;
   
    public Tema(){
    }

    public Tema(Long id_tema, String nombre, String descripcion) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
