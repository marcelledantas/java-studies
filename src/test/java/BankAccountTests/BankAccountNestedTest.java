package BankAccountTests;

import BankAccount.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BankAccountNestedTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);

        bankAccount.withdraw(500);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(500,-1000);

        bankAccount.deposit(400);
        assertEquals(900, bankAccount.getBalance());
    }

    @Nested
    @DisplayName("Withdrawing minimum below balance: exception")
    class WhenBalanceEqualsZero{
        @Test
        public void testWithdrawMinimumBalanceIs0(){
            BankAccount bankAccount = new BankAccount(0,0);

            assertThrows(RuntimeException.class, ()->bankAccount.withdraw(500));
        }

        @Test
        @DisplayName("Withdrawing minimum below balance")
        public void testWithdrawMinimumBalanceNegative1000(){
            BankAccount bankAccount = new BankAccount(0,-1000);
            bankAccount.withdraw(500);

            assertEquals(-500, bankAccount.getBalance());

        }
    }
}
