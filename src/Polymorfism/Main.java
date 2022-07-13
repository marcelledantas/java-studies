package Polymorfism;

class Car {
    private String name;
    private boolean engines;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engines = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Starting engine";
    }

    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    public void brake() {
        System.out.println("Hitting the brakes");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngines() {
        return engines;
    }

    public void setEngines(boolean engines) {
        this.engines = engines;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

class Gol extends Car {
    public Gol(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Starting engine - Gol";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Starting engine - Toyota";
    }
}

class Palio extends Car {
    public Palio(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Starting engine - Palio";
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car1", 4);
        System.out.println(car.startEngine());

        Toyota toyota = new Toyota("Car2", 4);
        System.out.println(toyota.startEngine());

        Gol gol = new Gol("Car2", 4);
        System.out.println(gol.startEngine());

        Palio palio = new Palio("Car2", 4);
        System.out.println(palio.startEngine());

        Ford ford = new Ford("Car2", 4);
        System.out.println(ford.startEngine());
    }
}