package Arrays;

import java.sql.Array;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int count = scan.nextInt();
        System.out.println("Minimum value of the array is " + findMin(readIntegers(count)));
    }

    private static int[] readIntegers(int count){
        int[] arrayOfIntegers = new int[count];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < count; i++){
            System.out.println("Enter an integer number: ");
            int integerNumber = scan.nextInt();
            arrayOfIntegers[i] = integerNumber;
        }
        return arrayOfIntegers;
    }

    private static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
