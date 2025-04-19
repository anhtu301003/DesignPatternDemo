public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Book("OOP", 100),
                new Electronics("Laptop", 1000, 12)
        };

        PricingCalculatorVisitor visitor = new PricingCalculatorVisitor();

        for (Product product : products) {
            product.accept(visitor);
        }

        System.out.println("Total Order Cost: $" + visitor.getTotal());
    }
}