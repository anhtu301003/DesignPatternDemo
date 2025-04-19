class ConfirmOrderCommand implements OrderCommand {
    private Order order;

    public ConfirmOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.confirm();
    }

    public void undo() {
        order.cancel(); // Undo xác nhận = hủy đơn
    }
}