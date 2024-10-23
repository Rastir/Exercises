package com.aldosanchez.microServiciosAutores.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_autor;
    private String nombre_completo;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_nac;
    
    
}
