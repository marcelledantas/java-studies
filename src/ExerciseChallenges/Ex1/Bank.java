package ExerciseChallenges.Ex1;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String newBankName) {
        this.branches = new ArrayList<Branch>();
        this.bankName = newBankName;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    //Add a new branch
    public void addNewBranch(String branchName){
        Branch branch = checkBranchExists(branchName);
        if(branch == null){
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
        } else{
            System.out.println("Branch " + branchName + " already exists");
        }
    }

    //Add a customer to that branch with initial transaction
    public boolean addNewTransactionInitialAmount(String branchName, String customerName, double initialAmount){
        //check if a branch exists
        Branch branch = checkBranchExists(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " does not exist");
            return false;
        }
        //check if a customer already exits
        Customer customer = branch.checkCustomerExists(customerName);
        if(customer == null){
            branch.addNewTransactionInitialAmount(customerName, initialAmount);
            return true;
        }
            System.out.println("Customer " + customerName + " already exists");
            return false;
    }

    //Add a transaction for an existing customer for that branch
    public void addNewTransaction(String branchName, String customerName, double amount){
        //check if a branch exists
        Branch branch = checkBranchExists(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " does not exist");
            return;
        }
        //check if customer already exists
        Customer customer = branch.checkCustomerExists(customerName);
        if(customer != null){
            if(branch.addNewTransactionAmount(customerName, amount)){
                return;
            }
        } else{
            System.out.println("Customer " + customerName + " does not exist");
        }
    }

    //Show list of customers for a particular branch and optionally a list of their transactions
    public void showAllCustomers(String branchName, boolean showTransaction){
        //check if a branch exists
        Branch branch = checkBranchExists(branchName);
        if(branch == null){
            System.out.println("Branch " + branchName + " does not exist");
            return;
        }

        System.out.println("Branch: " + branchName);
        ArrayList<Customer> customersList = branch.getCustomers();
        for(int i = 0; i < customersList.size(); i++){
            Customer customer = customersList.get(i);
            System.out.println("Customer: " + customer.getCustomerName());

            if(showTransaction){
                for(int j = 0; j < customer.getTransactions().size(); j++){
                    System.out.println("Transaction: [" + (j + 1) + "] - " + customer.getTransactions().get(j));
                }
            }
        }
    }

    public Branch checkBranchExists(String branchName){
        if(this.branches == null){
            return null;
        }

        for(int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if(branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
}
