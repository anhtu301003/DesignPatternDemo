class Electronics implements Product {
    String name;
    double price;
    int warrantyInMonths;

    public Electronics(String name, double price, int warrantyInMonths) {
        this.name = name;
        this.price = price;
        this.warrantyInMonths = warrantyInMonths;
    }

    public void accept(PricingVisitor visitor) {
        visitor.visit(this);
    }
}
