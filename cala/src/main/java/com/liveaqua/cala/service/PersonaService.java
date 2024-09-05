package com.liveaqua.cala.service;

import com.liveaqua.cala.dto.PersoAquaDTO;
import com.liveaqua.cala.model.Persona;
import com.liveaqua.cala.repository.IPersonaRepository;
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


    @Override
    public PersoAquaDTO getPersoAqualovers(Long id_persona) {
    
        List<Persona> listaPersonas = this.getPersona();
        List<PersoAquaDTO> listaPersoAqua = new ArrayList<PersoAquaDTO>();
        PersoAquaDTO perso_aqua = new PersoAquaDTO();
        
        for (Persona perso:listaPersonas){
            
            System.out.println(perso.getName());
            perso_aqua.setLastName(perso.getLastName());
            perso_aqua.setAge(perso.getAge());
            perso_aqua.setEmail(perso.getEmail());
            perso_aqua.setNoVisit(perso_aqua.getNoVisit());
            perso_aqua.setLastVisit(perso_aqua.getLastVisit());
            perso_aqua.setAlergias(perso.getAlergies());
            perso_aqua.setAlimentosYBebidas(perso.getFoodAndBeverages());
            perso_aqua.setButler(perso.getButler());
            perso_aqua.setExperience(perso.getExperience());
            perso_aqua.setPreferencias(perso.getPreference());
            perso_aqua.setNotas(perso.getNotes());
            
            
            listaPersoAqua.add(perso_aqua);
            perso_aqua = new PersoAquaDTO();//reset
        }
        return (PersoAquaDTO) listaPersoAqua;
        
    }
}
