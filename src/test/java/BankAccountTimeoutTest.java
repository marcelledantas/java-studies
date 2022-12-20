import com.example.demo.BankAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

//@Timeout(value=500, unit = TimeUnit.MILLISECONDS)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeoutTest {


    @Test
    public void testDepositTimeAssertion(BankAccount bankAccount){
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        bankAccount.deposit(300);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    public void getTestDepositTime(BankAccount bankAccount){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        bankAccount.deposit(300);
        assertTimeout(Duration.ofMillis(500),()->Thread.sleep(10));
    }
}
