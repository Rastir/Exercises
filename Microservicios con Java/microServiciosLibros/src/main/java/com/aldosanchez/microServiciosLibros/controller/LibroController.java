package com.aldosanchez.microServiciosLibros.controller;

import com.aldosanchez.microServiciosLibros.model.Libro;
import com.aldosanchez.microServiciosLibros.service.ILibroService;
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
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private ILibroService libroServ;
    
    @PostMapping("/crear")
    public String crearLibro(@RequestBody Libro lib){
        libroServ.saveLibro(lib);
        
        return "libro creado correctamente";
    }
    
    @GetMapping("/traer")
    public List<Libro> traerLibros(){
        return libroServ.getLibros();
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteLibro (@PathVariable Long id){
        libroServ.deleteLibro(id);
        
        return "el libro se ha borrado exitosamente";
    }
    
    @PutMapping("/editar/{id_original}")
    public Libro editLibro(@PathVariable Long id_original,
                            @RequestBody Libro libroEditar){
        
        libroServ.editLibro(id_original, libroEditar);
        Libro libroEditado = libroServ.findLibro(id_original);
        
        return libroEditado;
    }
    
    @GetMapping("/traer/{id}")
    public Libro traerLibro (@PathVariable Long id){
        return libroServ.findLibro(id);
    }
    
    @GetMapping("/traertitulo/{titulo}")
    public Libro traerLibroTitulo (@PathVariable String titulo){
        return libroServ.findLibroTitulo(titulo);
    }
}
