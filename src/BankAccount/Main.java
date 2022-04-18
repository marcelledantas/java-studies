package BankAccount;

/**
 * @author marcelle.dantas
 *
 */
public class Main {

    public static void main(String[] args) {
//
//        //BankAccount bank = new BankAccount(); //Create the class object
//
//        BankAccount bank = new BankAccount("123",
//                0.00,
//                "Bob",
//                "bob@bob.com",
//                "55 123456");
//
//        bank.getDepositFunds(100.0);
//        bank.getWithdrawFunds(12);
//
//        BankAccount bank2 = new BankAccount("bob", "bobo@bob.com", "12346");

        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Marcelle", 1000);
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}