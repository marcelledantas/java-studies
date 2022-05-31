package Motherboard;


/**
 * Java only inherits from 1 class at a time
 * So, in this case we are using COMPOSITION
 */
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
