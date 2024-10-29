package com.aldosanchez.microServiciosDestinatarios.service;

import com.aldosanchez.microServiciosDestinatarios.model.Envio;
import com.aldosanchez.microServiciosDestinatarios.repository.IEnvioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioService implements IEnvioService{
    
    @Autowired
    private IEnvioRepository envioRepo;

    @Override
    public List<Envio> getEnvios() {
        return envioRepo.findAll();
    }

    @Override
    public void saveEnvio(Envio env) {
        envioRepo.save(env);
    }

    @Override
    public void deleteEnvio(Long id) {
        envioRepo.deleteById(id);
    }

    @Override
    public Envio findEnvio(Long id) {
        return envioRepo.findById(id).orElse(null);
    }

    @Override
    public void editEnvio(Envio env) {
        this.saveEnvio(env);
    }
    
}
