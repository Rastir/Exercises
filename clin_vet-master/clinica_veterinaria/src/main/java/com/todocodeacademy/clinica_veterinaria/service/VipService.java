package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Vip;
import com.todocodeacademy.clinica_veterinaria.repository.IVipRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipService implements IVipService {
    
    @Autowired
    private IVipRepository repoVip;

    @Override
    public void saveVip(Vip vip) {
        repoVip.save(vip);
    }

    @Override
    public Vip findVip(Long id_vip) {
        return repoVip.findById(id_vip).orElse(null);
    }

    @Override
    public List<Vip> getVip() {
        List<Vip> listaVips =repoVip.findAll();
        return listaVips;
    }

    @Override
    public void editVip(Vip vip) {
        this.saveVip(vip);
    }

    @Override
    public void deleteVip(Long id_vip) {
        repoVip.deleteById(id_vip);
    }
    
}
