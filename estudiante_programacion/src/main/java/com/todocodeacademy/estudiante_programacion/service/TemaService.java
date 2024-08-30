package com.todocodeacademy.estudiante_programacion.service;

import com.todocodeacademy.estudiante_programacion.model.Tema;
import com.todocodeacademy.estudiante_programacion.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{

    @Autowired
    private ITemaRepository temaRepo;
    
    @Override
    public List<Tema> getTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public void editTema(Tema tema) {
        //acá se puede hacer también que edite parte por parte para que sea más detallado
        this.saveTema(tema);
    }
    
}
