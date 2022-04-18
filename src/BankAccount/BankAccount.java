package BankAccount;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //Optional: used in cases when we wanted to have set the default parameters after we call the constructor

        this("123", 2.5, "Bob", "bob@bob.com", "215454");
        System.out.println("Empty constructor call");
    } //Creating a constructor

    //We can declare how many constructors as we want - it can be overloading (same name with different parameters)
    public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //It is not recommendable calling other methods on the constructors, just the class fields
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("123", 0.0, customerName, email, phoneNumber);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getDepositFunds (double deposit){
        this.balance += deposit;
    }

    public void getWithdrawFunds (double withdraw){
        if(withdraw > balance){
            System.out.println("Insufficient fund");
        }else{
            this.balance -= withdraw;
            System.out.println("The update balance is: " + this.balance);

        }
    }
}
