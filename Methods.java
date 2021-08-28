package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Add / Edit / Delete
 */
class Methods {

    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    /**
     * Purpose - Adding new contacts into the list
     */
    public ArrayList addPerson() {

        System.out.println("Enter following details");

        System.out.print("First Name :");
        String firstName = scanner.next();
        System.out.print("Last Name :");
        String lastName = scanner.next();
        System.out.print("Address :");
        String address = scanner.next();
        System.out.print("City :");
        String city = scanner.next();
        System.out.print("State :");
        String state = scanner.next();
        System.out.print("Zip Code :");
        int zip = scanner.nextInt();
        System.out.print("Phone Number :");
        long phoneNo = scanner.nextLong();
        System.out.print("Email :");
        String email = scanner.next();

        Contact contact = new Contact();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNo(phoneNo);
        contact.setEmail(email);

        contactList.add(contact);
        return contactList;
    }


    public void displayContacts() {

        System.out.println("All contact =  " + contactList.size());
        for(int i=0;i<contactList.size();i++){
        System.out.println(contactList.get(i));
        }
    }

    /**
     * Purpose - Editing existing contact
     */
    public void editPerson() {

        System.out.println("Enter a name you want to edit...");
        String editName = scanner.next();

        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(editName)) {
                found = true;
                System.out.println(contact);

                System.out.println("What do you want to edit \n" +
                        "1. First Name / 2. Last Name / 3. Address / 4. City / " +
                        "5. State / 6. Zip code / 7. Phone Number / 8. Email");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new First Name");
                        String newFirstName = scanner.next();
                        contact.setFirstName(newFirstName);
                        break;

                    case 2:
                        System.out.println("Enter new Last Name");
                        String newLastName = scanner.next();
                        contact.setLastName(newLastName);
                        break;

                    case 3:
                        System.out.println("Enter new Address");
                        String newAddress = scanner.next();
                        contact.setAddress(newAddress);
                        break;

                    case 4:
                        System.out.println("Enter new City");
                        String newCity = scanner.next();
                        contact.setCity(newCity);
                        break;

                    case 5:
                        System.out.println("Enter new State");
                        String newState = scanner.next();
                        contact.setState(newState);
                        break;

                    case 6:
                        System.out.println("Enter new Zip code");
                        int newZip = scanner.nextInt();
                        contact.setZip(newZip);
                        break;

                    case 7:
                        System.out.println("Enter new Phone Number");
                        long newPhoneNo = scanner.nextLong();
                        contact.setPhoneNo(newPhoneNo);
                        break;

                    case 8:
                        System.out.println("Enter new Email");
                        String newEmail = scanner.next();
                        contact.setEmail(newEmail);
                        break;
                }
            }
        }
        if (found)
            System.out.println("SUCCESSFUL");
        else
            System.out.println("Name not found");
    }

    /**
     * Purpose - Remove existing contact
     */
    public void removePerson() {

        System.out.println("Enter a name you want to delete...");
        String removeName = scanner.next();

        boolean found = false;
        for (int i = 0; i < contactList.size(); i++) {

            if (contactList.get(i).getFirstName().equals(removeName)) {
                found = true;
                contactList.remove(i);
            }
        }
        if (found)
            System.out.println("SUCCESSFUL");
        else
            System.out.println("Name not found");

    }
}