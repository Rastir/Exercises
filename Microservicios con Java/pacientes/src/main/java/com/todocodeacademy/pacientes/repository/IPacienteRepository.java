package com.todocodeacademy.pacientes.repository;

import com.todocodeacademy.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository  extends JpaRepository <Paciente, Long>{
    
}
