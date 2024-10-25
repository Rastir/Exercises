package com.aldosanchez.microServiciosDestinatarios.service;

import com.aldosanchez.microServiciosDestinatarios.model.Destinatario;
import java.util.List;

public interface IDestinatarioService {
    
    public List<Destinatario> getDestinatatios();
    
    public void saveDestinatario(Destinatario dest);
    
    public void deleteDestinatario(Long id);
    
    public Destinatario findDestinatario(Long id);
    
    public void editDestinatario (Destinatario dest);
}
