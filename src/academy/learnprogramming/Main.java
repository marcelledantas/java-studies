package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Switch statement
        int value = 2;
        if(value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else if(value == 3){
            System.out.println("Value was 3");
        }


        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2: case 3: case 4:
                System.out.println("Value was 2 or 3 or 4");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'D';

        switch (switchChar){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The letter " + switchChar + " was found");
                break;
            default:
                System.out.println("Not found");
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("It is not january");
        }

        printDayOfTheWeek(11);
        printNumberInWord(11);

        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));


        for(int i = 8; i > 1; i--){
            System.out.println("10.000 of interest of " + i + "% " + String.format("%.2f", ForLoop.calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i = 11; i < 43; i++){
            if(ForLoop.isPrime(i)){
                System.out.println("Prime number found: " + i);
                count ++;
                if(count == 15){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        System.out.println("The number of prime numbers between 1-10 is: " + count);

        ForLoop.sumThreeAndFive();

        System.out.println(ForLoop.sumOdd(1, 100));

        System.out.println(ForLoop.sumDigits(- 1255));



    }

    public static void printDayOfTheWeek (int day){

        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }

    public static void printNumberInWord (int number){

        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }



}
