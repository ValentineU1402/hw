package com.valentinushych.example_code.app_order;

import com.valentinushych.example_code.app_order.models.Order;

import java.util.ArrayList;
import java.util.List;
public class Orders {
    List<Order> orders = new ArrayList<>();

    public void add(Order order){
        orders.add(order);
    }

    public void show(){
        for(Order order : orders){
            System.out.println(order);
        }
    }
}
