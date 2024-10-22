package com.todocodeacademy.turnos.repository;

import com.todocodeacademy.turnos.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long>{
 
}


