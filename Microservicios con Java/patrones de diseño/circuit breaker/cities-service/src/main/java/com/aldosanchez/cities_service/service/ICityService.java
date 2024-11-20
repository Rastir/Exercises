package com.aldosanchez.cities_service.service;

import com.aldosanchez.cities_service.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels (String name, String country);
}
