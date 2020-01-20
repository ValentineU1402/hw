package com.valentinushych.example_code.url_builder;

import com.valentinushych.example_code.url_builder.model.MyURL;

public class AppURL {

    public static void main(String[] args){
        MyURL urlBuilder = new MyURL.Builder().withProtocol("http")
                .withDomain("www.google.com")
                .withPort(80443)
                .withPath("manual/differentials/")
                .withParameters("key", "value")
                .build();

        System.out.println(urlBuilder);

        urlBuilder = new MyURL.Builder(urlBuilder.getProtocol(), urlBuilder.getDomain(), urlBuilder.getPort(),
                urlBuilder.getPath(), urlBuilder.getParameter()).withParameter("login").build();
       System.out.println(urlBuilder);

    }

}
