package com.valentinushych.example_code.fakedata.models;

public class Email {
    private String address;
    private String domain;

    public Email(String address, String domain) {
        this.address = address;
        this.domain = domain;
    }

    public String getAddress() {
        return address;
    }

    public String getDomain() {
        return domain;
    }

    @Override
    public String toString() {
        return address + domain;
    }
}
