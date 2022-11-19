package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Tim", 10,15);
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(8);
        System.out.println(player);

        player.setWeapon("Stormbringer");
        saveObject(player);
        loadObject(player);
        System.out.println(player);

        Monster monster = new Monster("MosterHigh",30,78);
        System.out.println(monster.toString());
        saveObject(monster);
//        loadObject(monster);
        System.out.println(monster);

        //Implementing a new monster class but using an interface
        //Only can use the methods from the interface
        //Example cannot use: werewolf.getStrength()
        ISaveable werewolf = new Monster("Werewolf",20,40);




        //But we CAN cast ( (Monster) werewolf), and use the methods from the monster class
        System.out.println( ( (Monster) werewolf).getStrength() );



        //loadObject(player);
        //saveObject(player);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 to enter a string\n"+
                "0 to quit");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){

                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectLoad){
        ArrayList<String> readValues = readValues();
        objectLoad.read(readValues);
    }

}


















