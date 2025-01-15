package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Vip {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_vip;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private String foodAndBeverages;
    private String experience;
    private String butler;
    private String preference;
    private String alergies;
    private String notes;
    
    
}
