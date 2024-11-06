package com.aldosanchez.microServiciosAutores.controller;

import com.aldosanchez.microServiciosAutores.dto.AutorDTO;
import com.aldosanchez.microServiciosAutores.model.Autor;
import com.aldosanchez.microServiciosAutores.service.IAutorService;
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
@RequestMapping("/autores")
public class AutorController {
    
    @Autowired
    private IAutorService autorServ;
    
    @PostMapping("/crear")
    public String crearAutor(@RequestBody AutorDTO autor){
        
        autorServ.saveAutor(autor.getNombre_completo(), autor.getFecha_nac(), autor.getTitulo());
        
        return "autor creado correctamente";
    }
    
    @GetMapping("/traer")
    public List<Autor> traerAutores(){
        return autorServ.getAutores();
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteAutor(@PathVariable Long id){
        autorServ.deleteAutor(id);
        
        return "el autor ha sido ha sido borrado";
    }
    
    @PutMapping("/editar/{id_original}")
    public Autor editAutor(@PathVariable Long id_original,
                            @RequestBody Autor autorEditar){
        
        autorServ.editAutor(id_original, autorEditar);
        Autor autorEditado = autorServ.findAutor(id_original);
        
        return autorEditado;
    }
    
    @GetMapping("/traer/{id}")
    public Autor traerAutor (@PathVariable Long id){
        return autorServ.findAutor(id);
    }
}
