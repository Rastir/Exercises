package com.aqualovers.apiAqualovers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apisaludos")
public class SaludoController {
    
    
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo desde una API";
    }
    
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre,
                                  @PathVariable int edad){
        return "Hola " + nombre + " tu edad es : " + edad;
    }
    
}
