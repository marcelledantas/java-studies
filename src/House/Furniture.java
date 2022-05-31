package House;

public class Furniture {

    private int quantity;
    private int bed;
    private int desk;

    public Furniture(int quantity, int bed, int desk) {
        this.quantity = quantity;
        this.bed = bed;
        this.desk = desk;
    }

    public boolean IsABedroom() {
        System.out.println("IsABedroom() called:");
        if (bed == 1) {
            return true;
        }
        return false;
    }
}
