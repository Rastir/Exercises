package com.academiaFlaca.ejercicios.controller;

import com.academiaFlaca.ejercicios.dto.CursoTemaDTO;
import com.academiaFlaca.ejercicios.model.Curso;
import com.academiaFlaca.ejercicios.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoServ;

    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        
        return cursoServ.getCursos();
    }

    @PostMapping("cursos/crear")
    public String saveCurso (@RequestBody Curso curs){
        cursoServ.saveCurso(curs);

        return "Curso creado de manera correcta";
    }

    @DeleteMapping("/cursos/borrar/{id_curso}")
    public String deleteCurso(@PathVariable Long id_curso){
        cursoServ.deleteCurso(id_curso);
        return "Curso eliminado correctamente";
    }

    @GetMapping("/cursos/temas/{id_curso}")
    public CursoTemaDTO temasPorCurso (@PathVariable Long id_curso){
        
        return cursoServ.getTemasPorCurso(id_curso);
    }
   
    @PutMapping("/cursos/editar")
    public String editCurso(@RequestBody Curso curs){
        cursoServ.editCurso(curs);

        return "Curso editado correctamente";
    }
    
    @GetMapping ("/cursos/java")
    public List<Curso> getCursosJava () {
        return cursoServ.getCursosJava();
    
    }
    
}
