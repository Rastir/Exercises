package com.aldosanchez.cities_service.repository;

import com.aldosanchez.cities_service.dto.HotelDTO;
import lombok.Getter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//mismo nombre de la app en eureka
//así ya no es necesario configurar la url
@FeignClient(name = "hotels-service")
public interface IHotelsAPI {

    @GetMapping("hotels/{city_id}")
    public List<HotelDTO> getHotelsByCityId (@PathVariable("city_id") Long city_id);
}
