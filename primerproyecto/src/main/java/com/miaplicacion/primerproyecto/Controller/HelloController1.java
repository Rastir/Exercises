package com.miaplicacion.primerproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Holiwis mundo";
    }
    
     @GetMapping("/bye")
    public String sayBye(){
        return "Adiosiwis mundo";
    }
    
    @GetMapping("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Holiwis " + nombre;
    }
    
    @GetMapping("/hello/{nombre}/{edad}/{profesion}")
    public String sayHelloComplete(@PathVariable String nombre,
                                   @PathVariable int edad,
                                   @PathVariable String profesion){
        return "Hola " + nombre + "tu edad es " + edad + " y eres " + profesion;
        
    }
    
    @GetMapping("/suma/{numero1}/{numero2}")
    public String sayHelloComplete(@PathVariable double numero1,
                                   @PathVariable double numero2){
        return "Hola persona, la suma del numero " + numero1 + " mas el numero " + numero2
                + " es de : " + (numero1 + numero2);
        
    }
}
