public class HasMoneyState implements State {
    private VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("💰 Bạn đã nạp thêm " + amount + "$.");
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("✅ Bạn đã chọn sản phẩm: " + product);
        vendingMachine.setState(vendingMachine.getProductSelectedState());
    }

    @Override
    public void dispense() {
        System.out.println("⛔ Bạn chưa chọn sản phẩm!");
    }
}
