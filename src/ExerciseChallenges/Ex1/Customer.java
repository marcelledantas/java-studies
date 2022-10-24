package ExerciseChallenges.Ex1;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addNewTransactionInitialAmount(initialAmount);
    }

    //Need to be able to add a new customer initial transaction amount
    public void addNewTransactionInitialAmount(double initialAmount){
        this.transactions.add(initialAmount);
    }

    public boolean addNewTransactionAmount(double amount){
        if(amount > 0){
            this.transactions.add(amount);
            return true;
        }
        System.out.println("Invalid amount for a transaction");
        return false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
