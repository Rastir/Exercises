package com.example.pruebaspostman.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaPostmanResponseEntity {
    
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
         
        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);
    }
    
}
