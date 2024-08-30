package com.flacodev.bazar.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaProductoClienteDTO {
    
    private Long id_venta;
    private double total;
    private double cantidadProductos;
    private String nombreCliente;
    private String apellidoCliente;

    public VentaProductoClienteDTO() {
    }

    public VentaProductoClienteDTO(Long id_venta, double total, double cantidadProductos, String nombreCliente, String apellidoCliente) {
        this.id_venta = id_venta;
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }
    
    
}
