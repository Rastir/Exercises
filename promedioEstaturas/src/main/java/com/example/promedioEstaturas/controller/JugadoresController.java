package com.example.promedioEstaturas.controller;

import com.example.promedioEstaturas.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadoresController {
    
    @PostMapping("/jugadores")
    public String calcularPromedio(@RequestBody List<Jugador> listaJugadores){
        
        double suma_estaturas = 0.0;
        double promedio_estaturas = 0.0;
        
        List<Jugador> listaJuga = new ArrayList<Jugador>();
        listaJuga = listaJugadores;
        
        for (Jugador jug : listaJuga){
            
            suma_estaturas = suma_estaturas + jug.getEstatura();
        }
        
        promedio_estaturas = suma_estaturas / (listaJuga.size());
        
        return "Jugadores registrados correctamente. El promedio de estatura de los jugadores es de : " + promedio_estaturas;
    }
    
}
