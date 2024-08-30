package com.example.areaTriangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trianguloController {
    
    @GetMapping ("/areaTriangulo")
    public String calcularArea (@RequestParam double base, double altura){
        
        return "Bienvenido tu el area del triangulo con base : " + "\n base 1  : " + base
                + "\n altura : " + altura
                + "\n Es de  : " + ((base * altura) / 2);
    }
    
}
