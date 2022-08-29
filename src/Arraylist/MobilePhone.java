package Arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(ArrayList<Contact> contactsList, String myNumber) {
        this.myContacts = contactsList;
        this.myNumber = myNumber;
    }

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact newContact){
        if (findContact(newContact)){
//            System.out.println("\n Contact is already on the list \n");
            return false;
        }

        myContacts.add(newContact);
//        System.out.println("Contact: " + newContact.getName() + " , number: " + newContact.getPhoneNumber());
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact.getName());
        if (position < 0){
            System.out.println("\n Contact " + oldContact.getName() + " is not on the list \n");
            return false;
        }

        if (removeContact(oldContact)){

            myContacts.add(newContact);
            System.out.println("Contact: " + newContact.getName() + " , number: " + newContact.getPhoneNumber() + " has been updated");
        }
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact.getName());

        if(position >= 0){
            myContacts.remove(position);
            return true;
        }
        return false;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position < 0){
            System.out.println("Contact " + name + " not found.");
            return null;
        }

        return myContacts.get(position);
    }

    public boolean findContact(Contact contact){

        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i) == contact){
                return true;
            }
        }

        return false;
    }

    public int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName() == name){
                return i;
            }
        }

        return -1;
    }

    public void printContacts(){
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + " - " + myContacts.get(i).getName() + ", " + myContacts.get(i).getPhoneNumber());
        }
    }

    public void quit(){
        System.out.println("Shutting down the system\n");
    }

}
