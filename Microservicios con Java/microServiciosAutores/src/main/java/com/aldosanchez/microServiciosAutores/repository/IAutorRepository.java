package com.aldosanchez.microServiciosAutores.repository;

import com.aldosanchez.microServiciosAutores.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long>{
    
}
