package com.aldosanchez.microServiciosDestinatarios.service;

import com.aldosanchez.microServiciosDestinatarios.model.Destinatario;
import com.aldosanchez.microServiciosDestinatarios.repository.IDestinatarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinatarioService implements IDestinatarioService{
    
    @Autowired
    private IDestinatarioRepository destinatarioRepo;

    @Override
    public List<Destinatario> getDestinatatios() {
        return destinatarioRepo.findAll();
    }

    @Override
    public void saveDestinatario(Destinatario dest) {
        destinatarioRepo.save(dest);
    }

    @Override
    public void deleteDestinatario(Long id) {
        destinatarioRepo.deleteById(id);
    }

    @Override
    public Destinatario findDestinatario(Long id) {
        return destinatarioRepo.findById(id).orElse(null);
    }

    @Override
    public void editDestinatario(Destinatario dest) {
        this.saveDestinatario(dest);
    }
    
    
}
