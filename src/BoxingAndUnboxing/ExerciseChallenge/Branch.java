package BoxingAndUnboxing.ExerciseChallenge;

import java.util.ArrayList;
import java.util.Objects;

public class Branch {

    private ArrayList<Customer> customersList;
    private String branchName;


    public Branch(String branchName) {
        this.customersList = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    //Adding a new customer to the branch
    public boolean addNewCustomerToBranch(String newCustomer, double initialAmount){
        if(customerExists(newCustomer) != null){
            return false;
        }
        Customer c = new Customer(newCustomer, initialAmount);
        this.customersList.add(c);

        return true;
    }

    public boolean addCustomerNewTransaction(String customerName, double amount){
        Customer customer = customerExists(customerName);
        if(customer != null){

            customer.addTransactionToCostumer(amount);
            return true;
        }
        return false;
    }

    private Customer customerExists (String customerName){
        for(int i = 0; i < customersList.size(); i++){
            Customer customer = this.customersList.get(i);
            if(Objects.equals(customer.getCustomersName(), customerName)){
                return customer;
            }
        }
        return null;
    }

//    public boolean showAllCustomersFromBranch(){
//
//        System.out.println("Showing all customer from branch " + this.branchName);
//        for(int i = 0; i < this.customersList.size(); i++){
//            System.out.println("Customer name: " + this.customersList.get(i).getCustomersName());
//        }
//    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }
}
