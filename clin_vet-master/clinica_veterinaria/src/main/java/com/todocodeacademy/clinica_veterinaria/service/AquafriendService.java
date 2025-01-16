package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Aquafriend;
import com.todocodeacademy.clinica_veterinaria.repository.IAquafriendRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AquafriendService implements IAquafriendService{
    
    @Autowired
    private IAquafriendRepository repoAqua;

    @Override
    public void saveAquafriend(Aquafriend aquafriend) {
        repoAqua.save(aquafriend);
    }

    @Override
    public Aquafriend findAquafriend(Long id_aquafriend) {
        return repoAqua.findById(id_aquafriend).orElse(null);
    }

    @Override
    public List<Aquafriend> getAquafriend() {
        List<Aquafriend> listaAquafriends = repoAqua.findAll();
        return listaAquafriends;
    }

    @Override
    public void editAquafriend(Aquafriend aquafriend) {
        this.saveAquafriend(aquafriend);
    }

    @Override
    public void deleteAquafriend(Long id_aquafriend) {
        repoAqua.deleteById(id_aquafriend);
    }
    
}
