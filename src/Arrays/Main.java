package Arrays;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
//        int[] myIntegers = getIntegers(5);
//
//        for(int i = 0; i < myIntegers.length; i++){
//            System.out.println("myIntegers value = " + myIntegers[i] + " element i = " + i);
//        }
//
//        System.out.println("Average of myIntegers arrays = " + getAverage(myIntegers));
//
//        int[] myIntVariables = {1,2,3,4,5,6,7,8,9,10};
//
//        double[] myDoubleArray = new double[10];

//        for(int i = 0; i < myDoubleArray.length; i++){
//            myDoubleArray[i] = i * 10;
//            System.out.println("i = " + i + "  myDoubleArray[i] = " + myDoubleArray[i]);
//        }

//        for(int i = 0; i < 10; i++){
//            myDoubleArray[i] = i * 10;
//            System.out.println("i = " + i + "  myDoubleArray[i] = " + myDoubleArray[i]);
//        }

//        printArray(myDoubleArray);
//
//        int[] myIntArray = new int[10];
//
//        System.out.println(myIntVariables[5]);

        int[] myIntegers = getIntegers(5);
        int[] myIntegersSorted = sortArray(myIntegers);
        printArray(myIntegersSorted);
    }


//    public static int getAverage (int[] array){
//        int sum = 0;
//
//        for(int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//
//        return sum/array.length;
//    }


    public static int[] getIntegers(int n){
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[n];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }


    public static int[] sortArray (int[] array){

        int[] sortedArray = new int[array.length];
        int maiorPos = 0;
        int aux;
        int maiorValor;

        for(int i = 0; i < array.length; i++){
            maiorValor = array[i];
            for(int j = i; j < array.length; j++){

                if(array[j] >= maiorValor){
                    maiorValor = array[j];
                    maiorPos = j;
                }
            }

            sortedArray[i] = array[maiorPos];
            aux = array[i];
            array[i] = array[maiorPos];
            array[maiorPos] = aux;
        }

        return sortedArray;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents  " + array[i]);
        }
    }

}
