class Book implements Product {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void accept(PricingVisitor visitor) {
        visitor.visit(this);
    }
}