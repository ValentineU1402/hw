package com.valentinushych.example_code.fakedata.utils;

import com.valentinushych.example_code.fakedata.enums.Name;
import com.valentinushych.example_code.fakedata.enums.Surname;
import com.valentinushych.example_code.fakedata.models.Person;

import java.util.Calendar;
import java.util.Random;

public class RandomUtils {
    public static int randomNumberFromRange(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int randomNumberFromRange(int max){
        return new Random().nextInt(max);
    }

    public static Person randomPerson(){
        return new Person(Name.values()[randomNumberFromRange(Name.values().length)].toString(),
                Surname.values()[randomNumberFromRange(Surname.values().length)].toString(),
                Integer.toString(randomNumberFromRange(1920, Calendar.getInstance().get(Calendar.YEAR) - randomNumberFromRange(5, 10))));
    }
}
