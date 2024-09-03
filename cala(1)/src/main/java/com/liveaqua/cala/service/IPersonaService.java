package com.liveaqua.cala.service;

import com.liveaqua.cala.dto.PersoAquaDTO;
import com.liveaqua.cala.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //CRUD METHOD.
    //Create
    public void savePersona (Persona persona);
    // Read
    //Read of only one person
    public Persona findPersona (Long id);
    // Read method to bring all the people
    public List<Persona> getPersona();
    // Update
    public void editPersona (Persona persona);    
    //Delete
    public void deletePersona (Long id);
    
    //Aditional functions
    //Get only aqualovers
    public List<Persona> getAqualovers();
    
    // Get combined information
    public List<PersoAquaDTO> getPersoAqualovers();

}
