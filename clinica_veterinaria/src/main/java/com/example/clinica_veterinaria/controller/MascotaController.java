package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.dto.MascotaDuenioDTO;
import com.example.clinica_veterinaria.model.Mascota;
import com.example.clinica_veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaServ;

    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas() {

        return mascotaServ.getMascota();
    }

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco) {
        mascotaServ.saveMascota(masco);
        return "Mascota creada sucsesfulmente ";
    }

    @DeleteMapping("/mascota/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascotaServ.deleteMascota(id_mascota);

        return "Mascota borrada sucsesfulmente";
    }

    @GetMapping("/mascota/info")
    public List<MascotaDuenioDTO> datosCombinados() {
        return mascotaServ.getDatosCombinados();

    }

    @PutMapping("/mascota/editar")
    public String editMascota(@RequestBody Mascota masco) {
        mascotaServ.editMascota(masco);
        return "Mascota editada sucsesfulmente";
    }

    @GetMapping("/mascota/caniche")
    public List<Mascota> traerCaniches() {
        return mascotaServ.getCaniches();
    }
}
