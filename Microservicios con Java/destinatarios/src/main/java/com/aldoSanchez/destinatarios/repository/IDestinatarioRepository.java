package com.aldoSanchez.destinatarios.repository;

import com.aldoSanchez.destinatarios.model.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinatarioRepository extends JpaRepository<Destinatario, Long>{
    
    @Query("SELECT d FROM Destinatario d WHERE d.dni = :dni")
    Destinatario findByDni(String dni);
    
}
