public class CreateOrderCommand implements OrderCommand{
    private Order order;

    public CreateOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.create();
    }

    public void undo() {
        order.cancel();  // Undo tạo đơn = hủy đơn
    }
}
