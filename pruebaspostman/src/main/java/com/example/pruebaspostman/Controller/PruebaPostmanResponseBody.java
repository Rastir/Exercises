package com.example.pruebaspostman.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PruebaPostmanResponseBody {
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Carlo","Flores"));
        listaClientes.add(new Cliente(2L,"Graciel","Montanez"));
        listaClientes.add(new Cliente(3L,"Aldo","Sanchez"));
        
        return listaClientes;
    }
    
}
