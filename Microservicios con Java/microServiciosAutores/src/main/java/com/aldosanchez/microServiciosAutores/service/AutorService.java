package com.aldosanchez.microServiciosAutores.service;

import com.aldosanchez.microServiciosAutores.model.Autor;
import com.aldosanchez.microServiciosAutores.model.Libro;
import com.aldosanchez.microServiciosAutores.repository.IAutorRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AutorService implements IAutorService{
    
    @Autowired
    private IAutorRepository autorRepo;
    
    @Autowired
    private RestTemplate apiCOnsumir;

    @Override
    public List<Autor> getAutores() {
        return autorRepo.findAll();
    }

    @Override
    public void saveAutor(String nombre_completo, LocalDate fecha_nac, String titulo) {
        
        //buscar el libro en la api libros
        Libro lib = apiCOnsumir.getForObject("http://localhost:9001/libros/traertitulo/"+titulo, Libro.class);
        String infoCompleta = lib.getTitulo();
        //
        
        
        Autor autor = new Autor();
        autor.setFecha_nac(fecha_nac);
        autor.setNombre_completo(nombre_completo);
        autor.setNombre_completo(infoCompleta);
        
        autorRepo.save(autor);
    }
    
    @Override
    public void deleteAutor(Long id) {
        autorRepo.deleteById(id);
    }

    @Override
    public Autor findAutor(Long id) {
        return autorRepo.findById(id).orElse(null);
    }

    @Override
    public void editAutor(Long id, Autor autor) {
        
        Autor autr = this.findAutor(id);
        
        autr.setFecha_nac(autor.getFecha_nac());
        autr.setNombre_completo(autor.getNombre_completo());
        
        autorRepo.save(autr);
        
    }
      
}
