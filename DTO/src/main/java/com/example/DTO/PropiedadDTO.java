package com.example.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropiedadDTO {
    
    private Long id_propiedad;
    private String tipo;
    private String direccion;
    private Double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;

    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id_propiedad, String tipo, String direccion, Double valor_alquiler, String nombre_inquilino, String apellido_inquilino) {
        this.id_propiedad = id_propiedad;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre_inquilino = nombre_inquilino;
        this.apellido_inquilino = apellido_inquilino;
    }
    
    
    
}
