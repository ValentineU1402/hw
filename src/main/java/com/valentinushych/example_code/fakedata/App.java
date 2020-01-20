package com.valentinushych.example_code.fakedata;

public class App {

    public static void main(String[] args) {
        FakeData data = new FakeData();
        for (int i = 0; i < 2; i++) {
            System.out.println("Email: " + data.getEmailGenerator().generate()
            +"\n\nCredit Card: " + data.getCreditCardGenerator().generate()
            + "\n\nColor: " + data.getColorGenerator().generate()
            + "\nCurrency: " + data.getCurrencyGenerator().generate() + "\n\n");
        }
    }

}
