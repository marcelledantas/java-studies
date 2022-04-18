package BankAccount;

public class VipCustomer {

    private String name;
    private int creditCardLimit;
    private String email;

    public VipCustomer (){
        this("bob", 1000, "bob@bob.com");
    }

    public VipCustomer (String name, int creditCardLimit){
        this(name, creditCardLimit, "some@some.com");
    }

    public VipCustomer(String name, int creditCardLimit, String email) {
        this.name = name;
        this.creditCardLimit = creditCardLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditCardLimit() {
        return creditCardLimit;
    }

    public String getEmail() {
        return email;
    }
}
