package com.aldosanchez.ejercicioSpringCloud2.controller;


import com.aldosanchez.ejercicioSpringCloud2.dto.PokemonDTO;
import com.aldosanchez.ejercicioSpringCloud2.repository.IPokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    
    @Autowired
    private IPokeAPIClient IPokeAPIClient;
    
    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonId")int pokemonId){
        return IPokeAPIClient.getPokemonInfo(pokemonId);
    }
    
    
}