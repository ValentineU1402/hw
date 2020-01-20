package com.valentinushych.example_code.app_order.models;

public class Order {
    protected String date;
    protected String time;
    protected int id;

    public Order(String date, String time, int id) {
        this.date = date;
        this.time = time;
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
