package com.valentinushych.example_code.fakedata.generators;


import com.valentinushych.example_code.fakedata.enums.EmailType;
import com.valentinushych.example_code.fakedata.enums.FreeEmailDomain;
import com.valentinushych.example_code.fakedata.models.Email;
import com.valentinushych.example_code.fakedata.models.Person;
import com.valentinushych.example_code.fakedata.utils.RandomUtils;

public class EmailGenerator implements Generator{

    public Email generate() {
        return createEmailByType(EmailType.values()[RandomUtils.randomNumberFromRange(EmailType.values().length)]);
    }

    public Email generate(EmailType emailType){
        return createEmailByType(emailType);
    }

    private Email createEmailByType(EmailType emailType){
        Person person = RandomUtils.randomPerson();
        String address = "";
        switch (emailType){
            case FIRST_LAST_NAMES:
                address += person.getFirsName().toLowerCase() + "." + person.getLastName().toLowerCase() + "@";
                break;
            case LAST_FIRST_NAMES:
                address += person.getLastName().toLowerCase() + "." + person.getFirsName().toLowerCase() + "@";
                break;
            case FIRST_N_RANDOM_NUMBER:
                address += person.getFirsName().toLowerCase() + RandomUtils.randomNumberFromRange(99) + "@";
                break;
            case LAST_N_YEAR:
                address += person.getLastName().toLowerCase() + person.getYearOfBirth() + "@";
                break;
            default:
                return null;
        }
        return new Email(address, FreeEmailDomain.values()[RandomUtils.randomNumberFromRange(FreeEmailDomain.values().length)].getDomain());
    }
}
