package com.example.combustible.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CombustibleController2 {
    
    @GetMapping("/galones")
    public String convertirGalones(@RequestParam double galones){
        return "Buen día, usted necesita : " + (galones * 3.78541) + " litros de gasolina aquí! ";
    }
}
