package com.aldosanchez.microServiciosIngredientes.repository;

import com.aldosanchez.microServiciosIngredientes.model.Ingrediente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente, Long>{

    @Query("SELECT i FROM Ingrediente i WHERE :plato MEMBER OF i.lista_platos")
    public List<Ingrediente> findBy(String plato);
    
}
