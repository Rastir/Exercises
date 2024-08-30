package com.example.AutoWired.Controller;

import com.example.AutoWired.model.Posteo;
import com.example.AutoWired.repository.PosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosteoController {
    
    @Autowired
    PosteoRepository repository;
    
    @GetMapping ("/posteos")
    public List<Posteo> traerTodos(){
        
        return repository.traerTodos();
    }
    
}
