package com.aldosanchez.microServiciosAutores.service;

import com.aldosanchez.microServiciosAutores.model.Autor;
import java.time.LocalDate;
import java.util.List;

public interface IAutorService {
    
    public List<Autor> getAutores();
    
    public void saveAutor(String nombre_completo, LocalDate fecha_nac, String titulo);
    
    public void deleteAutor(Long id);
    
    public Autor findAutor(Long id);
    
    public void editAutor(Long id, Autor autor);
    
}
