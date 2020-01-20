package com.valentinushych.example_code.app_car_dealler.models;

import java.util.List;

public class SpecialMachine extends Car {
    private String type;
    private String mass;

    public SpecialMachine(String id, String brand, String issueYear, String price, List<Additions> additions,
                          String dateOfSale, String buyer, String type, String mass) {
        super(id, brand, issueYear, price, additions, dateOfSale, buyer);
        this.type = type;
        this.mass = mass;
    }

    public String getType() {
        return type;
    }

    public String getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "SpecialMachine{" +
                "type='" + type + '\'' +
                ", mass='" + mass + '\'' +
                ", id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", issueYear='" + issueYear + '\'' +
                ", price='" + price + '\'' +
                ", additions=" + additions +
                ", dateOfSale='" + dateOfSale + '\'' +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}
