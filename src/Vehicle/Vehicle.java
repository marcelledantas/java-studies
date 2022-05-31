package Vehicle;


public class Vehicle {

    private String color;
    private int currentDirection;
    private int currentVelocity;


    public Vehicle(String color) {
        this.color = color;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}

