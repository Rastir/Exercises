package com.todocodeacademy.clinica_veterinaria.service;


import com.todocodeacademy.clinica_veterinaria.model.Persona;
import com.todocodeacademy.clinica_veterinaria.repository.IPersonaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository repoPerso;

    @Override
    public void savePersona(Persona persona) {
        repoPerso.save(persona);
    }

    @Override
    public Persona findPersona(Long id) {
        return repoPerso.findById(id).orElse(null);
    }

    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersonas = repoPerso.findAll();
        return listaPersonas;
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }

    @Override
    public void deletePersona(Long id) {
        repoPerso.deleteById(id);
    }    

    @Override
    public List<Persona> getAqualovers() {
        List<Persona> listaPersonas = this.getPersona();
        List<Persona> listaAqualovers = new ArrayList<Persona>();
        
        for(Persona perso:listaPersonas){
            if(perso.isLal() == true){
               listaAqualovers.add(perso);
            }
        }
        return listaAqualovers;
    }
}
