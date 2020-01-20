package com.valentinushych.example_code.fakedata.generators;

import com.company.course.lectures.fakedata.utils.RandomUtils;

import java.awt.*;

public class ColorGenerator implements Generator {

    public Color generate(){
        return new Color(
                RandomUtils.randomNumberFromRange(255),
                RandomUtils.randomNumberFromRange(255),
                RandomUtils.randomNumberFromRange(255));
    }
}
