package com.example.combustible.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CombustibleController {
    
    @GetMapping("/combustible/{galones}")
    public String convertirGasolina(@PathVariable double galones){
        return "Buen día, usted necesita : " + (galones * 3.78541) + " litros de gasolina";
        
        
    }
    
}
