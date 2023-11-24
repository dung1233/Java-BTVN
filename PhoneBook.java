package demo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class PhoneBook extends Phone {
    private List<PhoneNumber> phoneList;
    public PhoneBook() {
        this.phoneList = new ArrayList<>();
    }
    @Override
    void insertPhone(String name, String phone) {
        PhoneNumber existingContact = null;


        for (PhoneNumber contact : phoneList) {
            if (contact.getName().equals(name)) {
                existingContact = contact;
                break;
            }
        }
        if (existingContact == null) {
            PhoneNumber newContact = new PhoneNumber(name);
            newContact.getPhoneNumbers().add(phone);
            phoneList.add(newContact);
        } else {

            if (!existingContact.getPhoneNumbers().contains(phone)) {
                existingContact.getPhoneNumbers().add(phone);
            }
        }
    }
    @Override
    void removePhone(String name) {
        phoneList.removeIf(contact -> contact.getName().equals(name));
    }
    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber contact : phoneList) {
            if (contact.getName().equals(name)) {
                if (contact.getPhoneNumbers().contains(oldPhone)) {
                    contact.getPhoneNumbers().remove(oldPhone);
                    contact.getPhoneNumbers().add(newPhone);
                }
                break;
            }
        }
    }
    @Override
    PhoneNumber searchPhone(String name) {
        for (PhoneNumber contact : phoneList) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
    @Override
    void sort() {
        Collections.sort(phoneList, (contact1, contact2) -> contact1.getName().compareToIgnoreCase(contact2.getName()));
    }
    public List<PhoneNumber> getPhoneList() {
        return phoneList;
    }
}

