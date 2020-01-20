package com.valentinushych.example_code.fakedata.enums;

public enum FreeEmailDomain {
    GOOGLE("gmail.com"),
    APPLE("icloud.com"),
    YAHOO("yahoo.com"),
    MICROSOFT("outlook.com"),
    ZOHO("zillum.com");

    private String emailDomain;

    FreeEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getDomain() {
        return emailDomain;
    }
}
