package ExerciseChallenges.Ex1;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.customers = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    //Also needs to add additional transactions for that customer/branch
    public boolean addNewTransactionAmount(String customerName, double amount){
        Customer customer = checkCustomerExists(customerName);
        if(customer != null){
            customer.addNewTransactionAmount(amount);
            return true;
        }
        return false;
    }

    public boolean addNewTransactionInitialAmount(String customerName, double initialAmount){
        Customer customer = checkCustomerExists(customerName);
        if(customer == null){
            Customer newCustomer = new Customer(customerName, initialAmount);
            this.customers.add(newCustomer);
            return true;
        }
        return false;
    }

    //check if customer already exists
    public Customer checkCustomerExists(String customerName){

        for(int i = 0; i < this.customers.size(); i++){
            Customer customerSearch = this.customers.get(i);
            if(customerSearch.getCustomerName().equals(customerName)){
                return customerSearch;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
