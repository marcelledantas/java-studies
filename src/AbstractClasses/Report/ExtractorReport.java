package AbstractClasses.Report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Open a file, read a file and send via email*/


public abstract class ExtractorReport {

    public abstract String getReportName();
    public abstract Pattern getPattern();

    public String parse(String path) throws FileNotFoundException {

        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        if(!scanner.hasNext()){
            return "Empty file";
        }

        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();

            if(matches){
                out += nextLine + "\n";
            }

        }

        return out;
    }


    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Starting a report " + getReportName());
        System.out.println(parse(path));
        System.out.println("sent report " + getReportName());
    }

}
