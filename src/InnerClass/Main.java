package InnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {

//        class ClickLister implements Button.OnClickListener{
//            public ClickLister(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title){
//                System.out.printf(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickLister(new ClickLister());

        btnPrint.setOnClickLister(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}

//        Gearbox mcLaren = new Gearbox(6);
// When we are creating an inner class we have to have an instance of the outer class.
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3); // Instantiated a inner class => (Outer class).(Inner class) = instance of outer class.(inner class constructor)
//        Gearbox second = new Gearbox.Gear(2,15.4); //'InnerClass.Gearbox' is not an enclosing class
// If we create a inner class, we probably wouldn't want the user to have access to it.
// The inner class should be instantiated in the outer class.
//        System.out.println(first.driveSpeed(1000));


//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));