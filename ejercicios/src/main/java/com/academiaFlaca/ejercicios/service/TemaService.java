package com.academiaFlaca.ejercicios.service;

import com.academiaFlaca.ejercicios.model.Tema;
import com.academiaFlaca.ejercicios.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{

    @Autowired
    private ITemaRepository repoTema;

    @Override
    public List<Tema> getTemas(){
        List<Tema> listaTemas = repoTema.findAll();
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tem){
        repoTema.save(tem);
    }

    @Override
    public void deleteTema(Long id_tema){
    repoTema.deleteById(id_tema);
    }

    @Override
    public Tema findTema(Long id_tema){
        Tema tem = repoTema.findById(id_tema).orElse(null);
        return tem;
    }

    public void editTema(Tema tem){
        this.saveTema(tem);
    }

 }
