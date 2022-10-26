package LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; //Internally, JAVA is setting the anotherCustomer to point to customer
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);


        //The elements 3 and 4 have been moved because we added the extra element '2'.
        //For a huge amount of data in the arraylist, this operation can be very slow.
        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        //The linked-list is an alternative for this problem. Each item in the list holds a link to the item that hold the actual value that we want to store it.
    }
}
