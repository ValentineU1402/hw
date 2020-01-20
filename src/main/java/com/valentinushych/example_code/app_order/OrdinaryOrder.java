package com.valentinushych.example_code.app_order;

import com.valentinushych.example_code.app_order.models.Order;

public class OrdinaryOrder extends Order {

    public OrdinaryOrder(String date, String time, int id) {
        super(date, time, id);
    }

    @Override
    public String toString() {
        return "OrdinaryOrder{" +
                "\n\tdate='" + date + '\'' +
                "\n\ttime='" + time + '\'' +
                "\n\tid=" + id +
                '}';
    }
}
