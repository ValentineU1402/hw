package com.valentinushych.example_code.fakedata.generators;

import com.valentinushych.example_code.fakedata.utils.RandomUtils;

import java.awt.*;

public class ColorGenerator implements Generator {

    public Color generate(){
        return new Color(
                RandomUtils.randomNumberFromRange(255),
                RandomUtils.randomNumberFromRange(255),
                RandomUtils.randomNumberFromRange(255));
    }
}
