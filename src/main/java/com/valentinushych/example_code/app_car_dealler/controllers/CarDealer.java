package com.valentinushych.example_code.app_car_dealler.controllers;



import com.valentinushych.example_code.app_car_dealler.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    List<Car> soldCar = new ArrayList<>();
    List<Car> forSaleCar = new ArrayList<>();

    public void addSoldCar(Car car){
        soldCar.add(car);
    }

    public void addForSaleCare(Car car){
        forSaleCar.add(car);
    }

    public void saleCar(Car car){
        forSaleCar.remove(car);
        soldCar.add(car);
    }

    public Car findCarByBrand(String brand){
        for(Car car: forSaleCar){
            if(car.getBrand().equals(brand)){
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllSoldCar(){
        return soldCar;
    }

    public List<Car> getAllForSaleCar(){
        return forSaleCar;
    }
}
