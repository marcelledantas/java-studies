package Arrays;

import java.util.Arrays;

public class RefTypesValueTypes {
    public static void main(String[] args) {
       int myIntValue = 10;
       int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue ++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5]; //Arrays are reference types -> address (in memory) to the object (not the object itself)
        int[] anotherArray = myIntArray; //Two references pointing to the same array in memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        //This is happens because both variables (myIntArray and anotherArray) references the same array in memory
    }
}
