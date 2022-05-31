package House;

public class Main {
    public static void main(String[] args) {

        Furniture furniture = new Furniture(10, 1, 1);
        House house = new House(25);
        Room singleRoom = new Room(furniture, 50.25, "bedroom", "pink", house);

        singleRoom.guessRoom();
    }
}
