package com.liveaqua.cala.service;

import com.liveaqua.cala.model.Aqualover;
import com.liveaqua.cala.repository.IAqualoverRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AqualoverService implements IAqualoverService {
    
    @Autowired
    private IAqualoverRepository repoAqua;

    @Override
    public void saveAqualover(Aqualover aqualover) {
        repoAqua.save(aqualover);
    }

    @Override
    public Aqualover findAqualover(Long id) {
        return repoAqua.findById(id).orElse(null);
    }

    @Override
    public List<Aqualover> getAqualover() {
        List<Aqualover> listaAqualovers = repoAqua.findAll();
        return listaAqualovers;
    }

    @Override
    public void editAqualover(Aqualover aqualover) {
        this.saveAqualover(aqualover);
    }

    @Override
    public void deleteAqualover(Long id) {
        repoAqua.deleteById(id);
    }
    
    
    
}
