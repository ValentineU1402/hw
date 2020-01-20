package com.valentinushych.example_code.app_order;

import com.valentinushych.example_code.app_order.models.ExpressOrder;
import com.valentinushych.example_code.app_order.models.InsuredOrder;
import com.valentinushych.example_code.app_order.models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppOrder {
    public static void main(String[] args) {
        Orders orders = new Orders();

        Order ordinaryOrders = new OrdinaryOrder("20.11.2019", "10:50", new Random().nextInt());
        orders.add(ordinaryOrders);

        Order expressOrder = new ExpressOrder("20.11.2019", "10:50", new Random().nextInt(), "MLS", 2);
        orders.add(expressOrder);

        Order insuredOrder = new InsuredOrder("20.11.2019", "10:50", new Random().nextInt(), "K", 29.56);
        orders.add(insuredOrder);

        orders.show();
    }

    public static class Orders {
        private List<Order> order = new ArrayList<>();

        public void show() {
            for (Order order : order) {
                System.out.println(order);
            }
        }

        public void add(Order order) {
            this.order.add(order);
        }
    }
}
