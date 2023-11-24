package demo;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();


        phoneBook.insertPhone("John", "123456789");
        phoneBook.insertPhone("Alice", "987654321");
        phoneBook.insertPhone("Bob", "555555555");


        System.out.println("Danh sách trước khi sắp xếp:");
        printPhoneList(phoneBook);


        phoneBook.sort();
        System.out.println("\nDanh sách sau khi sắp xếp:");
        printPhoneList(phoneBook);

        
        PhoneNumber searchResult = phoneBook.searchPhone("Alice");
        if (searchResult != null) {
            System.out.println("\nThông tin người dùng (Alice):");
            System.out.println("Name: " + searchResult.getName());
            System.out.println("Phone Numbers: " + searchResult.getPhoneNumbers());
        } else {
            System.out.println("\nKhông tìm thấy người dùng có tên Alice.");
        }
    }

    
    private static void printPhoneList(PhoneBook phoneBook) {
        for (PhoneNumber contact : phoneBook.getPhoneList()) {
            System.out.println("Name: " + contact.getName() + ", Phone Numbers: " + contact.getPhoneNumbers());
        }
    }
}

