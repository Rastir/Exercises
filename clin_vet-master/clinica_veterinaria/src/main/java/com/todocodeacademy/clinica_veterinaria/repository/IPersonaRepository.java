package com.todocodeacademy.clinica_veterinaria.repository;


import com.todocodeacademy.clinica_veterinaria.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}