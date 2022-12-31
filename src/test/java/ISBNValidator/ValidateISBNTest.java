package ISBNValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateISBNTest {

    @Test
    public void checkAValid10ISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue(result, "first value");

        result = validator.checkISBN("0140177396");
        assertTrue(result, "second value");
    }

    @Test
    public void ISBNEndingWithX10AreValid() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue( result);
    }

    @Test
    public void checkAValid13ISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue(result, "first value");

        result = validator.checkISBN("9781853267338");
        assertTrue(result, "second value");
    }

    @Test
    public void checkAInvalid10ISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("112000030X");
        assertFalse(result);
    }

    @Test
    public void checkAInvalid13ISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("1781853261057");
        assertFalse(result);
    }

    @Test
    public void nineDigitISBNAreNotAllow() {
        ValidateISBN validator = new ValidateISBN();

        assertThrows(NumberFormatException.class, () -> validator.checkISBN("123456789"));
    }

    @Test
    public void nonNumericISBNsIsNotAllow() {
        ValidateISBN validator = new ValidateISBN();

        assertThrows(NumberFormatException.class, () -> validator.checkISBN("helloworld"));
    }


}