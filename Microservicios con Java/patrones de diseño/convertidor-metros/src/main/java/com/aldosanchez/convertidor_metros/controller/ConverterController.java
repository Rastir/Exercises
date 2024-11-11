package com.aldosanchez.convertidor_metros.controller;

import com.aldosanchez.convertidor_metros.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {
    
    @Autowired
    private ConverterService convServ;
    
    @GetMapping("/meters/{meters}")
    public Double convertCentimeters (@PathVariable Double meters){
        
        return convServ.convertCentimeters(meters);
    }
}
