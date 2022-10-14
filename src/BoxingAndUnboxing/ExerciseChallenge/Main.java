package BoxingAndUnboxing.ExerciseChallenge;

public class Main {
    public static void main(String[] args) {
        Bank newBank = new Bank("National Australia Bank");

        newBank.addNewBranch("Adelaide");

        newBank.addCustomer("Adelaide", "Tim", 50.05);
        newBank.addCustomer("Adelaide", "Mike", 175.34);
        newBank.addCustomer("Adelaide", "Percy", 220.12);


        newBank.addNewBranch("Sydney");

        newBank.addCustomer("Sydney", "Bob", 150.54);

        newBank.addCustomerTransaction("Adelaide","Tim", 44.22);
        newBank.addCustomerTransaction("Adelaide","Tim", 22.44);


        newBank.showListOfClients("Adelaide", true);

        newBank.showListOfClients("Sydney", true);

        newBank.addNewBranch("Melbourne");

        if(!newBank.addNewBranch("Sydney")){
            System.out.println("Branch already exists");
        }

        if(!newBank.addCustomer("Melbourne","Brian", 22.22)){
            System.out.println("invalid"); ;
        }

        if(!newBank.addCustomerTransaction("Sydney", "Giulus", 50.00)){
            System.out.println("Customer does not exist");
        }

        if(!newBank.addCustomer("Adelaide", "Tim", 50.65)){
            System.out.println("Customer already exists");
        }
    }
}
