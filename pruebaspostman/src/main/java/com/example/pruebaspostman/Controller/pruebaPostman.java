package com.example.pruebaspostman.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaPostman {
    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        
        System.out.println("Datos del cliente." + "\nNombre : " + cli.getNombre() 
                + "\nApellido : " + cli.getApellido());
        
    }
    
    
    
}
