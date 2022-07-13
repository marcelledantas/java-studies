package Polymorfism;

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Starting engine - Ford";
    }
}

