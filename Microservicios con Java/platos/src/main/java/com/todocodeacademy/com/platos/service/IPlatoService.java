
package com.todocodeacademy.com.platos.service;

import com.todocodeacademy.com.platos.model.Plato;
import java.util.List;


public interface IPlatoService {
    
     public List<Plato> getPlatos();

    public void savePlato(String nombre, Double precio, String descripcion);

    public void deletePlato(Long id);

    public Plato findPlatoById(Long id);

    public void editPlato (Long id, Plato plat);
    
}
