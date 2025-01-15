package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Vip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVipRepository extends JpaRepository<Vip, Long>{
    
}
