public class Main {
    public static void main(String[] args) {
        Order order = new Order("OD001");
        OrderManager manager = new OrderManager();

        OrderCommand create = new CreateOrderCommand(order);
        OrderCommand confirm = new ConfirmOrderCommand(order);

        manager.executeCommand(create);   // -> Đơn hàng OD001 được tạo.
        manager.executeCommand(confirm);  // -> Đơn hàng OD001 đã xác nhận.

        manager.undoLast();
    }
}