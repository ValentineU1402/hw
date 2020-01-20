package com.valentinushych.example_code.app_car_dealler.models;

public class Additions {
    private String name;
    private String description;

    public Additions(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Additions{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
