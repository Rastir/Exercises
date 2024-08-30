package com.example.ejemploMulticapas.service;

import com.example.ejemploMulticapas.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public void crearCliente (Cliente clie);
    public List<Cliente> traerCLientes();
    
}
