package AbstractClasses.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {

    private String reportName = "Number Report";
    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

   public String getReportName(){
        return this.reportName;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
}
