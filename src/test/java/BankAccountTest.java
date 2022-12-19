import com.example.demo.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test BankAccount class")
class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    void testWithdraw() {
        //Given
        BankAccount bankAccount = new BankAccount(500,-1000);

        //When
        bankAccount.withdraw(300);

        //Then
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    void testDeposit() {
        // Given
        BankAccount bankAccount = new BankAccount(1000, -100);

        // When
        bankAccount.deposit(1000);

        //Then
        assertEquals(2000, bankAccount.getBalance());

    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero(){
        // Given
        BankAccount bankAccount = new BankAccount(500, -1000);
        // When
        bankAccount.withdraw(800);
        // Then
        assertNotEquals(0,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500,0);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test set holder name")
    public void testHolderNameSet() {
        BankAccount bankAccount = new BankAccount(500,0);
        bankAccount.setBankAccountHolder("Maaike");

        assertNotNull(bankAccount.getBankAccountHolder());
    }

    @Test
    @DisplayName("Test that we can't withdraw below minimum")
    public void testNoWithdrawBelowMinimum() {
        BankAccount bankAccount = new BankAccount(500,-1000);
        assertThrows(RuntimeException.class, ()->bankAccount.withdraw(2000));
    }

    @Test
    @DisplayName("Test no exception for withdraw and deposit")
    public void testWithdrawAndDepositWithoutExceptions() {
        // Given
        BankAccount bankAccount = new BankAccount(500,-1000);

        assertAll(()-> bankAccount.deposit(200),()-> bankAccount.withdraw(450));
    }

    @Test
    @DisplayName("Test speed")
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(400,0);
        assertTimeout(Duration.ofNanos(10),()->bankAccount.deposit(200));
        assertEquals(0.33, 1/3, 0.01);
        assertEquals(0.33, 1/3, "Oops, not the same");
    }
}