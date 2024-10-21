package com.aldosanchez.microServiciosIngredientes.controller;

import com.aldosanchez.microServiciosIngredientes.model.Ingrediente;
import com.aldosanchez.microServiciosIngredientes.service.IIngredienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
    
    @Autowired
    private IIngredienteService ingreServ;
    
    @PostMapping("/crear")
    public String crearIngrediente ( @RequestBody Ingrediente ing) {
         ingreServ.saveIngrediente(ing);
         return "Ingrediente guardado correctamente";
     }
    
    @GetMapping ("/traer/{nombrePlato}")
    public List<Ingrediente> traerIngredientesByPlato (@PathVariable String nombrePlato) {
        return ingreServ.getIngredienteByPlato(nombrePlato);
    }
}
