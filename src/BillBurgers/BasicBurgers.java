package BillBurgers;

import static java.lang.System.exit;

public class BasicBurgers {
    private String burgerName;
    private String breadRollType;
    private String meat;

    private String lettuce;
    private String tomato;
    private String cheese;
    private String carrot;

    private double lettucePrice;
    private double tomatoPrice;
    private double cheesePrice;
    private double carrotPrice;
    private double baseBurgerPrice;

    public BasicBurgers(String burgerName, String breadRollType, String meat, double basicPrice) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.baseBurgerPrice = basicPrice;

        this.lettucePrice = 0.30;
        this.tomatoPrice = 1.55;
        this.cheesePrice = 2.59;
        this.carrotPrice = 0.98;
    }

    public void setAdditionalBasic(String lettuce, String tomato, String cheese, String carrot) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.carrot = carrot;
    }

    public String getBurgerName() {
        return this.burgerName;
    }

    public double getBasicPrice() {
        return this.baseBurgerPrice;
    }

    public void showBasicPrice() {
        System.out.println("O preço do burger é " + getBasicPrice());
    }

    public double getAdditionalPriceBasic() {
        double countAdditionalPrice = 0.0;

        if (!this.lettuce.isEmpty()) {
            countAdditionalPrice += this.lettucePrice;
        }
        if (!this.tomato.isEmpty()) {
            countAdditionalPrice += this.tomatoPrice;
        }
        if (!this.cheese.isEmpty()) {
            countAdditionalPrice += this.cheesePrice;
        }
        if (!this.carrot.isEmpty()) {
            countAdditionalPrice += this.carrotPrice;
        }

        return countAdditionalPrice;
    }


    public String getAdditionalBasic() {

        String additionals = "";

        if (lettuce.isEmpty() && tomato.isEmpty() && cheese.isEmpty() && carrot.isEmpty()) {
            System.out.println("Basic Burger: there's no additional for this order");
            exit(1);
        }
        if (!lettuce.isEmpty()) {
            additionals += " " + lettuce;
            additionals += ": " + lettucePrice;
        }
        if (!tomato.isEmpty()) {
            additionals += " " + tomato;
            additionals += ": " + tomatoPrice;
        }
        if (!cheese.isEmpty()) {
            additionals += " " + cheese;
            additionals += ": " + cheesePrice;
        }
        if (!carrot.isEmpty()) {
            additionals += " " + carrot;
            additionals += ": " + carrotPrice;
        }

        return additionals;
    }

    public void showAdditionalAllBasic(String additionals) {
        System.out.println("Os itens basic adicionados foram: " + additionals);
    }

    public double getTotalPrice() {
        return (getBasicPrice() + getAdditionalPriceBasic());
    }

    public void showTotalPrice() {
        System.out.println("Preço burger basic = " + getBasicPrice() + ". Additional price " + getAdditionalPriceBasic() + ". Preço total do Healthy burger " + getTotalPrice());
    }

}

class HealthyBurger extends BasicBurgers {

    private String champions;
    private String spinach;

    private double championsPrice;
    private double spinachPrice;

    public HealthyBurger(String burgerName, String breadRollType, String meat, double basicPrice) {
        super(burgerName, breadRollType, meat, basicPrice);
        this.championsPrice = 5.0;
        this.spinachPrice = 0.75;
    }

    public void setAdditionalHealthy(String champions, String spinach, String lettuce, String tomato, String cheese, String carrot) {
        this.champions = champions;
        this.spinach = spinach;
        setAdditionalBasic(lettuce, tomato, cheese, carrot);
    }

    public String getAdditionalHealthy() {

        String additional = " " + getAdditionalBasic();

        if (!champions.isEmpty()) {
            additional += (" " + this.champions + ": " + this.championsPrice);
        }
        if (!spinach.isEmpty()) {
            additional += (" " + this.spinach + ": " + this.spinachPrice);
        }

        return additional;
    }

    public void showAdditionalAllHealthy(String additionals) {
        System.out.println("Os itens adicionados foram: " + additionals);
    }

    /**
     * <p> Retorna o preço e nome do item adicionado </p>
     *
     * @return countAdditionalPrice
     */
    public double getAdditionalPriceHealthy() {
        double countAdditionalPrice = 0.0;
        String additional = "";

        if (!champions.isEmpty()) {
            countAdditionalPrice += this.championsPrice;
        }
        if (!spinach.isEmpty()) {
            countAdditionalPrice += this.spinachPrice;
        }

        countAdditionalPrice += getAdditionalPriceBasic();

        return countAdditionalPrice;
    }

    public double getTotalPrice() {
        return (getBasicPrice() + getAdditionalPriceHealthy());
    }

    public void showTotalPrice() {
        System.out.println("Preço burger basic = " + getBasicPrice() + ". Additional price " + getAdditionalPriceHealthy() + ". Preço total do Healthy burger " + getTotalPrice());
    }

}

class DeluxeBurger extends BasicBurgers {

    private String chips;
    private String drinks;

    private double chipsPrice;
    private double drinksPrice;

    public DeluxeBurger(String burgerName, String breadRollType, String meat, double basicPrice) {
        super(burgerName, breadRollType, meat, basicPrice);
    }

    public void setAdditionalDeluxe(String chips, String drinks) {
        this.chips = chips;
        this.drinks = drinks;

        this.chipsPrice = 12.0;
        this.drinksPrice = 5.75;
    }

    public String getPriceAllDeluxe() {
        String additional = " ";

        if (!chips.isEmpty()) {
            additional += (this.chips + ": " + this.chipsPrice);
        }
        if (!drinks.isEmpty()) {
            additional += (" " + this.drinks + ": " + this.drinksPrice);
        }

        return additional;
    }

    public double getPriceTotalAdditionalDeluxe() {
        double countAdd = 0.0;

        if (!chips.isEmpty()) {
            countAdd += this.chipsPrice;
        }
        if (!drinks.isEmpty()) {
            countAdd += this.drinksPrice;
        }

        return countAdd;
    }

    public double getTotalPrice() {
        return getBasicPrice() + getPriceTotalAdditionalDeluxe();
    }

    public void showEachItemPrice(String additional) {
        System.out.println(additional);
    }

    public void showTotalPricesDeluxe() {
        System.out.println("Preço burger basic = " + getBasicPrice() + ". Additional price " + getPriceTotalAdditionalDeluxe() + ". Preço total do Deluxe burger " + this.getTotalPrice());
    }


}

