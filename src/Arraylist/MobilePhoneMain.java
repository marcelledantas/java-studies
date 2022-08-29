package Arraylist;

import java.util.Scanner;

public class MobilePhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("999-9992");

    public static void main(String[] args) {
        boolean quit = false;
        while(!quit){
            int usersChoice = printActions();

            switch (usersChoice){
                case 0:
                    mobilePhone.quit();
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void updateContact(){
        System.out.println("Enter the contact name to be updated:\n ");
        String existingName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingName);

        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter a new contact name\n");
        String newName = scanner.nextLine();
        System.out.println("Enter a new phone number\n");
        String newPhoneNumber = scanner.nextLine();

        Contact newContactRecord = mobilePhone.queryContact(newName);

        Contact newContact = Contact.createContact(newName, newPhoneNumber);

        if(newContact == null){

            if (mobilePhone.updateContact(existingContact, newContact)){
                System.out.println(existingName + " contact updated to " + newName + " - phone number: " + newPhoneNumber);
            }
            else{
                System.out.println("Error updating record");
            }
        }
    }

    private static void removeContact(){
        System.out.println("Enter the contact name to be updated:\n ");
        String existingName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingName);
        if(existingContact == null){
            System.out.println("Contact not found.\n");
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully removed\n");
        }


    }

    private static void addNewContact(){
        System.out.println("Enter the contact name to add: ");
        String name = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Enter the phone number to add: ");
        String phoneNumber = scanner.nextLine();
//        mobilePhone.addNewContact( new Contact(name, phoneNumber));
//        static method createContact = factory method - we want to create a Contact record without having to create a new record contact class. Without necessarily having an instance of an object to call a method on.
       //We can use Contact.createContact because it is a static method
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + newContact.getName() + " , phone = " + newContact.getPhoneNumber());
        } else{
            System.out.println("Cannot add, " + name + " Contact is already on the list");
        }
    }

    private static void printContacts(){
        System.out.println("Contact list");
        mobilePhone.printContacts();
    }

    private static void queryContact(){
        System.out.println("\nEnter the contact name to be updated: \n");
        String existingName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(existingName);
        if(existingContact == null){
            System.out.println("Contact not found.\n");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
    }


    private static int printActions(){
        System.out.println("\nAvailable action:\npress");
        System.out.println(" 0 - to shutdown\n " +
                "1 - to print contacts\n " +
                "2 - to add a new contact\n " +
                "3 - to update an existing contact\n " +
                "4 - to remove an existing contact\n " +
                "5 - to query if an existing contact\n " +
                "6 - to print a list of available actions\n");

        int action = scanner.nextInt();
        return action;
    }

}
