package Collections.MyTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String name;
    private String numSeats;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numberOfRows, int numberSeatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numberOfRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int rowSeat = 1; rowSeat <= numberSeatsPerRow; rowSeat++){
                String rowSeatName = row + String.format("%02d", rowSeat);
                Seat seat = new Seat(rowSeatName);
                this.seats.add(seat);
            }
        }

    }

    public void getSeats(){
        for(Seat seat: this.seats){
            System.out.println(seat.getSeatNumber());
        }
    }

//    public boolean reserveSeat(String seatNumber){
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0){
//            return seats.get(foundSeat).reserved();
//        } else{
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
////        for(Seat seat : this.seats){
////            System.out.println(".");
////            if(seat.getSeatNumber().equals(seatNumber)) {
////                requestedSeat = seat;
////                break;
////            }
////        }
////
////        if(requestedSeat == null){
////            System.out.println("Seat " + seatNumber + " not found");
////            return false;
////        } else{
////            return requestedSeat.reserved();
////        }
//    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        Seat foundSeat = null;
        int low = 0;
        int high = this.seats.size() - 1;

        while(low <= high){
           int mid = (low + high)/2;
           String midSeatNumber = this.seats.get(mid).getSeatNumber();
           int r = seatNumber.compareTo(midSeatNumber);

           if(r == 0){
             return seats.get(mid).reserved();
           }

           else if(r > 0){
               low = mid + 1;
           }
           else{
               high = mid - 1;
           }
        }

        System.out.println("There is no seat " + seatNumber);
        return false;

//        for(Seat seat : this.seats){
//            System.out.println(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if(requestedSeat == null){
//            System.out.println("Seat " + seatNumber + " not found");
//            return false;
//        } else{
//            return requestedSeat.reserved();
//        }
    }

    private class Seat implements Comparable<Seat>{
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserved(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+ getSeatNumber() + " was reserved");
                return true;
            } else{
                System.out.println("Seat " + getSeatNumber() + " is already reserved");
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }


}
