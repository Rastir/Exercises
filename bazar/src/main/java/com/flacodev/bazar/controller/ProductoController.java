package com.flacodev.bazar.controller;

import com.flacodev.bazar.model.Producto;
import com.flacodev.bazar.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    @GetMapping ("/productos")
    public List<Producto> getProducto(){
        
        return productoServ.getProducto();
    }
    
    @PostMapping ("/productos/crear")
    public String saveProducto (@RequestBody Producto pro){
        productoServ.saveProducto(pro);
        return "Producto creado correctamente";
    }
    
    @GetMapping ("/productos/traer/{codigo_producto}")
    public String getProducto(@PathVariable Long codigo_producto){
        productoServ.getProducto(codigo_producto);
        return "Aqui ta" ;
    }
    
}
