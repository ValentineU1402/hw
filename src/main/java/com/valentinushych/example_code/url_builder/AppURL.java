package com.valentinushych.example_code.url_builder;

import com.valentinushych.example_code.url_builder.model.MyURL;

import java.util.HashMap;
import java.util.Map;

public class AppURL {

    public static void main(String[] args) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("Key1", "values1");
        parameters.put("Key2", "values2");
        parameters.put("Key3", "values3");
        parameters.put("Key4", "values4");

        MyURL urlBuilder = new MyURL.Builder().withProtocol("http")
                .withDomain("www.google.com")
                .withPort(80443)
                .withPath("manual/differentials/")
                .withParameters(parameters)
                .withParameter("lol")
                .withParameters("String", "string")
                .build();

        System.out.println(urlBuilder);
    }
}
