package demo;

import java.util.List;
import java.util.ArrayList;


public class PhoneNumber {
    private String name;
    private List<String> phoneNumbers;

 
    public PhoneNumber(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();

    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

