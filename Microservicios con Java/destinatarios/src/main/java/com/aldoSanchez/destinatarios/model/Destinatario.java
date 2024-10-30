package com.aldoSanchez.destinatarios.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Destinatario {
    
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String num_telefono;
    
}
