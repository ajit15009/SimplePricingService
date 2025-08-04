package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    public HotelService hotelService;

    @BeforeEach
    public void setup()
    {
        hotelService = new HotelService();

    }

    @Test
    void shouldReturnHotelByID() {

        int id = 1;
        Hotel hotel= hotelService.getHotelByID(id);
        assertEquals(id, hotel.id);

    }
}