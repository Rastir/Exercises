package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Vip;
import java.util.List;


public interface IVipService {
    
    //CRUD METHOD
    //Create 
    public void saveVip (Vip vip);
    //Read
    //Read of only one VIP 
    public Vip findVip (Long id_vip);
    //Read method to bring all the vips
    public List<Vip> getVip();
    //Update
    public void editVip (Vip vip);
    //Delete
    public void deleteVip (Long id_vip);
}
