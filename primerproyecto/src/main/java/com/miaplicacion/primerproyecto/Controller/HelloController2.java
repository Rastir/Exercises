package com.miaplicacion.primerproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController2 {

    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,
                            @RequestParam int edad,
                            @RequestParam String profesion){
        
        return "Hola mundo! Tu nombre es : " + nombre + " y tu edad es : " 
                + edad + " y eres " + profesion;
    }
    
    @GetMapping("/imc")
    public String calcularImc(@RequestParam double imc){
        
        if (imc > 1 && imc <= 18.5){
            return "Tu peso es insuficiente "; 
        } 
        else if (imc >= 18.6 && imc <= 24.9) {
            return "Tu peso es normal! ";
        }    
        else if (imc >= 25.0 && imc <= 29.9) {
            return "Tienes sobrepeso! ";
        }
        else if (imc >= 30.0 ){
            return "Tienes sobrepeso! ";
        }
        else {
            return "Valor de IMC no valido..... joto";            
        } 
    }
    
    
}
