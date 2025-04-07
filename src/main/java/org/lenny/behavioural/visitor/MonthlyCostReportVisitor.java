package org.lenny.behavioural.visitor;

public class MonthlyCostReportVisitor implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.getCostPerYear() / 12;
    }

    @Override
    public Long visit(TimeAndMaterialsContract contract) {
        return contract.getCostPerHour() * contract.getHours();
    }

    @Override
    public Long visit(SupportContract contract) {
        return contract.getCostPerMonth();
    }
}
