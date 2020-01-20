package com.valentinushych.example_code.fakedata.enums;

public enum TypeCard {
    MASTERCARD(5),
    MAESTRO(6),
    VISA(4);

    private Integer industryIdentifier;

    TypeCard(Integer industryIdentifier) {
        this.industryIdentifier = industryIdentifier;
    }

    public Integer getIndustryIdentifier() {
        return industryIdentifier;
    }
}
