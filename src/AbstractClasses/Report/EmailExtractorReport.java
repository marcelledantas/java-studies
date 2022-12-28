package AbstractClasses.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

    private String reportName = "Email Report";
    private static final Pattern PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public String getReportName(){
        return this.reportName;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }


}
