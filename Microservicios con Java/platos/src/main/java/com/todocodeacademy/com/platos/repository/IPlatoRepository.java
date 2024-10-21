
package com.todocodeacademy.com.platos.repository;

import com.todocodeacademy.com.platos.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository <Plato, Long>{
    
}
