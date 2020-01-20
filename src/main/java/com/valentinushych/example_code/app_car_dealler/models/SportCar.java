package com.valentinushych.example_code.app_car_dealler.models;

import java.util.List;

public class SportCar extends Car {
    private String maxSpeed;
    private String engineVolume;
    private String power;

    public SportCar(String id, String brand, String issueYear, String price, List<Additions> additions,
                    String dateOfSale, String buyer, String maxSpeed, String engineVolume, String power) {
        super(id, brand, issueYear, price, additions, dateOfSale, buyer);
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.power = power;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public String getPower() {
        return power;
    }

}
