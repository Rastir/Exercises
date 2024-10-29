package com.aldosanchez.microServiciosAutores.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
    
    private String nombre_completo;
    private String titulo;
    private LocalDate fecha_nac;
    
}
