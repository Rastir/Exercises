package com.aldosanchez.microServiciosDestinatarios.repository;

import com.aldosanchez.microServiciosDestinatarios.model.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinatarioRepository extends JpaRepository<Destinatario, Long>{
    
}
