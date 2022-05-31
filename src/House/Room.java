package House;

public class Room {

    private Furniture furniture;
    private double area;
    private String name;
    private String color;
    private House house;

    public Room(Furniture furniture, double area, String name, String color, House house) {
        this.furniture = furniture;
        this.area = area;
        this.name = name;
        this.color = color;
        this.house = house;
    }

    public void guessRoom() {
        System.out.println("getSomeFurniture called()");
        if (furniture.IsABedroom()) {
            System.out.println("guessRoom() called: It is a Bedroom");
        } else {
            System.out.println("guessRoom() called: It couldn't identify the room");
        }
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
