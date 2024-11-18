package com.aldosanchez.convertidor_metros.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService{

    @Override
    public Double convertCentimeters(Double meters) {
        return meters*100;
    }
    
}
