public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectProduct("Coca-Cola");
        vendingMachine.insertMoney(5);
        vendingMachine.selectProduct("Pepsi");
        vendingMachine.dispense();
        vendingMachine.insertMoney(2);
    }
}
