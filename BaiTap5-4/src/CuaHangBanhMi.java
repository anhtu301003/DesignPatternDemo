public class CuaHangBanhMi {
    private Menu menu;
    private MaySanXuatBanhMi maySanXuat;

    public CuaHangBanhMi() {
        this.menu = new Menu();
        this.maySanXuat = new MaySanXuatBanhMi();
    }

    public void chaoKhachHang() {
        System.out.println("Chào mừng quý khách đến với cửa hàng bánh mì!");
        menu.hienThiMenu();
    }

    public BanhMi nhanDonDatHang(String loaiBanhMi) {
        if (!menu.getDanhSachBanhMi().contains(loaiBanhMi)) {
            System.out.println("Xin lỗi, cửa hàng không có loại bánh mì này.");
            return null;
        }
        System.out.println("Đã nhận đơn đặt hàng: " + loaiBanhMi);
        return maySanXuat.sanXuat(loaiBanhMi);
    }
}