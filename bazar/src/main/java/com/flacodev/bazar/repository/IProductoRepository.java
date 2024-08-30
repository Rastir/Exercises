package com.flacodev.bazar.repository;

import com.flacodev.bazar.model.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{
    
}
