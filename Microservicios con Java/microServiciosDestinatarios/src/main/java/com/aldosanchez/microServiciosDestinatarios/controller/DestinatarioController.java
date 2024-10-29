package com.aldosanchez.microServiciosDestinatarios.controller;

import com.aldosanchez.microServiciosDestinatarios.model.Destinatario;
import com.aldosanchez.microServiciosDestinatarios.service.IDestinatarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/destinatarios")
public class DestinatarioController {
    
    @Autowired
    private IDestinatarioService destinatarioServ;
    
    @PostMapping("/crear")
    public String crearCurso(@RequestBody Destinatario des){
        destinatarioServ.saveDestinatario(des);
        
        return "destinatario creado correctamente";
    }
    
    @GetMapping("/traer")
    public List<Destinatario> traerDestinatarios(){
        return destinatarioServ.getDestinatatios();
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteDestinatario (@PathVariable Long id){
        destinatarioServ.deleteDestinatario(id);
        
        return "el destinatario fue borrado correctamente";
    }
    
    @PutMapping("/editar/{id_original}")
    public Destinatario editDestinatario (@PathVariable Long id_original,
                                        @RequestBody Destinatario destinatarioEditar){
        
        destinatarioServ.editDestinatario(destinatarioEditar);
        Destinatario destinatarioEditado = destinatarioServ.findDestinatario(id_original);
        
        return destinatarioEditado;
    }
    
    @GetMapping("/destinatario/traer/{id}")
    public Destinatario traerDestinatario (@PathVariable Long id){
        return destinatarioServ.findDestinatario(id); 
   }
}
