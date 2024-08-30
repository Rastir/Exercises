package com.flacodev.bazar.service;

import com.flacodev.bazar.model.Producto;
import com.flacodev.bazar.repository.IProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoService implements IProductoService {
    
    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public List<Producto> getProducto() {
        List<Producto> listaProductos = repoProducto.findAll();
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto pro) {
        repoProducto.save(pro);
    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        repoProducto.deleteById(codigo_producto);
    }

    @Override
    public Producto findProducto(Long codigo_producto) {
        return repoProducto.findById(codigo_producto).orElse(null);
    }

    @Override
    public void editDuenio(Producto pro) {
        this.saveProducto(pro);
    }
    
}
