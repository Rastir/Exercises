package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.dto.MascotaDuenioDTO;
import com.example.clinica_veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    //Aqui se agregan las funciones, principalmente el CRUD
    
    //Alta
    public void saveMascota (Mascota masco);
    //Lectura 
    public List<Mascota> getMascota();
    //Edición
    public void editMascota(Mascota masco);
    //Baja
    public void deleteMascota (Long id_mascota);
    
    //Lectura de un solo curso
    public Mascota findMascota(Long id_mascota);
    //El DTO de mascota y dueño
    public List<MascotaDuenioDTO> getDatosCombinados ();
    //La lista de lomitos caniches
    public List<Mascota> getCaniches();
    

}
