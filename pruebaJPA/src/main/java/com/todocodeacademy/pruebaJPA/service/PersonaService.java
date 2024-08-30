package com.todocodeacademy.pruebaJPA.service;
import com.todocodeacademy.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private IPersonaRepository persoRepo;
    
    
}
