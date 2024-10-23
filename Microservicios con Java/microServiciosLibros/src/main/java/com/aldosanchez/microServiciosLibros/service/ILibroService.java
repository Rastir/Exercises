package com.aldosanchez.microServiciosLibros.service;

import com.aldosanchez.microServiciosLibros.model.Libro;
import java.util.List;

public interface ILibroService {
    
    public List<Libro> getLibros();
    
    public void saveLibro(Libro lib);
    
    public void deleteLibro(Long id);
    
    public Libro findLibro(Long id);

    public void editLibro(Long id_original, Libro libroEditar);

    public Libro findLibroTitulo(String titulo);

}
