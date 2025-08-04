package org.example;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    private List<Hotel> hotels;

    public HotelService()
    {
        hotels = new ArrayList<>();

        hotels.add( new Hotel(1, "abc", new BigDecimal(30)));
        hotels.add( new Hotel(2, "def", new BigDecimal(50)));
        hotels.add( new Hotel(3, "ghi", new BigDecimal(70)));
    }

    public Hotel getHotelByID(int id){

        for(int i = 0; i< hotels.size(); i++){
            if(hotels.get(i).id == id)
            {
                return hotels.get(i);
            }
        }
        return null;
    }
}
