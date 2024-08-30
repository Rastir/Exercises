package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.model.Duenio;
import com.example.clinica_veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ;
    
    @GetMapping ("/duenio/traer")
    private List<Duenio> getDuenio(){
        return duenioServ.getDuenios();
    }
    
    @PostMapping ("/duenio/crear")
    private String saveDuenio(@RequestBody Duenio due){
        duenioServ.saveDuenio(due);
        
        return "Dueño creado sucsesfuly";
    }
    
    @DeleteMapping ("/duenio/borrar/{id_duenio}")
    private String deleteDuenio(@PathVariable Long id_duenio){
        duenioServ.deleteDuenio(id_duenio);
        
        return "Dueño borrado sucsesfuly";
    }
    
    @PutMapping ("/duenio/editar")
    private String editDuenio (@RequestBody Duenio due){
        duenioServ.editDuenio(due);
        return "Dueño editado sucsesfuly ";
    }
    
}
