package com.aldosanchez.microServiciosDestinatarios.service;

import com.aldosanchez.microServiciosDestinatarios.model.Envio;
import java.util.List;


public interface IEnvioService {
    
    public List<Envio> getEnvios();
    
    public void saveEnvio(Envio env);
    
    public void deleteEnvio(Long id);
    
    public Envio findEnvio(Long id);
    
    public void editEnvio (Envio env);
}
