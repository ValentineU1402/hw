package com.valentinushych.example_code.app_avto_service.model.survices;

public class TyresChange implements IService {
    private String typeWork;
    private String priseWork;

    @Override
    public void perform() {
        typeWork = "Tyres change";
        priseWork = "10";
    }

    @Override
    public String getTypeWork() {
        return typeWork;
    }

    @Override
    public String getPriseWork() {
        return priseWork;
    }

    public void setPriseWork(String priseWork) {
        this.priseWork = priseWork;
    }

    @Override
    public String toString() {
        return "TyresChange{" +
                "typeWork='" + typeWork + '\'' +
                ", priseWork='" + priseWork + '\'' +
                '}';
    }
}
