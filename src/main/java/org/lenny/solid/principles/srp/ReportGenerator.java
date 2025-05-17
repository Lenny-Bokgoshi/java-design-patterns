package org.lenny.solid.principles.srp;

public class ReportGenerator {
    private ReportFormatter formatter;
    private ReportExporter exporter;

    public ReportGenerator() {
        this.formatter = new ReportFormatter();
        this.exporter = new ReportExporter();
    }

    public void generateReport(Report report, String fileName) {
        String formatted = formatter.formatReport(report);
        exporter.export(formatted, fileName);
    }
}
