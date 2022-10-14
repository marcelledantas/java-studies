package BoxingAndUnboxing.ExerciseChallenge;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String bankName) {
        this.branches = new ArrayList<Branch>();
        this.bankName = bankName;
    }

    public boolean addNewBranch(String branchName){
        if(branchExists(branchName) == null){
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public Branch branchExists(String branchName){
        for(int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if(Objects.equals(branch.getBranchName(), branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = branchExists(branchName);
        if(branch != null){
            return branch.addNewCustomerToBranch(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = branchExists(branchName);
        if(branch != null){
            return branch.addCustomerNewTransaction(customerName, amount);
        }
        return false;
    }

    public boolean showListOfClients(String branchName, boolean showTransactions){

        Branch branch = branchExists(branchName);
        if(branch == null){
            return false;
        }

        System.out.println("Customer for branch " + branch.getBranchName());

        ArrayList<Customer> customersList = branch.getCustomersList();
        for(int i = 0; i < customersList.size(); i++){
            Customer customer = customersList.get(i);
            System.out.println("Customer " + customer.getCustomersName() + "[" + i + "]");

            if(showTransactions){
                System.out.println("Showing transactions for customer " + customer.getCustomersName());

                ArrayList<Double> transactions = customer.getTransactions();
                for(int j = 0; j < transactions.size(); j++){
                    System.out.println("[" + j + "] Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }

}


