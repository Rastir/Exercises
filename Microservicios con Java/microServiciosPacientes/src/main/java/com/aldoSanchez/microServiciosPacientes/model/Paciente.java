package com.aldoSanchez.microServiciosPacientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPaciente;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private String telefono;

    public Paciente() {
    }

    public Paciente(Long idPaciente, String nombre, String apellido, Date fechaNac, String telefono) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
    }
    
}
