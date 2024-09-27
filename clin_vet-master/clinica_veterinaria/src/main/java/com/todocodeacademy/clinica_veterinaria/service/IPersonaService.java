package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //CRUD METHOD.
    //Create
    public void savePersona (Persona persona);
    // Read
    //Read of only one person
    public Persona findPersona (Long id_persona);
    // Read method to bring all the people
    public List<Persona> getPersona();
    // Update
    public void editPersona (Persona persona);    
    //Delete
    public void deletePersona (Long id_persona);
    
    //Aditional functions
    //Get only aqualovers
    public List<Persona> getAqualovers();
    

}
