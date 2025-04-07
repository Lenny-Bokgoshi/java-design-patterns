package org.lenny.behavioural.visitor;

public class TimeAndMaterialsContract implements ReportElement {
    private long costPerHour;
    private long hours;

    public TimeAndMaterialsContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }

    public long getCostPerHour() {
        return costPerHour;
    }

    public long getHours() {
        return hours;
    }
}
