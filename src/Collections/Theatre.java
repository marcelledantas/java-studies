package Collections;

import java.util.ArrayList;

public class Theatre {
    private final String theatherName;
    private ArrayList<Seat> seats = new ArrayList<>();

    public Theatre(String theatherName, int numRows, int seatsPerRow) {
        this.theatherName = theatherName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatherName() {
        return theatherName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = null;
        for(Seat seat : this.seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;
            }
        }

        if(requestSeat == null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat : this.seats){
            System.out.println(seat.getSeatNumber());
        }
    }


    private class Seat{

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("This seat " + seatNumber + " was canceled");
                return true;
            }
            else{
                System.out.println("This seat " + seatNumber + "was not reserved" );
                return false;
            }
        }


    }


}















