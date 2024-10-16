package com.aldosanchez.microServiciosTurnos.repository;

import com.aldosanchez.microServiciosTurnos.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long>{
    
}
