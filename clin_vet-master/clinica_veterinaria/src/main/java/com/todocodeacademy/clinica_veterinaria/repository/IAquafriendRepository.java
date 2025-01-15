package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Aquafriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAquafriendRepository extends JpaRepository<Aquafriend, Long>{
    
}
