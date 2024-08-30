package com.flacodev.bazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_cliente;
    private String Nombre;
    private String Apellido;
    private String dni;

    public Cliente() {
    }

    public Cliente(Long id_cliente, String Nombre, String Apellido, String dni) {
        this.id_cliente = id_cliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
    }
    
    
}
