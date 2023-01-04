package StockManagementTests;

import StockManagement.Book;
import StockManagement.ExternalISBNDataService;
import StockManagement.StockManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StockManagementTests {

    ExternalISBNDataService testWebService;
    ExternalISBNDataService testDatabaseService;
    StockManager stockManager;
    @BeforeEach
    public void setUp() {
        testWebService = mock(ExternalISBNDataService.class);
        testDatabaseService = mock(ExternalISBNDataService.class);
        stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);

        System.out.println("setup running");
    }

    @Test
    public void testCanGetACorrectLocatorCode () {

//        ExternalISBNDataService testWebService = new ExternalISBNDataService() {
//            @Override
//            public Book lookup(String isbn) {
//                return new Book("J. Steinbeck", "Of Mice and Men", isbn);
//            }
//        }; // Test stub: replacement for an object. Java mocking,the test depended on an external service. We were just want to test the business logic.
//        // In this case, we can inject this replacement into that class for our test as a new version of the dependency to override the use of the external dependency that we don't want to use.
//        // We can only do that, when we have everything in the third party system is implementing some interface. There might be sometimes when you're constrained in your architecture
//        // And you can't create this kind of interface. Or there might be times when the interface is so big and so difficult that actually creating it with the local implementation is a huge amount of work.
//        // So we are going to look forward at other ways of dealing with this using a third party library

        //Using mockito
        String isbn = "0140177396";

        when(testWebService.lookup( anyString())).thenReturn(new Book("J. Steinbeck", "Of Mice and Men", isbn));

        when(testDatabaseService.lookup( anyString())).thenReturn(null);
        testDatabaseService = mock(ExternalISBNDataService.class);


//        ExternalISBNDataService testDatabaseService = new ExternalISBNDataService() {
//            @Override
//            public Book lookup(String isbn) {
//                return null;
//            }
//        };


        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }

    @Test
    public void databaseIsUsedIfDataIsPresent(){
        // For creating a mocking rather than instantiate it, we are going to set to equal then the method mock(), passing the class type that we want to mock.
        // It creates a dummy class that is an implementation for this interface. We don't need to provide an implementation for the lookup method.


        when(testDatabaseService.lookup("0140177396")).thenReturn(new Book("abc", "abc", "0140177396"));

        StockManager stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);


        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        verify(testDatabaseService, times(1)).lookup("0140177396");
        verify(testWebService, times(0)).lookup(anyString());

    }

    @Test
    public void webServiceIsUsedIfDataIsNotPresentInDatabase(){
        // For creating a mocking rather than instantiate it, we are going to set to equal then the method mock(), passing the class type that we want to mock.
        // It creates a dummy class that is an implementation for this interface. We don't need to provide an implementation for the lookup method.

        when(testDatabaseService.lookup("0140177396")).thenReturn(null);
        when(testWebService.lookup("0140177396")).thenReturn(new Book("abc", "abc", "0140177396"));

        StockManager stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);


        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        verify(testDatabaseService, times(1)).lookup("0140177396");
        verify(testWebService, times(1)).lookup("0140177396");
    }

}
