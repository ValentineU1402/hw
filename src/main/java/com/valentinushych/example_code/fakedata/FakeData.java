package com.valentinushych.example_code.fakedata;

import com.valentinushych.example_code.fakedata.generators.*;

public class FakeData {

    public ColorGenerator getColorGenerator(){
        return new ColorGenerator();
    }

    public CurrencyGenerator getCurrencyGenerator(){ return new CurrencyGenerator(); }

    public EmailGenerator getEmailGenerator(){
        return new EmailGenerator();
    }

    public CreditCardGenerator getCreditCardGenerator(){
        return new CreditCardGenerator();
    }

}
