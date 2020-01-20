package com.valentinushych.example_code.app_mapping_with_exeption.models;

public class AnimalRecord {
    private String shelter;
    private String animalID;
    private String intakeDate;
    private String intakeType;
    private String intakeCondition;
    private Animal animalType;
    private String group;
    private String breed1;
    private String breed2;

    public AnimalRecord() {
    }

    public AnimalRecord(String shelter, String animalID, String intakeDate, String intakeType, String intakeCondition, Animal animalType, String group, String breed1, String breed2) {
        this.shelter = shelter;
        this.animalID = animalID;
        this.intakeDate = intakeDate;
        this.intakeType = intakeType;
        this.intakeCondition = intakeCondition;
        this.animalType = animalType;
        this.group = group;
        this.breed1 = breed1;
        this.breed2 = breed2;
    }

    public String getShelter() {
        return shelter;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getIntakeDate() {
        return intakeDate;
    }

    public String getIntakeType() {
        return intakeType;
    }

    public String getIntakeCondition() {
        return intakeCondition;
    }

    public Animal getAnimalType() {
        return animalType;
    }

    public String getGroup() {
        return group;
    }

    public String getBreed1() {
        return breed1;
    }

    public String toString() {
        return "AnimalServiceRecord{" +
                "shelter='" + shelter + '\'' +
                ", animalID='" + animalID + '\'' +
                ", intakeDate='" + intakeDate + '\'' +
                ", intakeType='" + intakeType + '\'' +
                ", intakeCondition='" + intakeCondition + '\'' +
                ", animalType='" + animalType + '\'' +
                ", group='" + group + '\'' +
                ", breed1='" + breed1 + '\'' +
                ", breed2='" + breed2 + '\'' +
                '}';
    }
}
