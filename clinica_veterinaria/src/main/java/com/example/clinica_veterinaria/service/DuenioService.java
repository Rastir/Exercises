package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.model.Duenio;
import com.example.clinica_veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
    
    @Autowired
    private IDuenioRepository repoDuenio;

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = repoDuenio.findAll();
        return listaDuenios;
    }

    @Override
    public void saveDuenio(Duenio due) {
        repoDuenio.save(due);
    }

    @Override
    public void deleteDuenio(Long id_duenio) {
        repoDuenio.deleteById(id_duenio);
    }

    @Override
    public Duenio findDuenio(Long id_duenio) {
        return repoDuenio.findById(id_duenio).orElse(null);
    }

    @Override
    public void editDuenio(Duenio due) {
        this.saveDuenio(due);
    }
    
    
}
