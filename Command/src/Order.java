// Receiver – Hành vi thực tế
class Order {
    private String id;

    public Order(String id) {
        this.id = id;
    }

    public void create() {
        System.out.println("Đơn hàng " + id + " được tạo.");
    }

    public void cancel() {
        System.out.println("Đơn hàng " + id + " bị hủy.");
    }

    public void confirm() {
        System.out.println("Đơn hàng " + id + " đã xác nhận.");
    }
}
