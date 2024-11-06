package com.aldosanchez.calaapi.controller;

import com.aldosanchez.calaapi.dto.CalaDTO;
import com.aldosanchez.calaapi.repository.CalaAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalaController {
    
    @Autowired
    private CalaAPIClient calaAPIClient;
    
    @GetMapping("/traer/{id}")
    public CalaDTO getCalaInfo(@PathVariable("id")Long id){
        return calaAPIClient.getCalaInfo(id);
    }
    
}
