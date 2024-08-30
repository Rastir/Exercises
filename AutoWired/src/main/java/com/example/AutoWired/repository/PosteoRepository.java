package com.example.AutoWired.repository;
import com.example.AutoWired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository {

    @Override
    public List<Posteo> traerTodos() {
    
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "Como ser vergas", "Aldo sanchez"));
        listaPosteos.add(new Posteo(2L, "Como creer ser vergas", "Maria sanchez"));
        
        return listaPosteos;
        
    }
    
    
    
}
