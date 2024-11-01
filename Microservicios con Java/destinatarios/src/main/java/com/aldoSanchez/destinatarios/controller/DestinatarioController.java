package com.aldoSanchez.destinatarios.controller;

import com.aldoSanchez.destinatarios.model.Destinatario;
import com.aldoSanchez.destinatarios.service.IDestinatarioService;
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
public class DestinatarioController {
    
    @Autowired
    private IDestinatarioService destiServ;
    
    @PostMapping("/destinatarios/crear")
    public String crearDestinatario(@RequestBody Destinatario desti){
        destiServ.saveDestinatario(desti);
        
        return "destinatario creado correctamente";
    }
    
    @GetMapping("/destinatarios/traer")
    public List<Destinatario> traerDestinatarios(){
        return destiServ.getDestinatarios();
    }
    
    @DeleteMapping("/destinatarios/borrar/{id}")
    public String deleteDestinatario (@PathVariable Long id){
        destiServ.deleteDestinatario(id);
        
        return "destinatario eliminado correctamente";
    }
    
    @PutMapping("/destinatarios/editar/{id_original}")
    public Destinatario editDestinatario(@PathVariable Long id_original,
                                        @RequestBody Destinatario destinatarioEditar){
        
        destiServ.editDestinatario(id_original, destinatarioEditar);
        Destinatario destinatarioEditado = destiServ.findDestinatario(id_original);
        
        return destinatarioEditado;
    }
    
    @GetMapping("/destinatarios/traer/{id}")
    public Destinatario traerDestinatario (@PathVariable Long id){
        return destiServ.findDestinatario(id);
    }
    
    @GetMapping("/destinatarios/traerdni/{dni}")
    public Destinatario traerDestinatarioDni (@PathVariable String dni){
        return destiServ.findDestinatarioDni(dni);
    }
    
}
