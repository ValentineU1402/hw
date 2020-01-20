package com.valentinushych.example_code.fakedata.models;

import com.valentinushych.example_code.fakedata.enums.TypeCard;

public class CreditCard {
    private String cardNumber;
    private String expireDate;
    private String owner;
    private TypeCard typeCard;
    private String securityCode;

    public CreditCard(String cardNumber, String expireDate, String owner, TypeCard typeCard, String securityCode) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.owner = owner;
        this.typeCard = typeCard;
        this.securityCode = securityCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getOwner() {
        return owner;
    }

    public TypeCard getTypeCard() {
        return typeCard;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    @Override
    public String toString() {
        return typeCard + "\n"
                + cardNumber +
                "\n" + owner +
                "\t\t" + expireDate;
    }

}
