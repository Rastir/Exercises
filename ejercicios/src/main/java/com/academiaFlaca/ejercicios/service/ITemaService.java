package com.academiaFlaca.ejercicios.service;

import com.academiaFlaca.ejercicios.model.Tema;
import java.util.List;

public interface ITemaService {

    //lectura
    public List<Tema> getTemas();

    //alta
    public void saveTema(Tema tem);

    //baja
    public void deleteTema(Long id_tema);

    //lectura de un solo objeto
    public Tema findTema(Long id_tema);

    //edicion/modificacion
    public void editTema(Tema tem);

}
