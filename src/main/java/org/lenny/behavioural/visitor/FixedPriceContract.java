package org.lenny.behavioural.visitor;

public class FixedPriceContract implements ReportElement {
    private long costPerYear;

    public FixedPriceContract(long costPerYear) {
        this.costPerYear = costPerYear;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }

    public long getCostPerYear() {
        return costPerYear;
    }

    public void setCostPerYear(long costPerYear) {
        this.costPerYear = costPerYear;
    }
}
