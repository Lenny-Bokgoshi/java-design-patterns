package org.lenny.solid.principles.srp;


/**
 * Creates the format of the report
 * */
public class ReportFormatter {
    public String formatReport(Report report) {
        return "=== " + report.getTitle() + " ===\n" + report.getContent();
    }
}
