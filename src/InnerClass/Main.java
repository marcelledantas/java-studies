package InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        // When we are creating an inner class we have to have an instance of the outer class.
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3); // Instantiated a inner class => (Outer class).(Inner class) = instance of outer class.(inner class constructor)
//        Gearbox second = new Gearbox.Gear(2,15.4); //'InnerClass.Gearbox' is not an enclosing class
        // If we create a inner class, we probably wouldn't want the user to have access to it.
        // The inner class should be instantiated in the outer class.
//        System.out.println(first.driveSpeed(1000));

        mcLaren.addGear(2,5);
        mcLaren.changeGear(2);
    }
}
