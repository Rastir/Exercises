
package com.todocodeacademy.cursoSpringBoot.service;

import com.todocodeacademy.cursoSpringBoot.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //declarando métodos sin implementar
    public void crearPersona (Persona per);
    public List<Persona> traerPersonas();
    
}
