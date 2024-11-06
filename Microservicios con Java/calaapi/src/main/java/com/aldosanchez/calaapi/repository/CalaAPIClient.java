package com.aldosanchez.calaapi.repository;

import com.aldosanchez.calaapi.dto.CalaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="calaapi", url="http://vps-4437505-x.dattaweb.com:8080/personas")
public interface CalaAPIClient {
    
    @GetMapping("/traer/{id}")
    public CalaDTO getCalaInfo (@PathVariable ("id")Long id);
    
}
