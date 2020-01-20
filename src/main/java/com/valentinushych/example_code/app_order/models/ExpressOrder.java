package com.valentinushych.example_code.app_order.models;

public class ExpressOrder extends Order {
    private String courier;
    private int daysToDelivery;

    public ExpressOrder(String date, String time, int id, String courier, int daysToDelivery) {
        super(date, time, id);
        this.courier = courier;
        this.daysToDelivery = daysToDelivery;
    }

    public String getCourier() {
        return courier;
    }

    public int getDaysToDelivery() {
        return daysToDelivery;
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
                "\n\tcourier='" + courier + '\'' +
                "\n\tdaysToDelivery=" + daysToDelivery +
                "\n\tdate='" + date + '\'' +
                "\n\ttime='" + time + '\'' +
                "\n\tid=" + id +
                '}';
    }
}
