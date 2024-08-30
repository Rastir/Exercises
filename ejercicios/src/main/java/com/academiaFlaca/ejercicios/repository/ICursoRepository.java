package com.academiaFlaca.ejercicios.repository;

import com.academiaFlaca.ejercicios.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{

}
