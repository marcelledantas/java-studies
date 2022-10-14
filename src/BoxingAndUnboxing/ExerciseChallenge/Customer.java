package BoxingAndUnboxing.ExerciseChallenge;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String customersName;

    public Customer(String customer, double initialAmount){

        this.transactions = new ArrayList<Double>();
        addTransactionToCostumer(initialAmount);
        this.customersName = customer;

    }

    public String addTransactionToCostumer(Double transaction){
       this.transactions.add(transaction);
       return "Transaction was added " + transaction + " for customer " + getCustomersName();
    }


    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public String getCustomersName() {
        return customersName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
