package demo;

import java.util.List;
import java.util.ArrayList;

// Lớp PhoneNumber
public class PhoneNumber {
    private String name;
    private List<String> phoneNumbers;

    // Constructor
    public PhoneNumber(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();

    }

    // Getter và Setter
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

