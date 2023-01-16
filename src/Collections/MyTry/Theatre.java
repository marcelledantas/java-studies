package Collections.MyTry;

import java.util.ArrayList;
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

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for(Seat seat : this.seats){
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null){
            System.out.println("Seat " + seatNumber + " not found");
            return false;
        } else{
            return requestedSeat.reserved();
        }
    }



    private class Seat{
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
    }


}
