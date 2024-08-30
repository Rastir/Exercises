package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    
    //lectura
    public List<Duenio> getDuenios();

    //alta
    public void saveDuenio (Duenio due);

    //baja
    public void deleteDuenio(Long id_duenio);

    //lectura de un solo objeto
    public Duenio findDuenio(Long id_duenio);

    //edicion/modificacion
    public void editDuenio(Duenio due);
    
}
