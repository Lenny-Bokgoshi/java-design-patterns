package org.lenny.behavioural.visitor;

public interface ReportVisitor<R> {
    R visit(FixedPriceContract contract);
    R visit(TimeAndMaterialsContract contract);
    R visit(SupportContract contract);
}
