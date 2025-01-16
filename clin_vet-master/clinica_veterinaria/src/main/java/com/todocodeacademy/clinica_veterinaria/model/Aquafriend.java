package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Aquafriend {
    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_aquafriend;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private int noVisit;
    private int profit;
    private int noReferals;
    private String foodAndBeverages;
    private String experience;
    private String butler;
    private String preference;
    private String alergies;
    private String notes;
    
    
}
