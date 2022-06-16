package EnhancePlayer;

public class Main {
    public static void main(String[] args) {
        EnhancePlayer player = new EnhancePlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
