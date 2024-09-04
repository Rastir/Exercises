package com.liveaqua.cala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private boolean isLal;
    private String alimentosYBebidas;
    private String experience;
    private String butler;
    private String preferencias;
    private String alergias;
    private String notas;
    
    
    @OneToOne
    @JoinColumn(name = "id_aqualover",referencedColumnName = "id_aqualover")
    private Aqualover aqualover;

    public Persona() {
    }

    public Persona(Long id, String name, String lastName, String email, int age, boolean isLal, String alimentosYBebidas, String experience, String butler, String preferencias, String alergias, String notas, Aqualover aqualover) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isLal = isLal;
        this.alimentosYBebidas = alimentosYBebidas;
        this.experience = experience;
        this.butler = butler;
        this.preferencias = preferencias;
        this.alergias = alergias;
        this.notas = notas;
        this.aqualover = aqualover;
    }

}
