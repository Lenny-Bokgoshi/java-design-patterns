package org.lenny.behavioural.visitor;

public class SupportContract implements ReportElement {
    private long costPerMonth;

    public SupportContract(long costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }

    public long getCostPerMonth() {
        return costPerMonth;
    }
}
