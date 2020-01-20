package com.valentinushych.example_code.app_avto_service.model.survices;

public class OilCheck implements IService {
    private String typeWork;
    private String priseWork;

    @Override
    public void perform() {
        typeWork = "Oil check";
        priseWork = "5";
    }

    @Override
    public String getTypeWork() {
        return typeWork;
    }

    public void setPriseWork(String priseWork) {
        this.priseWork = priseWork;
    }

    @Override
    public String getPriseWork() {
        return priseWork;
    }

    @Override
    public String toString() {
        return "OilCheck{" +
                "typeWork='" + typeWork + '\'' +
                ", priseWork='" + priseWork + '\'' +
                '}';
    }
}
