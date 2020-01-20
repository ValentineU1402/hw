package com.valentinushych.example_code.app_avto_service.model;

import com.valentinushych.example_code.app_avto_service.model.customerService.Customer;
import com.valentinushych.example_code.app_avto_service.model.customerService.Worker;
import com.valentinushych.example_code.app_avto_service.model.product.Product;
import com.valentinushych.example_code.app_avto_service.model.survices.IService;

import java.util.ArrayList;
import java.util.List;

public class ServiceAct {
    private static int nextId = 1;
    private int id;
    private List<IService> services = new ArrayList<>();
    private List<Product> product = new ArrayList<>();
    private Worker nameWorker;
    private Customer nameCustomer;

    public ServiceAct(Worker nameWorker, Customer nameCustomer) {
        this.id = assignId();
        this.nameWorker = nameWorker;
        this.nameCustomer = nameCustomer;
    }

    private int assignId(){
        return nextId++;
    }

    public void addServices(IService services) {
        this.services.add(services);
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }

    public int getId() {
        return id;
    }

    public List<IService> getService() {
        return this.services;
    }

    public List<Product> getProduct() {
        return product;
    }

    public String getPrice(){
        int result = 0;
        for (IService serv: services){
            result += Integer.parseInt(serv.getPriseWork());
        }
        for (Product prod : product){
            result += Integer.parseInt(prod.getPriseProduct());
        }
        return String.valueOf(result);
    }

    public String getNameWorker() {
        return nameWorker.getFullName();
    }

    public String getNameCustomer() {
        return nameCustomer.getFullName();
    }

    @Override
    public String toString() {
        return "ServiceAct{" +
                "id='" + id + '\'' +
                ", services=" + services +
                ", carProduct=" + product +
                ", nameWorker='" + nameWorker + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                '}';
    }
}
