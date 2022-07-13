package BillBurgers;

public class Main {
    public static void main(String[] args) {

        //Order: Basic burger
        BasicBurgers order1 = new BasicBurgers("BurgerBasic00", "type1Bread", "meat", 10.25);

        order1.setAdditionalBasic("", "tomato", "cheese", "");

        System.out.println("Burger name " + order1.getBurgerName());
        order1.showBasicPrice();
        String additional = order1.getAdditionalBasic();
        order1.showAdditionalAllBasic(additional);
        order1.showTotalPrice();

        //Order: Healthy burger
        HealthyBurger order2 = new HealthyBurger("BurgerBasic00", "type1Bread", "meat", 10.25);

        order2.setAdditionalHealthy("champion", "spinach", "lettuce", "tomato", "cheese", "");

        System.out.println("\n");

        System.out.println("Healthy burger name " + order2.getBurgerName());
        order2.showBasicPrice();
        String additional1 = order2.getAdditionalHealthy();
        order2.showAdditionalAllHealthy(additional1);
        order2.showTotalPrice();

        System.out.println("\n");

        //Order: Deluxe burger
        DeluxeBurger order3 = new DeluxeBurger("BurgerBasic00", "type1Bread", "meat", 10.25);
        order3.setAdditionalDeluxe("chips", "drinks");
        System.out.println("Deluxe burger name " + order3.getBurgerName());
        order3.showBasicPrice();

        String additional2 = order3.getPriceAllDeluxe();
        order3.showEachItemPrice(additional2);
        order3.showTotalPricesDeluxe();

    }
}
