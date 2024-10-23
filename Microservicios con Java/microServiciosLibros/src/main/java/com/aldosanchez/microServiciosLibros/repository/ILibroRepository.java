package com.aldosanchez.microServiciosLibros.repository;

import com.aldosanchez.microServiciosLibros.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
    
    @Query("SELECT l FROM Libro l WHERE l.titulo =:titulo")
    Libro findByTitulo(String titulo);
    
}
