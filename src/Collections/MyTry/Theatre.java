package Collections.MyTry;

import java.util.*;

public class Theatre {
    private final String name;
    private String numSeats;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            } else if(seat1.getPrice() > seat2.getPrice()){
                return 1;
            } else{
                return 0;
            }
        }
    };

    public Theatre(String name, int numberOfRows, int numberSeatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (numberOfRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int rowSeat = 1; rowSeat <= numberSeatsPerRow; rowSeat++){
                double price = 12.00;

                if(row < 'D' && (rowSeat >= 4 && rowSeat <= 9)){
                    price = 14.00;
                }
                if(row > 'F' || (rowSeat < 4 || rowSeat > 9)){ // Seats on the edge (first 3 and last 3) have discounts: 12 seats
                    price = 7.00;
                }

                String rowSeatName = row + String.format("%02d", rowSeat);
                Seat seat = new Seat(rowSeatName, price);
                this.seats.add(seat);
            }
        }

    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserved();
        } else{
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }


    public class Seat implements Comparable<Seat>{
        private String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
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


// Another way of doing it a binary search
//        int low = 0;
//        int high = this.seats.size() - 1;
//
//        while(low <= high){
//           int mid = (low + high)/2;
//           String midSeatNumber = this.seats.get(mid).getSeatNumber();
//           int r = seatNumber.compareTo(midSeatNumber);
//
//           if(r == 0){
//             return seats.get(mid).reserved();
//           }
//
//           else if(r > 0){
//               low = mid + 1;
//           }
//           else{
//               high = mid - 1;
//           }
//        }

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