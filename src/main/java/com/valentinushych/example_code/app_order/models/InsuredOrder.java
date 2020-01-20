package com.valentinushych.example_code.app_order.models;

public class InsuredOrder extends Order {
    private String company;
    private double amount;

    public InsuredOrder(String date, String time, int id, String company, double amount) {
        super(date, time, id);
        this.company = company;
        this.amount = amount;
    }

    public String getCompany() {
        return company;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "InsuredOrder{" +
                "\n\tcompany='" + company + '\'' +
                "\n\tamount=" + amount +
                "\n\tdate='" + date + '\'' +
                "\n\ttime='" + time + '\'' +
                "\n\tid=" + id +
                '}';
    }
}
