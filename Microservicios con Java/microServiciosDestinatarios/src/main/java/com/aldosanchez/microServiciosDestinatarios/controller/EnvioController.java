package com.aldosanchez.microServiciosDestinatarios.controller;

import com.aldosanchez.microServiciosDestinatarios.model.Envio;
import com.aldosanchez.microServiciosDestinatarios.service.IEnvioService;
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
@RequestMapping("/envios")
public class EnvioController {
    
    @Autowired
    private IEnvioService envioServ;
    
    @PostMapping("/crear")
    public String crearEnvio(@RequestBody Envio en){
        envioServ.saveEnvio(en);
        
        return "envio creado satisfactoriamente ";
    }
    
    @GetMapping("/traer")
    public List<Envio> traerEnvios(){
        return envioServ.getEnvios();
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEnvio (@PathVariable Long id){
        envioServ.deleteEnvio(id);
        
        return "envio borrado correctamente ";
    }
    
    @PutMapping("editar/{id_original}")
    public Envio editEnvio (@PathVariable Long id_original,
                            @RequestBody Envio envioEditar){
        
        envioServ.editEnvio(envioEditar);
        Envio envioEditado = envioServ.findEnvio(id_original);
        
        return envioEditado;
    }
    
    @GetMapping("/envio/traer/{id}")
    public Envio traerEnvio(@PathVariable Long id){
        return envioServ.findEnvio(id);
    }
}
