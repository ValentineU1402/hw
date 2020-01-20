package com.valentinushych.example_code.app_avto_service.controler;

import com.valentinushych.example_code.app_avto_service.model.ServiceAct;

import java.util.ArrayList;
import java.util.List;

public class ServiceManager {
    List<ServiceAct> listAct = new ArrayList<>();
    List<ServiceAct> listPaidAct = new ArrayList<>();

    public void addToAct(ServiceAct act) {
        listAct.add(act);
    }

    public void closeAct(ServiceAct act) {
        listAct.remove(act);
        listPaidAct.add(act);
    }

    public String createServiceAct(ServiceAct act){
        String stringAct = "Act #: " + act.getId();
        stringAct += "\nServices:" +
                (!act.getService().isEmpty() ? createStringServices(act) + "\n" : "\nwithout service\n\n") +
                "\nProduct:" + (!act.getProduct().isEmpty() ? createStringProduct(act) + "\n" : "\nwithout product\n\n") +
                "\nWorker: " + act.getNameWorker() + "\nCustomer: " + act.getNameCustomer() +
                "\n\nPrice: " + act.getPrice() + " $";
        return stringAct;
    }

    private String createStringServices(ServiceAct act){
        String servicesString = "";
        for (int i = 0; i < act.getService().size(); i++)
            servicesString += "\n" + (i + 1) + ". " + act.getService().get(i).getTypeWork() +
                    " - $ " + act.getService().get(i).getPriseWork();

            return servicesString;
    }

    private String createStringProduct(ServiceAct act){
        String productString = "";
        for(int i = 0; i < act.getProduct().size(); i++){
            productString += "\n" + (i+1) + ". " + act.getProduct().get(i).getTypeProduct() +
                    " - $ " + act.getProduct().get(i).getPriseProduct();
        }
        return  productString;
    }

    public ServiceAct findById(int i) {
        for (ServiceAct a : listAct) {
            if (a.getId() == i) {
                return a;
            }
        }
        return null;
    }

    public ServiceAct findByWorker(String worker) {
        for (ServiceAct a : listAct) {
            if (a.getNameWorker().equals(worker)) {
                return a;
            }
        }
        return null;
    }

    public ServiceAct findByCustomer(String customer) {
        for (ServiceAct a : listAct) {
            if (a.getNameCustomer().equals(customer)) {
                return a;
            }
        }
        return null;
    }

    public List<ServiceAct> getAllAct() {
        return listAct;
    }

}
