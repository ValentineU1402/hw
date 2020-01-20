package com.valentinushych.example_code.app_car_dealler.models;

import java.util.List;

public abstract class Car {
    protected String id;
    protected String brand;
    protected String issueYear;
    protected String price;
    protected List<Additions> additions;
    protected String dateOfSale;
    protected String buyer;

    public Car(String id, String brand, String issueYear, String price, List<Additions> additions, String dateOfSale, String buyer) {
        this.id = id;
        this.brand = brand;
        this.issueYear = issueYear;
        this.price = price;
        this.additions = additions;
        this.dateOfSale = dateOfSale;
        this.buyer = buyer;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getIssueYear() {
        return issueYear;
    }

    public String getPrice() {
        return price;
    }

    public List<Additions> getAdditions() {
        return additions;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public String getBuyer() {
        return buyer;
    }


}
