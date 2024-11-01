package com.aldoSanchez.envios.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvioDTO {
    
    private LocalDate fecha_envio;
    private String status;
    private String descripcion;
    private String dniDestinatario;
    
}
