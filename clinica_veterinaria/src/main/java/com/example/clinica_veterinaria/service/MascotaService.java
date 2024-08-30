package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.dto.MascotaDuenioDTO;
import com.example.clinica_veterinaria.model.Mascota;
import com.example.clinica_veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository repoMascot;

    @Override
    public List<Mascota> getMascota() {
        List<Mascota> listaMascotas = repoMascot.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMascot.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMascot.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return repoMascot.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }


    @Override
    public List<Mascota> getCaniches() {
    List<Mascota> listaMascotas = this.getMascota();
    List<Mascota> listaCaniches = new ArrayList<Mascota>();
    
    for (Mascota masco:listaMascotas){
        if(masco.getEspecie().equalsIgnoreCase("perro")
        && masco.getRaza().equalsIgnoreCase("caniche")){
        listaCaniches.add(masco);
            }
        }
    return listaCaniches;
    }

    @Override
    public List<MascotaDuenioDTO> getDatosCombinados() {
        
        List<Mascota> listaMascotas = this.getMascota();
        List<MascotaDuenioDTO> listaMascoDuenio = new ArrayList<MascotaDuenioDTO>();     
        MascotaDuenioDTO masDueDTO = new MascotaDuenioDTO();
        
        for (Mascota masco : listaMascotas){
            
            System.out.println(masco.getNombre());
            masDueDTO.setNomDuenio(masco.getDuenio().getNombre());
            masDueDTO.setNombreMascota(masco.getNombre());
            masDueDTO.setApeDuenio(masco.getDuenio().getApellido());
            masDueDTO.setEspecie(masco.getEspecie());
            masDueDTO.setRaza(masco.getRaza());
            
            listaMascoDuenio.add(masDueDTO);
            masDueDTO = new MascotaDuenioDTO();
        }
        return listaMascoDuenio;
    }
}
