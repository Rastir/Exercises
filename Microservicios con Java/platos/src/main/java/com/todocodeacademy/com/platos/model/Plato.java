package com.todocodeacademy.com.platos.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {
    
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long num_plato;
    private String nombre;
    private Double precio;
    private String descripcion;
    @ElementCollection(fetch = FetchType.EAGER)
     private List<String> listaIngredientes;
    
}
