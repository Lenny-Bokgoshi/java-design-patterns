package org.lenny.behavioural.visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear;
    }

    @Override
    public Long visit(TimeAndMaterialsContract contract) {
        return contract.getCostPerHour() * contract.getHours();
    }

    @Override
    public Long visit(SupportContract contract) {
        return contract.getCostPerMonth() * 12;
    }
}
