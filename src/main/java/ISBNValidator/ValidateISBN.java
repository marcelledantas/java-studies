package ISBNValidator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;


public class ValidateISBN {

    public boolean checkISBN(String isbn){

//        int sum = 0, j = 9;
//        int currentValue = Integer.parseInt(isbn);
//        int x = 10;
//        ArrayList<Integer> isbn_array = new ArrayList<Integer>();
//        ArrayList<Integer> isbn_array_reversed = new ArrayList<Integer>();
//
//        while(j > 0){
//            isbn_array.add(currentValue % 10);
//            currentValue = currentValue / 10;
//            j --;
//        }
//
//        isbn_array.add(9,0);
//
//        int tam = isbn_array.size() - 1;
//        for(int i = tam; i >= 0; i--){
//            isbn_array_reversed.add(isbn_array.get(i));
//        }
//
//        for(int i = 0; i < isbn_array.size(); i++){
//            currentValue = isbn_array_reversed.get(i) * x;
//            sum += currentValue;
//            x--;
//        }
//
//        if(sum % 11 == 0){
//            System.out.println("It is a valid ISBN");
//            return true;
//        }
//        System.out.println("It is not a valid ISBN");
//        return false;


//        for(int i = 0; i < 10; i++) {
//            if(Character.getNumericValue(isbn.charAt(i)) > 10){
//                throw new NumberFormatException("ISBN have a non numeric value");
//            }
//        }

        int total = 0;

        if(isbn.length() == 13) {

            for(int i = 0; i < 13; i++){

                if(i % 2 == 0){
                    total += Character.getNumericValue(isbn.charAt(i));
                } else{
                    total += Character.getNumericValue(isbn.charAt(i)) * 3;
                }
            }

            return (total % 10 == 0);
        }

        if(isbn.length() != 10){
            throw new NumberFormatException("ISBN numbers must be 10 digits long");
        }

        for(int i = 0; i < 10; i++){

            if(!Character.isDigit(isbn.charAt(i))){

                if(i == 9 && isbn.charAt(i) == 'X'){
                    // This is ok
                    total += 10;

                }
                else
                {
                    throw new NumberFormatException("ISBN have a non numeric value");
                }
            }
            else{
                total += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
            }

        }

        return total % 11 == 0;
    }
}
