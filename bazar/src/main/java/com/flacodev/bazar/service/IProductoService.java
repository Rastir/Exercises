package com.flacodev.bazar.service;

import com.flacodev.bazar.model.Producto;
import java.util.List;

public interface IProductoService {
    
    //lectura
    public List<Producto> getProducto();

    //alta
    public void saveProducto (Producto pro);

    //baja
    public void deleteProducto(Long codigo_producto);

    //lectura de un solo objeto
    public Producto findProducto(Long codigo_producto);

    //edicion/modificacion
    public void editDuenio(Producto pro);

    public void getProducto(Long codigo_producto);
    
}
