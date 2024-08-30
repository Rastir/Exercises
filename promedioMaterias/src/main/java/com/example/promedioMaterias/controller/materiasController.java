package com.example.promedioMaterias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class materiasController {
    
    @GetMapping ("/materias")
    public String calcularPromedio (@RequestParam double calificacion, double calificacion2, double calificacion3){
        
        return "Bienvenido tu calificacion es de : " + "\n calificacion 1  : " + calificacion
                + "\n calificacion 2  : " + calificacion2
                + "\n calificacion 3  : " + calificacion3
                + "\n Promedio   : " + ((calificacion + calificacion2 + calificacion3) / 3);
    }   
}
