package BankAccountTests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {

   @Test
   @EnabledOnOs({OS.MAC})
    public void testMac(){

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    public void testNoJRE17(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_17})
    public void testNoJRE16(){

    }
}
