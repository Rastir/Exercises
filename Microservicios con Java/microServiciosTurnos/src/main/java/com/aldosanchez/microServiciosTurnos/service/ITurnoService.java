package com.aldosanchez.microServiciosTurnos.service;

import com.aldosanchez.microServiciosTurnos.model.Turno;
import java.time.LocalDate;
import java.util.List;

public interface ITurnoService {
    
    public List<Turno> getTurnos();
    
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);
    
    public void deleteTurno(Long id);
    
    public Turno findTurno(Long id);
    
    public void editTurno (Long id, Turno turno);
    
}
