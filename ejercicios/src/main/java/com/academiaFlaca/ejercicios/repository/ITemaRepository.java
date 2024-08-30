package com.academiaFlaca.ejercicios.repository;

import com.academiaFlaca.ejercicios.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ITemaRepository extends JpaRepository <Tema, Long>{

}
