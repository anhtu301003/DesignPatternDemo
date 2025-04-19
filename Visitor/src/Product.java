public interface Product {
    void accept(PricingVisitor visitor);
}
