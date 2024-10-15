package com.todocodeacademy.pacientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPaciente;
    private String dni;
    private String nombre;
    private String apellido;
    @Temporal (TemporalType.DATE)    
    private LocalDate fechaNac;
    private String telefono;

    public Paciente() {
    }

    public Paciente(Long idPaciente, String dni, String nombre, String apellido, LocalDate fechaNac, String telefono) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }
    
    
    
}
