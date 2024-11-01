package com.aldoSanchez.envios.controller;

import com.aldoSanchez.envios.dto.EnvioDTO;
import com.aldoSanchez.envios.model.Envio;
import com.aldoSanchez.envios.service.IEnvioService;
import java.time.LocalDate;
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
    public String crearEnvio (@RequestBody EnvioDTO envio){
        
        envioServ.saveEnvio(envio.getFecha_envio(), envio.getStatus(), envio.getDescripcion(), envio.getDniDestinatario());
        
        return "envio creado correctamente";
        
    }
    
    @GetMapping("/traer")
    public List<Envio> traerEnvios(){
        return envioServ.getEnvios();
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEnvio(@PathVariable Long id){
        envioServ.deleteEnvio(id);
        
        return "envio eliminado correctamente";
    }
    
    @PutMapping("/editar/{id_original}")
    public Envio editEnvio (@PathVariable Long id_original,
                            @RequestBody Envio envioEditar){
        
        envioServ.editEnvio(id_original, envioEditar);
        Envio envioEditado = envioServ.findEnvio(id_original);
        
        return envioEditado;
    }
    
    @GetMapping("/traer/{id}")
    public Envio traerEnvio (@PathVariable Long id){
        return envioServ.findEnvio(id);
    }
    
    
}
