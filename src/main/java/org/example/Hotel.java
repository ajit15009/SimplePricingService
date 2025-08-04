package org.example;

import java.math.BigDecimal;

public class Hotel {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    int id;
     String name;
     BigDecimal price;


    public Hotel(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}