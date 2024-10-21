package com.todocodeacademy.com.ingredientes.service;

import com.todocodeacademy.com.ingredientes.model.Ingrediente;
import com.todocodeacademy.com.ingredientes.repository.IIngredienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteService implements IIngredienteService {
    
    @Autowired
    private IIngredienteRepository ingreRepo;

    @Override
    public List<Ingrediente> getIngredientes() {
        return ingreRepo.findAll();
    }

    @Override
    public void saveIngrediente(Ingrediente ing) {
        ingreRepo.save(ing);
    }

    @Override
    public void deleteIngrediente(Long id) {
        ingreRepo.deleteById(id);
    }

    @Override
    public Ingrediente findIngrediente(Long id) {
        return ingreRepo.findById(id).orElse(null);
    }

    @Override
    public void editIngrediente(Long id, Ingrediente ing) {
        Ingrediente ingre = this.findIngrediente(id);
        ingre.setNombre_ingrediente(ing.getNombre_ingrediente());
        ingre.setPlatos(ing.getPlatos());
        
        ingreRepo.save(ingre);
    }

    @Override
    public List<Ingrediente> getIngredienteByPlato(String nombrePlato) {
        List<Ingrediente> listaIngredientes = ingreRepo.findByNombre(nombrePlato);
        
        return listaIngredientes;
    }

        
    
    
}
