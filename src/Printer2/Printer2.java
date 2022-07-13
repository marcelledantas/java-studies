package Printer2;

public class Printer2 {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer2(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerAmount + this.tonerLevel) > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
        return (this.tonerLevel);
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            this.pagesPrinted += (pages / 2);
            return pagesToPrint / 2;
        } else {
            System.out.println("Printing in not duplex mode");
            this.pagesPrinted += (pages);
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
