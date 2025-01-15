package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Aquafriend;
import java.util.List;

public interface IAquafriendService {
    
    //CRUD METHOD
    //Create 
    public void saveAquafriend (Aquafriend aquafriend);
    //Read
    //Read of only one VIP 
    public Aquafriend findAquafriend (Long id_aquafriend);
    //Read method to bring all the vips
    public List<Aquafriend> getAquafriend();
    //Update
    public void editAquafriend (Aquafriend aquafriend);
    //Delete
    public void deleteAquafriend (Long id_aquafriend);

}