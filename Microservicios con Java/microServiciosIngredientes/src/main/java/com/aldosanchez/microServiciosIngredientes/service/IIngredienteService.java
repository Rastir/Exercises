package com.aldosanchez.microServiciosIngredientes.service;

import com.aldosanchez.microServiciosIngredientes.model.Ingrediente;
import java.util.List;


public interface IIngredienteService {
    
    public List<Ingrediente> getIngredientes();
    
    public void saveIngrediente(Ingrediente ing);
    
    public void deleteIngrediente(Long id);
    
    public Ingrediente findIngrediente(Long id);
    
    public void editIngrediente (Long id, Ingrediente ingrediente);
    
    public List<Ingrediente> getIngredienteByPlato (String nombrePlato);
    
}
