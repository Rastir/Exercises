package com.flacodev.bazar.service;

import com.flacodev.bazar.dto.VentaProductoClienteDTO;
import com.flacodev.bazar.model.Venta;
import java.util.List;

public interface IVentaService {
    
    // Here comes all the CRUD operations
    
    //Create
    public void saveVenta (Venta venta);
    //Read
    public List<Venta> getVenta();
    //Update
    public void editVenta (Venta venta);
    //Delete
    public void deleteVenta(Venta id_venta);
    
    // We add the rest of future operations such as, 
    
    //DTO for combinated data
    public List<VentaProductoClienteDTO> getDatosCombinados();
}
