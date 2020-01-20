package com.valentinushych.example_code.fakedata.generators;

import com.company.course.lectures.fakedata.enums.Currency;
import com.company.course.lectures.fakedata.utils.RandomUtils;

public class CurrencyGenerator implements Generator {

    @Override
    public Currency generate() {
            return Currency.values()[RandomUtils.randomNumberFromRange(Currency.values().length)];
    }
}
