package org.lenny.solid.principles.srp;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Exports the report
 * */
public class ReportExporter {
    public void export(String formattedReport, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(formattedReport);
            System.out.println("Report exported to " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to export report: " + e.getMessage());
        }
    }
}
