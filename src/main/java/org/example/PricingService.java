package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PricingService {

    @Autowired
    public HotelService hotelService;


    @GetMapping("/hotel/{id}")
    public  ResponseEntity<Hotel> getHotelPrice(@PathVariable int id) {
        System.out.println("Hotel ID received:" + id);
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<Hotel>(hotelService.getHotelByID(id), headers, HttpStatus.OK);
    }
}
