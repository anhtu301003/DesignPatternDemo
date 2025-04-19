public class NoMoneyState implements State {
    private VendingMachine vendingMachine;

    public NoMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("💰 Bạn đã nạp " + amount + "$.");
        vendingMachine.setState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("⛔ Vui lòng nạp tiền trước!");
    }

    @Override
    public void dispense() {
        System.out.println("⛔ Bạn chưa chọn sản phẩm!");
    }
}
