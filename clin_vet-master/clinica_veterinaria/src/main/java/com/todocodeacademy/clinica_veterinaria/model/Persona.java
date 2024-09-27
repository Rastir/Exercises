package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_persona;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private boolean isLal;
    private int noVisit;
    private String foodAndBeverages;
    private String experience;
    private String butler;
    private String preference;
    private String alergies;
    private String notes;
        
    @OneToMany
    private List<Aqualover> aquaLevel;

    public Persona() {
    }

    public Persona(Long id_persona, String name, String lastName, String email, int age, boolean isLal, int noVisit, String foodAndBeverages, String experience, String butler, String preference, String alergies, String notes, List<Aqualover> aquaLevel) {
        this.id_persona = id_persona;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isLal = isLal;
        this.noVisit = noVisit;
        this.foodAndBeverages = foodAndBeverages;
        this.experience = experience;
        this.butler = butler;
        this.preference = preference;
        this.alergies = alergies;
        this.notes = notes;
        this.aquaLevel = aquaLevel;
    }

}
