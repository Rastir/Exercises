package com.todocodeacademy.clinica_veterinaria.controller;


import com.todocodeacademy.clinica_veterinaria.model.Persona;
import com.todocodeacademy.clinica_veterinaria.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping("/personas/traer")
    public List<Persona> traerPersonas(){
        return persoServ.getPersona();
    }
    
    @GetMapping("/personas/traer/{id}")
    public Persona findPersona(@PathVariable Long id){
        return persoServ.findPersona(id);
    }
    
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id_persona}")
    public String deletePersona(@PathVariable Long id_persona){
        persoServ.deletePersona(id_persona);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/personas/editar")
    public String editPersona(@RequestBody Persona perso){
        
        persoServ.editPersona(perso);
        return "La persona fue editada correctamente";
    }
    
    @GetMapping("/personas/traer-aqualovers")
    public List<Persona> traerAqualovers(){
        return persoServ.getAqualovers();
    }
    
    
}
