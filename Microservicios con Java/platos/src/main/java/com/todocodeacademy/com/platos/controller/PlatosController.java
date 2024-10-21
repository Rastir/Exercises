package com.todocodeacademy.com.platos.controller;

import com.todocodeacademy.com.platos.dto.PlatoDTO;
import com.todocodeacademy.com.platos.model.Plato;
import com.todocodeacademy.com.platos.service.IPlatoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatosController {
    
     @Autowired
    private IPlatoService platoServ;
    
    @PostMapping ("/crear")
     public String crearIngrediente ( @RequestBody PlatoDTO plato) {
         platoServ.savePlato(plato.getNombre() , plato.getPrecio(), plato.getDescripcion());
         return "Plato guardado correctamente";
     }
     
     @GetMapping ("/traer")
    public List<Plato> traerPlatos () {
        return platoServ.getPlatos();
    }
    
    
}
