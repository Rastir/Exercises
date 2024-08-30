package com.example.ejemploMulticapas.service;

import com.example.ejemploMulticapas.model.Cliente;
import java.util.List;


public class ClienteService implements IClienteService{

    @Override
    public void crearCliente(Cliente clie) {
        System.out.println("Aca debe de decir, cliente creado");
    }

    @Override
    public List<Cliente> traerCLientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
