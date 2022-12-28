package AbstractClasses.Report;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "src/AbstractClasses/Report/Data.txt";
        new EmailExtractorReport().prepareAndSendReport(filePath);
        new NumberExtractorReport().prepareAndSendReport(filePath);

    }

}
