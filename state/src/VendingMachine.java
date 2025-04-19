public class VendingMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State productSelectedState;
    private State state;

    public VendingMachine() {
        this.noMoneyState = new NoMoneyState(this);
        this.hasMoneyState = new HasMoneyState(this);
        this.productSelectedState = new ProductSelectedState(this);

        // Ban đầu, máy ở trạng thái không có tiền
        this.state = noMoneyState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney(int amount) {
        state.insertMoney(amount);
    }

    public void selectProduct(String product) {
        state.selectProduct(product);
    }

    public void dispense() {
        state.dispense();
    }

    // Getter cho các state
    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getProductSelectedState() {
        return productSelectedState;
    }
}
