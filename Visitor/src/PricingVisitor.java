public interface PricingVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
