package com.aldosanchez.cities_service.controller;

import com.aldosanchez.cities_service.dto.CityDTO;
import com.aldosanchez.cities_service.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private ICityService servCity;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name,
                                    @RequestParam String country) {

        return servCity.getCitiesHotels(name, country);

    }
}