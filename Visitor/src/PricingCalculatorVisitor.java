class PricingCalculatorVisitor implements PricingVisitor {
    double total = 0;

    public void visit(Book book) {
        double tax = book.price * 0.05; // 5% VAT
        total += book.price + tax;
        System.out.println("Book: " + book.title + ", Total: " + (book.price + tax));
    }

    public void visit(Electronics electronics) {
        double tax = electronics.price * 0.1; // 10% VAT
        double warrantyFee = electronics.warrantyInMonths * 2; // 2$ mỗi tháng
        total += electronics.price + tax + warrantyFee;
        System.out.println("Electronics: " + electronics.name + ", Total: " + (electronics.price + tax + warrantyFee));
    }

    public double getTotal() {
        return total;
    }
}