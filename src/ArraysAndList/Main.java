package ArraysAndList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("myIntegers value = " + myIntegers[i] + " element i = " + i);
        }

        System.out.println("Average of myIntegers arrays = " + getAverage(myIntegers));

        int[] myIntVariables = {1,2,3,4,5,6,7,8,9,10};

        double[] myDoubleArray = new double[10];

//        for(int i = 0; i < myDoubleArray.length; i++){
//            myDoubleArray[i] = i * 10;
//            System.out.println("i = " + i + "  myDoubleArray[i] = " + myDoubleArray[i]);
//        }

//        for(int i = 0; i < 10; i++){
//            myDoubleArray[i] = i * 10;
//            System.out.println("i = " + i + "  myDoubleArray[i] = " + myDoubleArray[i]);
//        }

        printArray(myDoubleArray);

        int[] myIntArray = new int[10];

        System.out.println(myIntVariables[5]);
    }

    public static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = i * 10;
            System.out.println("i = " + i + "  myDoubleArray[i] = " + array[i]);
        }
    }

    public static int[] getIntegers(int n){
        System.out.println("Enter " + n + " integer values.\r");

        int[] values = new int[n];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int getAverage (int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum/array.length;
    }
}
