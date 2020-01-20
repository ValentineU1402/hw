package com.valentinushych.example_code.app_avto_service.model.survices;

public class OilChange implements IService {
    private String typeWork;
    private String priseWork;

    @Override
    public void perform() {
        typeWork = "Oil change";
        priseWork = "7";
    }

    public String getTypeWork() {
        return typeWork;
    }

    public String getPriseWork() {
        return priseWork;
    }

    public void setPriseWork(String priseWork) {
        this.priseWork = priseWork;
    }

    @Override
    public String toString() {
        return "OilChange{" +
                "typeWork='" + typeWork + '\'' +
                ", priseWork='" + priseWork + '\'' +
                '}';
    }
}
