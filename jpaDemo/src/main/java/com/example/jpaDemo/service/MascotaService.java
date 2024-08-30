package com.example.jpaDemo.service;

import com.example.jpaDemo.model.Mascota;
import com.example.jpaDemo.model.Persona;
import com.example.jpaDemo.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascotas() {
        
        List<Mascota> listaMascotas = repoMasco.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascotas(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascotas(Long id_mascota) {
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return repoMasco.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, 
                            String nuevaRaza, String nuevaEspecie, String nuevoColor) {
        
        Mascota masco = this.findMascota(idOriginal);
        
        masco.setId_mascota(id_mascotaNueva);
        masco.setNombre(nuevoNombre);
        masco.setRaza(nuevaRaza);
        masco.setEspecie(nuevaEspecie);
        masco.setColor(nuevoColor);
        
        this.saveMascotas(masco);
    }

}
