package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println("Original array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//        System.out.println("Reverse array: ");
//        int[] reverseArray = reverse(array);
//        for(int i = 0; i < array.length; i++) {
//            System.out.println(reverseArray[i]);
//        }
        int[] reverseArray = swapElements(array);
        System.out.println("Reverse array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(reverseArray[i]);
        }

        //Another to print an array using toString()
        System.out.println("Array = " + Arrays.toString(array));
    }

    private static int[] reverse(int[] arr){
        int[] reverseArray = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            reverseArray[k] = arr[i];
            k++;
        }
        return reverseArray;
    }

    private static int[] swapElements (int[] arr){
        int maxIndex = arr.length - 1;
        int halfIndex = (arr.length / 2);
        for(int i = 0; i < halfIndex; i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
        return arr;
    }
}
