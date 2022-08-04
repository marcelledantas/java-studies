package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter the item: ");
        String currentItem = scanner.nextLine();
        System.out.println("Please enter the replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter the  item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchItem(){
        System.out.println("Please enter the item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found the item!" + searchItem + "in our grocery list");
        } else{
            System.out.println("The item is not in our shop list");
        }

    }

    public static void processArrayList(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        //adding the entire content to the new array
        newArrayList.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArrayList = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        //Converting an arrayList to an array
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
