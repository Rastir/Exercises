package com.liveaqua.cala.controller;

import com.liveaqua.cala.model.Aqualover;
import com.liveaqua.cala.service.IAqualoverService;
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
public class AqualoverController {
    
    @Autowired
    private IAqualoverService aquaServ;
    
    @GetMapping("/aqualover/traer")
    public List<Aqualover> getAqualovers(){
        return aquaServ.getAqualover(); 
    }
    
    @PostMapping("/aqualover/crear")
    public String saveAqualover (@RequestBody Aqualover aqua){
        aquaServ.saveAqualover(aqua);
        return "Aqualovers creado correctamente";
    }
    
    @DeleteMapping("/aqualover/borrar/{id}")
    public String deleteAqualover(@PathVariable Long id){
        aquaServ.deleteAqualover(id);
        return "Aqualover borrado correctamente";
    }
    
    @PutMapping("/aqualover/editar")
    public Aqualover editAqualover (@RequestBody Aqualover aqua){
        aquaServ.editAqualover(aqua);
        return aquaServ.findAqualover(aqua.getId_aqualover());
    }
}
