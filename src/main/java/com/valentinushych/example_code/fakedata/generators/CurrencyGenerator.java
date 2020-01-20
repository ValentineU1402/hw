package com.valentinushych.example_code.fakedata.generators;


import com.valentinushych.example_code.fakedata.enums.Currency;
import com.valentinushych.example_code.fakedata.utils.RandomUtils;

public class CurrencyGenerator implements Generator {

    @Override
    public Currency generate() {
            return Currency.values()[RandomUtils.randomNumberFromRange(Currency.values().length)];
    }
}
