package org.lenny.solid.principles.srp;

public class Client {
    public static void main(String[] args) {

        Report report = new Report("Monthly Sales", "Sales increased by 10% compared to last month.");
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(report, "monthly_report.txt");
    }
}
