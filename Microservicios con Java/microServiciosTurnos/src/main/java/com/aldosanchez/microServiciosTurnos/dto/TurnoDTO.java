
package com.aldosanchez.microServiciosTurnos.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurnoDTO {
    
    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;
    
    
}
