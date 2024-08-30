package com.example.DTO.Controller;

import com.example.DTO.Inquilino;
import com.example.DTO.Propiedad;
import com.example.DTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {
    
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad (@PathVariable Long id){
        
        Inquilino inqui = new Inquilino(123457L, "123456", "aldo", "Sanchez", "Pitudo");
        Propiedad propi = new Propiedad(123456L, "Casa", "un lugar", 2000.0, 5000.0);
        
        PropiedadDTO propiDTO = new PropiedadDTO();
        
        propiDTO.setId_propiedad(propi.getId_propiedad());
        propiDTO.setTipo(propi.getTipo_propiedad());
        propiDTO.setDireccion(propi.getDireccion());
        propiDTO.setValor_alquiler(propi.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());
        
        return propiDTO;
        
        
    }
    
}
