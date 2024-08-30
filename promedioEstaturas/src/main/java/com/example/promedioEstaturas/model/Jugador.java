package com.example.promedioEstaturas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Jugador {
    
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;   
    private double estatura;

    public Jugador() {
    }

    public Jugador(int id, String dni, String nombre, String apellido, int edad, int peso, double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    
    
}
