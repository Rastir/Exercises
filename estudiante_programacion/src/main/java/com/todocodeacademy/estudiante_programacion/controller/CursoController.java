package com.todocodeacademy.estudiante_programacion.controller;

import com.todocodeacademy.estudiante_programacion.dto.CursoTemaDTO;
import com.todocodeacademy.estudiante_programacion.model.Curso;
import com.todocodeacademy.estudiante_programacion.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private ICursoService cursoServ;
    
    //1-crear un nuevo curso
    @PostMapping ("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso) {
        cursoServ.saveCurso(curso);
        
        return "Curso creado correctamente";   
        
    }
    
    //3- obtener todos los cursos
    @GetMapping ("/cursos/traer")
    public List<Curso> traerCursos () {
        return cursoServ.getCursos();
    }
    
    //4-Obtener los temas de un determinado curso
    @GetMapping ("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso (@PathVariable Long id_curso) {
        return cursoServ.temasPorCurso(id_curso);
    
    }
    
    //5-Obtener todos los cursos que tengan como nombre la palabra "Java
    @GetMapping ("/cursos/java")
    public List<Curso> getCursosJava () {
        return cursoServ.getCursosJava();
    
    }
    
    //6- Modificar los datos de un curso
    @PutMapping("/curso/edit")
    public String editCurso(@RequestBody Curso curso) {
        cursoServ.editCurso(curso);
        return "Curso editado correctamente";
    }
    
    
    
    
    
    
}
