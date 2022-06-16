package Printer;

public class Main {
    public static void main(String[] args) {
        Printer firstPrinting = new Printer(50, true);

        int numberOfPages = 10;

        firstPrinting.fillUpToner(30);

        firstPrinting.simulatePrinting(10);
        System.out.println("Number of pages printed: " + firstPrinting.getNumberOfPages());
        System.out.println("Toner level after firstPrinting " + firstPrinting.getTonerLevel());

//        firstPrinting.fillUpToner(40);
        firstPrinting.simulatePrinting(50);
        System.out.println("Number of pages printed: " + firstPrinting.getNumberOfPages());
        System.out.println("Toner level after firstPrinting " + firstPrinting.getTonerLevel());
    }
}
