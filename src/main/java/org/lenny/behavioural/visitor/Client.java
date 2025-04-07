package org.lenny.behavioural.visitor;


import java.util.List;

/**
 * Separates an algorithm from the objects it operates on,
 *      allowing new operations to be added without changing the object structure.
 *
 * Examples:
 *  > Report Generation – Applies different report visitors (e.g., PDF, Excel, HTML) to business entities like invoices or orders.
 *  > Tax Calculation – Visits different product or service types to calculate taxes based on specific rules.
 *  > Object Validation – Adds validation logic to domain models without altering their core structure.
 *  > Metrics Collection – Gathers performance or usage metrics from various system components using a visitor.
 *  > Serialization – Applies custom serialization formats (e.g., JSON, XML, YAML) across complex object structures.
 * **/
public class Client {
    public static void main(String[] args) {
        FixedPriceContract projectAlpha = new FixedPriceContract(10000);
        SupportContract projectBeta = new SupportContract(500);
        TimeAndMaterialsContract projectGamma = new TimeAndMaterialsContract(150, 10);
        TimeAndMaterialsContract projectDelta = new TimeAndMaterialsContract(50, 50);

        List<ReportElement> projects = List.of(projectAlpha, projectBeta, projectDelta, projectGamma);

        MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyReport);
            yearlyCost += project.accept(yearlyReport);
        }

        System.out.println("Monthly cost is " + monthlyCost);
        System.out.println("Yearly cost is " + yearlyCost);
    }
}
