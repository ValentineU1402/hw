package com.valentinushych.example_code.app_car_dealler.models;

import java.util.List;

public class UsedCar extends Car {
    private String mileage;
    private Customer customer;

    public UsedCar(String id, String brand, String issueYear, String price, List<Additions> additions,
                   String dateOfSale, String buyer, String mileage, Customer customer) {
        super(id, brand, issueYear, price, additions, dateOfSale, buyer);
        this.mileage = mileage;
        this.customer = customer;
    }

    public String getMileage() {
        return mileage;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "mileage='" + mileage + '\'' +
                ", customer=" + customer +
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
