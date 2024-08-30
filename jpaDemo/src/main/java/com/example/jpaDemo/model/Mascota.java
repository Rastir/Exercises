package com.example.jpaDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String raza;
    private String especie;
    private String color;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String raza, String especie, String color) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.color = color;
    }
    
    
    
    
    
    
}
