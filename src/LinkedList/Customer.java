package LinkedList;

public class Customer {
    private String Name;
    private double balance;

    public Customer(String name, double balance) {
        Name = name;
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
