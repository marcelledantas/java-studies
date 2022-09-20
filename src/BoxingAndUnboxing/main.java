package BoxingAndUnboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> srtArrayList = new ArrayList<>();
        srtArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); //a primitive type is not a class
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = 54;
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5 )
        {
            myDoubleArrayList.add(dbl);
        }

        for(int i = 0; i <= 10; i++ )
        {
            double value = myDoubleArrayList.get(i);
            System.out.println(i + " -- >" + value);
        }
    }
}
