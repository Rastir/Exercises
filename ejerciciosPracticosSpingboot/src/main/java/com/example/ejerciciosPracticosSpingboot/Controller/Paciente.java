package com.example.ejerciciosPracticosSpingboot.Controller;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente {
    
    private long id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Paciente() {
    }

    public Paciente(long id, String dni, String nombre, String apellido, LocalDate fechaNac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
    
    
    
}
