package com.todocodeacademy.cursoSpringBoot.service;

import com.todocodeacademy.cursoSpringBoot.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Override
    public void crearPersona(Persona per) {
        //lógica de creación
        System.out.println("Persona Creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //acá debería ir la lógica de devolver la lista de personas
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    //métodos de lógica de negocio
    
    
}
