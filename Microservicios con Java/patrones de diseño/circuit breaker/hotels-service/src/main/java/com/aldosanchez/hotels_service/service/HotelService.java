package com.aldosanchez.hotels_service.service;

import com.aldosanchez.hotels_service.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService {

    List<Hotel> hotelsList = new ArrayList<>();
    @Override
    public List<Hotel> getHotelsByCityId(Long city_id) {

        List<Hotel> hotelCityList = new ArrayList<>();

        // carga la bd "logica"
        this.loadHotels();

        //Busca si coincide la id
        for(Hotel h: hotelsList){
            if(h.getCity_id()==city_id){
                hotelCityList.add(h);
            }
        }
        //devuelve la lista
        return hotelCityList;
    }

    public void loadHotels(){

        hotelsList.add(new Hotel(1L, "Paradise", 5,1L));
        hotelsList.add(new Hotel(2L, "Paradise", 5,2L));
        hotelsList.add(new Hotel(3L, "Paradise", 5,3L));
        hotelsList.add(new Hotel(4L, "Paradise", 5,1L));
        hotelsList.add(new Hotel(5L, "Paradise", 5,2L));
        hotelsList.add(new Hotel(6L, "Paradise", 5,3L));
        hotelsList.add(new Hotel(7L, "Paradise", 5,1L));
        hotelsList.add(new Hotel(8L, "Paradise", 5,2L));
        hotelsList.add(new Hotel(9L, "Paradise", 5,3L));
        hotelsList.add(new Hotel(10L, "Paradise", 5,1L));
    }
}
