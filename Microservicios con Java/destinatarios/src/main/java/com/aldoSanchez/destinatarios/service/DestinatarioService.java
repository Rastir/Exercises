package com.aldoSanchez.destinatarios.service;

import com.aldoSanchez.destinatarios.model.Destinatario;
import com.aldoSanchez.destinatarios.repository.IDestinatarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinatarioService implements IDestinatarioService{
    
    @Autowired
    private IDestinatarioRepository destiRepo;

    @Override
    public List<Destinatario> getDestinatarios() {
        return destiRepo.findAll();
    }

    @Override
    public void saveDestinatario(Destinatario desti) {
        destiRepo.save(desti);
    }

    @Override
    public void deleteDestinatario(Long id) {
        destiRepo.deleteById(id);
    }

    @Override
    public Destinatario findDestinatario(Long id) {
        return destiRepo.findById(id).orElse(null);
    }

    @Override
    public void editDestinatario(Long id_original, Destinatario desti) {
        this.saveDestinatario(desti);
    }
    
}
