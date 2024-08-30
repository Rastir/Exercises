package com.example.jpaDemo.service;

import com.example.jpaDemo.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    //método para traer a todas las mascotas
    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascotas(Mascota masco);

    //baja
    public void deleteMascotas(Long id_mascota);

    //lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edición/modificación
    public void editMascota(Long idOriginal, Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaRaza,
                            String nuevaEspecie,
                            String nuevoColor);
}
