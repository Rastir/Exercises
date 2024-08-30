package com.example.ejerciciosPracticosSpingboot.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPlatillo {
    
    @GetMapping("/platillo/{id}")
    @ResponseBody
    public Platillo traerPlatillo(@PathVariable int id){
        List<Platillo> listaPlatos = new ArrayList<Platillo>();
            
        listaPlatos.add(new Platillo(1,"cemita",50,"Un crocante milanesa o cualquier tipo de proteina rodeado de un pan delicioso hecho con manteca y sesamo"));
        listaPlatos.add(new Platillo(2,"Molote",20,"Un crocante masa frita en manteca rellena con cualquier guisado"));
        listaPlatos.add(new Platillo(3,"Pelona",35,"Pna de manteca frito con base de frijoles con res o pollo"));
        listaPlatos.add(new Platillo(4,"Chalupa",40,"Tortilla frita en manteca con base de salsa a escoger con hebras de res"));
        
        for (Platillo plat: listaPlatos){
            if(plat.getId() == id){
                return plat;
            }
        }
        return null;
    }
    
    
}
