package com.academiaFlaca.ejercicios.service;


import com.academiaFlaca.ejercicios.dto.CursoTemaDTO;
import com.academiaFlaca.ejercicios.model.Curso;
import java.util.List;

public interface ICursoService {

    //lectura
    public List<Curso> getCursos();

    //alta
    public void saveCurso (Curso curs);

    //baja
    public void deleteCurso(Long id_curso);

    //lectura de un solo objeto
    public Curso findCurso(Long id_curso);

    //edicion/modificacion
    public void editCurso(Curso curs);

    public CursoTemaDTO getTemasPorCurso(Long id_curso);

    public List<Curso> getCursosJava();

}
