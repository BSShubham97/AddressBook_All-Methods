package com.bridgelabz;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Scanner;

class OptionMenu extends Methods {

    public ArrayList<Contact> operation() {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {

            System.out.println("SELECT OPTION:  \n 1. ADD CONTACT    \n 2. DISPLAY CONTACTS \n 3. EDIT CONTACT    \n 4. REMOVE CONTACT \n 0. EXIT ");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ArrayList contactList = addPerson();
                    break;

                case 2:
                    displayContacts();
                    break;

                case 3:
                    editPerson();
                    break;

                case 4:
                    removePerson();
                    break;

                default:
                    run = false;
            }
        }
        return contactList;
    }
}

/**
 * Purpose - create new Address Book
 */
class MultipleBooks {

    public void createBook() {

        HashMap<String, ArrayList<Contact>> bookList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            OptionMenu option = new OptionMenu();

            System.out.println("SELECT OPTION \n 1. CREATE ADDRESS BOOK / 0. EXIT ");
            System.out.print("Enter Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Name: ");
                    String addBookName = scanner.next();

                    bookList.put(addBookName, option.operation());
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}