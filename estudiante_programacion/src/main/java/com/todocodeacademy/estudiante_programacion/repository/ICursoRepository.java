package com.todocodeacademy.estudiante_programacion.repository;
import com.todocodeacademy.estudiante_programacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long>{
    
}
