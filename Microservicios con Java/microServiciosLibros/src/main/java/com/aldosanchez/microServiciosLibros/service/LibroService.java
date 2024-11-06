package com.aldosanchez.microServiciosLibros.service;

import com.aldosanchez.microServiciosLibros.model.Libro;
import com.aldosanchez.microServiciosLibros.repository.ILibroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibroService {
    
    @Autowired
    private ILibroRepository libroRepo;

    @Override
    public List<Libro> getLibros() {
        return libroRepo.findAll();
    }

    @Override
    public void saveLibro(Libro lib) {
        libroRepo.save(lib);
    }

    @Override
    public void deleteLibro(Long id) {
        libroRepo.deleteById(id);
    }

    @Override
    public Libro findLibro(Long id) {
        return libroRepo.findById(id).orElse(null);
    }

    @Override
    public void editLibro(Long id_original, Libro libroEditar) {
        this.saveLibro(libroEditar);
    }

    @Override
    public Libro findLibroTitulo(String titulo) {
        return libroRepo.findByTitulo(titulo);
    }

  
    
}
