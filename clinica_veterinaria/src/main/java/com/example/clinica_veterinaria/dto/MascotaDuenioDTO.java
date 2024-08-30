package com.example.clinica_veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenioDTO {
        
    private String nombreMascota;
    private String especie;
    private String raza;
    private String nomDuenio;
    private String apeDuenio;

    public MascotaDuenioDTO() {
    }

    public MascotaDuenioDTO(String nombreMascota, String especie, String raza, String nomDuenio, String apeDuenio) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.nomDuenio = nomDuenio;
        this.apeDuenio = apeDuenio;
    }

    
}
