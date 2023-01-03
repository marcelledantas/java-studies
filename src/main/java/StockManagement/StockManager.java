package StockManagement;

import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl;

public class StockManager {

    private ExternalISBNDataService service;

    public void setService(ExternalISBNDataService service) {
        this.service = service;
    }

    public String getLocatorCode(String isbn){

        Book book = this.service.lookup(isbn);
        StringBuilder locator = new StringBuilder();
        locator.append(isbn.substring(isbn.length() - 4));
        locator.append((book.getAuthor()).substring(0,1));
        locator.append(book.getTitle().split(" ").length);

        return locator.toString();
    }
}
