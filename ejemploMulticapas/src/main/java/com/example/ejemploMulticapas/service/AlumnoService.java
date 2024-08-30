package com.example.ejemploMulticapas.service;

import com.example.ejemploMulticapas.model.Alumno;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService{

    @Override
    public void crearPersona(Alumno alum) {
        System.out.println("Alumno creado");
    }

    @Override
    public List<Alumno> traerAlumnos() {
        //aca debe de devolver la lista de personas
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //metodos de logica de negocio 
    
}
