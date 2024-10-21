package com.aldosanchez.microServiciosIngredientes.model;

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

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ingrediente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ingrediente;
    private String nombre_ingrediente;
    @ElementCollection(fetch = FetchType.EAGER)
    private List <String> lista_platos;
    
    
}
