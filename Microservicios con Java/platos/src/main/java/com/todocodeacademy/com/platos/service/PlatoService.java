package com.todocodeacademy.com.platos.service;

import com.todocodeacademy.com.platos.dto.IngredienteDTO;
import com.todocodeacademy.com.platos.model.Plato;
import com.todocodeacademy.com.platos.repository.IPlatoRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private IPlatoRepository platoRepo;

    //En este caso lo hice sin necesidad de clase AppConfig
    RestTemplate api = new RestTemplate();

    @Override
    public List<Plato> getPlatos() {
        return platoRepo.findAll();
    }

    @Override
    public void savePlato(String nombre, Double precio, String descripcion) {

        Plato plato = new Plato();
        List<String> listaIngrePlato = new ArrayList<String>();

        plato.setNombre(nombre);
        plato.setPrecio(precio);
        plato.setDescripcion(descripcion);

        List<IngredienteDTO> listaIngredientes = Arrays.asList(api.getForObject("http://localhost:9003/ingredientes/traer/" + nombre, IngredienteDTO[].class));

        for (IngredienteDTO ingre : listaIngredientes) {
            listaIngrePlato.add(ingre.getNombre_ingrediente());
        }
        
        plato.setListaIngredientes(listaIngrePlato);

        platoRepo.save(plato);
    }

    @Override
    public void deletePlato(Long id) {
        platoRepo.deleteById(id);
    }

    @Override
    public Plato findPlatoById(Long id) {
        return platoRepo.findById(id).orElse(null);
    }

    @Override
    public void editPlato(Long id, Plato plat) {
        Plato pla = this.findPlatoById(id);

        pla.setNombre(plat.getNombre());
        pla.setDescripcion(plat.getDescripcion());
        pla.setPrecio(plat.getPrecio());
        pla.setListaIngredientes(plat.getListaIngredientes());

        platoRepo.save(pla);
    }

}
