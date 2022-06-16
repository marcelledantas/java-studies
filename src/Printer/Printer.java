package Printer;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.numberOfPages = 0;
    }

    public void fillUpToner(int tonerAdd) {
        if (this.tonerLevel == 100) {
            System.out.printf("Don't need to fill up! The toner are already in full capacity (100%)");
        }
        this.tonerLevel += tonerAdd;
    }

    public void simulatePrinting(int numberOfPages) {
        int tonerUsedForEachPage = 2;
        int currentTonerlevel = this.tonerLevel;

        if ((currentTonerlevel - (tonerUsedForEachPage * numberOfPages)) < 0) {
            System.out.println("There is no sufficient capacity of toner to printing. Please fill out");

            int minimumRequireToner = -(currentTonerlevel - (tonerUsedForEachPage * numberOfPages));
            System.out.println("Minimum amount of toner required: " + minimumRequireToner);

        } else {
            this.numberOfPages += numberOfPages;
            this.tonerLevel -= tonerUsedForEachPage * numberOfPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
