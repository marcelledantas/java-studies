package Point1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point1 first = new Point1(6, 5);
        Point1 second = new Point1(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point1 point = new Point1();
        System.out.println("distance()= " + point.distance());
    }
}
