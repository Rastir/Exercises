package com.aldoSanchez.envios.service;

import com.aldoSanchez.envios.model.Envio;
import java.time.LocalDate;
import java.util.List;

public interface IEnvioService {
    
    public List<Envio> getEnvios();
    
    public void saveEnvio(LocalDate fecha_creacion, String status, String descripcion, String dniDestinatario);
    
    public void deleteEnvio(Long id);
    
    public Envio findEnvio (Long id);
    
    public void editEnvio(Long id, Envio envio);
    
}
