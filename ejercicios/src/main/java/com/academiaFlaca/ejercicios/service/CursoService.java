package com.academiaFlaca.ejercicios.service;

import com.academiaFlaca.ejercicios.dto.CursoTemaDTO;
import com.academiaFlaca.ejercicios.model.Curso;
import com.academiaFlaca.ejercicios.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository repoCurso;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = repoCurso.findAll();
        return listaCursos;
    }

    @Override
    public void saveCurso(Curso curs) {
        repoCurso.save(curs);
    }

    @Override
    public void deleteCurso(Long id_curso) {
        repoCurso.deleteById(id_curso);
    }

    @Override
    public Curso findCurso(Long id_curso) {
        return repoCurso.findById(id_curso).orElse(null);
    }

    @Override
    public void editCurso(Curso curs) {
    this.saveCurso(curs);
    }

    @Override
    public CursoTemaDTO getTemasPorCurso(Long id_curso) {
    
        CursoTemaDTO curTemDTO = new CursoTemaDTO();
        Curso curso = this.findCurso(id_curso);
        curTemDTO.setNombreCurso(curso.getNombre());
        curTemDTO.setListaTemas(curso.getListaTemas());
        
        return curTemDTO;
    }

    @Override
    public List<Curso> getCursosJava() {
    
        String palabra = "Java";
        String textoComparar;
        
        List <Curso> listaCursos = this.getCursos();
        List <Curso> listaCursosJava = new ArrayList<Curso>();
        
        for (Curso cur : listaCursos){
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabra);
            if(contieneJava == true){
                listaCursosJava.add(cur);
            }
        }
        return listaCursosJava;
    }

}
