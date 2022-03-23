package academy.learnprogramming;

public class ForLoop {

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime (int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= (long)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void sumThreeAndFive (){
        int sumThereAndFive = 0;
        int countNumber = 0;
        for (int i = 0; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number: " + i);
                sumThereAndFive += i;
                countNumber ++;
            }
            if(countNumber == 5){
                break;
            }
        }
        System.out.println("Sum of numbers under condition: " + sumThereAndFive);
    }

    public static boolean isOdd (int num){
        if(num < 0){
            return false;
        }

        if(num % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }


    public static int sumOdd (int start, int end){
        int sum;
        sum = 0;
        if(end < start || start < 0 || end < 0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static int sumDigits (int number){
        int sumDigits = 0;
        int digLeastSig = 0;
        if (number < 10){
            return -1;
        }

        while(number > 0){
            digLeastSig = number % 10;
            sumDigits += digLeastSig;

            number = number / 10;
        }

        return sumDigits;
    }

    public static boolean isPalindrome (int number){
        int reverse = 0;
        int lastDigit = 0;

        if(number < 0){
            number *= -1;
        }
        int originalNumber = number;

        while(number > 0){
            lastDigit = number % 10; //Extract the last digit
            reverse *= 10;
            reverse += lastDigit;
            number /= 10; //Update number
        }
        if(reverse == originalNumber){
            return true;
        }
        return false;
    }

}
