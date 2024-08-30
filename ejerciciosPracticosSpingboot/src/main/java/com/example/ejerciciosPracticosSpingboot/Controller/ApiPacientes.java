package com.example.ejerciciosPracticosSpingboot.Controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPacientes {
    
    @GetMapping("/paciente")
    @ResponseBody
    public List<Paciente> traerPacientes(){
        
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        
        listaPacientes.add(new Paciente(1L,"123456","Aldo","sanchez", LocalDate.of(1994, 9, 18)));
        listaPacientes.add(new Paciente(2L,"178456","Maria","Chan", LocalDate.of(1996, 12, 05)));
        listaPacientes.add(new Paciente(3L,"458795","Death","Extasi", LocalDate.of(1489, 9, 18)));
        
        return listaPacientes;
    }
    
    @GetMapping("/paciente/menores")
    @ResponseBody
    public List<Paciente> traerMenores(){
        
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        
        listaPacientes.add(new Paciente(1L,"123456","Aldo","sanchez", LocalDate.of(2006, 9, 18)));
        listaPacientes.add(new Paciente(2L,"178456","Maria","Chan", LocalDate.of(1996, 12, 05)));
        listaPacientes.add(new Paciente(3L,"458795","Death","Extasi", LocalDate.of(2016, 9, 18)));
        listaPacientes.add(new Paciente(4L,"587745","Sumoin ","Extasi", LocalDate.of(2014, 9, 18)));
        listaPacientes.add(new Paciente(5L,"985632","Luger","Symphin", LocalDate.of(2018, 9, 18)));
        
        
        List<Paciente> listaMenores = new ArrayList<Paciente>();
        
        for (Paciente pac : listaPacientes){
            
            LocalDate hoy = LocalDate.now();
            Period cantAnios = Period.between(pac.getFechaNac(), hoy);
            
            if(cantAnios.getYears()<18){
                System.out.println("Cantidad de años : " + cantAnios.getYears());
                listaMenores.add(pac);
            }
        }
        return listaMenores;
    }
}
