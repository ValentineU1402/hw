package com.valentinushych.example_code.app_avto_service;

import com.company.course.homeworks.homework_10.AvtoService.controler.ServiceManager;
import com.company.course.homeworks.homework_10.AvtoService.model.ServiceAct;
import com.company.course.homeworks.homework_10.AvtoService.model.customerService.Customer;
import com.company.course.homeworks.homework_10.AvtoService.model.customerService.Worker;
import com.company.course.homeworks.homework_10.AvtoService.model.product.Product;
import com.company.course.homeworks.homework_10.AvtoService.model.survices.IService;
import com.company.course.homeworks.homework_10.AvtoService.model.survices.OilChange;
import com.company.course.homeworks.homework_10.AvtoService.model.survices.OilCheck;
import com.company.course.homeworks.homework_10.AvtoService.model.survices.TyresChange;

public class appServiceCenter {
    public static void main(String[] args) {
        ServiceManager manager = createManager();

        System.out.println(manager.createServiceAct(manager.findByWorker("Adam Saddler")));

        System.out.println(manager.findById(2));
    }

    private static ServiceManager createManager() {
        ServiceManager manager = new ServiceManager();

        IService oilCheck = new OilCheck();
        oilCheck.perform();
        IService oilChange = new OilChange();
        oilChange.perform();
        IService tyresChange = new TyresChange();
        tyresChange.perform();
        Product oil = new Product("Oleina", "20");
        Product tyres = new Product("Michelin", "50");
        Product drives = new Product("Michelin", "30");

        ServiceAct act = new ServiceAct(new Worker("Adam", "Saddler"), new Customer("Evan", "Piers"));
        act.addServices(oilCheck);
        act.addServices(oilChange);
        act.addServices(tyresChange);
        act.addProduct(oil);
        act.addProduct(tyres);
        act.addProduct(drives);

        manager.addToAct(act);

        act = new ServiceAct(new Worker("John", "Smith"), new Customer("Christopher", "Johns"));
        act.addServices(oilChange);
        act.addProduct(oil);

        manager.addToAct(act);

        return manager;
    }

}
