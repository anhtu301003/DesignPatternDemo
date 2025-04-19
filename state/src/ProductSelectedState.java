public class ProductSelectedState implements State {
    private VendingMachine vendingMachine;

    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("⛔ Bạn đã chọn sản phẩm rồi, không thể nạp thêm tiền.");
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("✅ Bạn đã đổi sản phẩm thành: " + product);
    }

    @Override
    public void dispense() {
        System.out.println("🎉 Sản phẩm đã được xuất!");
        vendingMachine.setState(vendingMachine.getNoMoneyState());
    }
}
