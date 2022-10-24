package ExerciseChallenges.Ex1;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Itau");

        bank.addNewBranch("Ipanema");
        bank.addNewBranch("Copacabana");

        bank.addNewTransactionInitialAmount("Ipanema","Ana", 120);
        bank.addNewTransactionInitialAmount("Ipanema", "Bia", 360);
        bank.addNewTransactionInitialAmount("Copacabana", "Caca", 589);

        bank.addNewTransaction("Ipanema", "Ana", 130);
        bank.addNewTransaction("Copacabana", "Caca", 250);

        bank.addNewTransaction("Copacabana", "Ana", 250);

        bank.showAllCustomers("Copacabana", true);
        bank.showAllCustomers("Ipanema", true);
    }
}
