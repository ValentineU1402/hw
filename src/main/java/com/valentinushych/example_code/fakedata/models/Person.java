package com.valentinushych.example_code.fakedata.models;

public class Person {
    private String firsName;
    private String lastName;
    private String yearOfBirth;

    public Person(String firsName, String lastName, String yearOfBirth) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return firsName + " " + lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
}
