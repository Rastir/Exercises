package com.aldosanchez.microServiciosPlatos.controller;

import com.aldosanchez.microServiciosPlatos.dto.PlatoDTO;
import com.aldosanchez.microServiciosPlatos.model.Plato;
import com.aldosanchez.microServiciosPlatos.service.IPlatoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    
    @Autowired
    private IPlatoService platoServ;
    
    @PostMapping("/crear")
    public String crearPlato(@RequestBody PlatoDTO plato) {
        platoServ.savePlato(plato.getNombre(), plato.getPrecio(), plato.getDescripcion());

        return "Plato creado correctamente";
    }
    
    @GetMapping ("/traer")
    public List<Plato> traerPlatos () {
        return platoServ.getPlatos();
    }
}
