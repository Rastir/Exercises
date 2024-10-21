
package com.aldosanchez.microServiciosPlatos.repository;

import com.aldosanchez.microServiciosPlatos.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository<Plato, Long> {
    
}
