package com.example.jpaDemo.repository;

import com.example.jpaDemo.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends  JpaRepository <Mascota, Long>{
    
}
