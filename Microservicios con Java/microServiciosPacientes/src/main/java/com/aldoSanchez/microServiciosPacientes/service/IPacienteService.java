package com.aldoSanchez.microServiciosPacientes.service;

import com.aldoSanchez.microServiciosPacientes.model.Paciente;
import java.util.List;

public interface IPacienteService {
    
    public List<Paciente> getPacientes();
    
    public void savePaciente(Paciente pac);
    
    public void deletePaciente (Long id);
    
    public Paciente findPaciente (Long id);
    
    public void editPaciente (Long id, Paciente pac);
    
}
