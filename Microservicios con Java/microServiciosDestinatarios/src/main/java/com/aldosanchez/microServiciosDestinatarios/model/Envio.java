package com.aldosanchez.microServiciosDestinatarios.model;

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
public class Envio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_envio;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_envio;
    private String status;
    private String descripcion;
    
}
