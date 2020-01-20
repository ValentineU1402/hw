package com.valentinushych.example_code.fakedata.generators;

import com.company.course.lectures.fakedata.enums.TypeCard;
import com.company.course.lectures.fakedata.models.CreditCard;
import com.company.course.lectures.fakedata.utils.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreditCardGenerator implements Generator{
    public CreditCard generate() {
        return generate(TypeCard.values()[RandomUtils.randomNumberFromRange(TypeCard.values().length)]);
    }

    public CreditCard generate(TypeCard typeCard){
        String numCard = typeCard.getIndustryIdentifier() + getRandomNumberCard();
        return new CreditCard(numCard, getCardEndDate(), RandomUtils.randomPerson().getName(), typeCard, getNumberSecurityCode());
    }

    private String getRandomNumberCard(){
        String num = "";
        for(int i = 0; i < 15; i++){
            num += RandomUtils.randomNumberFromRange(9);
        }

        return num;
    }

    private String getNumberSecurityCode(){
        String num = "";
        for(int i = 0; i < 3; i++){
            num += RandomUtils.randomNumberFromRange(9);
        }

        return num;
    }

    private String getCardEndDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, + RandomUtils.randomNumberFromRange(1, 5));
        return new SimpleDateFormat("dd/MM/yyyy")
                .format(calendar.getTime()) ;
    }

}
