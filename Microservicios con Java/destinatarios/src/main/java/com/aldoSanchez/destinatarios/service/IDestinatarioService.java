package com.aldoSanchez.destinatarios.service;

import com.aldoSanchez.destinatarios.model.Destinatario;
import java.util.List;

public interface IDestinatarioService {
    
    public List<Destinatario> getDestinatarios();
    
    public void saveDestinatario(Destinatario desti);
    
    public void deleteDestinatario(Long id);
    
    public Destinatario findDestinatario(Long id);
    
    public void editDestinatario (Long id_original,Destinatario desti);

    public Destinatario findDestinatarioDni(String dni);
    
}
