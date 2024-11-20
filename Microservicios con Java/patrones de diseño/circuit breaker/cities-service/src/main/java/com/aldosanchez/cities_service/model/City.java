package com.aldosanchez.cities_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;


}
