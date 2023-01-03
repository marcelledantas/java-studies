package StockManagementTests;

import StockManagement.Book;
import StockManagement.ExternalISBNDataService;
import StockManagement.StockManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockManagementTests {

    @Test
    public void testCanGetACorrectLocatorCode () {

        ExternalISBNDataService testService = new ExternalISBNDataService() {
            @Override
            public Book lookup(String isbn) {
                return new Book("J. Steinbeck", "Of Mice and Men", isbn);
            }
        }; // Test stub: replacement for an object. Java mocking,the test depended on an external service. We were just want to test the business logic.
        // In this case, we can inject this replacement into that class for our test as a new version of the dependency to override the use of the external dependency that we don't want to use.
        // We can only do that, when we have everything in the third party system is implementing some interface. There might be sometimes when you're constrained in your architecture
        // And you can't create this kind of interface. Or there might be times when the interface is so big and so difficult that actually creating it with the local implementation is a huge amount of work.
        // So we are going to look forward at other ways of dealing with this using a third party library

        StockManager stockManager = new StockManager();
        stockManager.setService(testService);


        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }
}
