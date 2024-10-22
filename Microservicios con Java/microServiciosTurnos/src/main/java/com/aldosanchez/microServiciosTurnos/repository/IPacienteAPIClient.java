package com.aldosanchez.microServiciosTurnos.repository;

import com.aldosanchez.microServiciosTurnos.model.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pacientesapi", url="http://localhost:9001/pacientes")
public interface IPacienteAPIClient {
    
    @GetMapping ("/traerdni/{dni}")
    public Paciente getPaciente (@PathVariable ("dni") String dni);
}
