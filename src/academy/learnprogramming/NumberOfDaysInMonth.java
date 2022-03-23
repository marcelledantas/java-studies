package academy.learnprogramming;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year){
        if(year < 1 || year > 9999){
            return false;
        }

        if(year % 400 == 0){
           return true;
        }else if(year % 4 == 0){
            return year % 100 != 0;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        int numberOfDaysMonth;

        switch (month){
            case 1: case 3: case 5: case 7: case 8:  case 10: case 12:
                numberOfDaysMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                numberOfDaysMonth = 30;
                break;
            default:
                if(isLeapYear(year)){
                    numberOfDaysMonth = 29;
                } else{
                    numberOfDaysMonth = 28;
                }
                break;
        }
        return numberOfDaysMonth;
    }
}
