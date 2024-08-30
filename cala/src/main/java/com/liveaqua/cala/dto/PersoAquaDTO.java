package com.liveaqua.cala.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersoAquaDTO {
    
    private String name;
    private String lastName;
    private String email;
    private int noVisit;
    private int age;
    private LocalDate lastVisit;

    public PersoAquaDTO(String name, String lastName, String email, int noVisit, int age, LocalDate lastVisit) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.noVisit = noVisit;
        this.age = age;
        this.lastVisit = lastVisit;
    }

    public PersoAquaDTO() {
    }
    
    
    
}
