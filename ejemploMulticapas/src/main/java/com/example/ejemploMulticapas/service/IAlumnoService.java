package com.example.ejemploMulticapas.service;

import com.example.ejemploMulticapas.model.Alumno;
import java.util.List;

public interface IAlumnoService {
    
    public void crearPersona (Alumno alum);
    public List<Alumno> traerAlumnos();
    
}
