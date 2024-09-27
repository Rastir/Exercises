package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Aqualover {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_aqualover;
    private String perks;

    public Aqualover() {
    }

    public Aqualover(Long id_aqualover, String perks) {
        this.id_aqualover = id_aqualover;
        this.perks = perks;
    }

}
