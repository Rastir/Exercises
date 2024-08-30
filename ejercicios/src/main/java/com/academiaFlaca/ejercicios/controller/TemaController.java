package com.academiaFlaca.ejercicios.controller;

import com.academiaFlaca.ejercicios.model.Tema;
import com.academiaFlaca.ejercicios.service.ITemaService;
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
public class TemaController {
    
    @Autowired
    private ITemaService temaServ;
    
    @GetMapping("/temas/traer")
    public List <Tema> getTemas(){
        return temaServ.getTemas();
    }
     @PostMapping ("/temas/crear")
    public String saveTemas (@RequestBody Tema tem) {
        temaServ.saveTema(tem);
        
        return "El tema fue creado correctamente";
    }
    
    @DeleteMapping ("/temas/borrar/{id}")
    public String deleteTema(@PathVariable Long id) {
        temaServ.deleteTema(id);
        return "El tema fue eliminado correctamente";
    }
    
    @PutMapping("/tema/edit")
    public String editTema(@RequestBody Tema tem) {
        temaServ.editTema(tem);
        return "Tema editado correctamente";
    }
    
    
}
