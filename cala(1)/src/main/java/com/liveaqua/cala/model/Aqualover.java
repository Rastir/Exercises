package com.liveaqua.cala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Aqualover {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_aqualover;
    private int noVisit;
    private LocalDate lastVisit;

    public Aqualover() {
    }

    public Aqualover(Long id_aqualover, int noVisit, LocalDate lastVisit) {
        this.id_aqualover = id_aqualover;
        this.noVisit = noVisit;
        this.lastVisit = lastVisit;
    } 
}
