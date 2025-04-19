//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuaHangBanhMi cuaHang = new CuaHangBanhMi();
        cuaHang.chaoKhachHang();

        BanhMi banhMi1 = cuaHang.nhanDonDatHang("Bánh mì thường");
        if (banhMi1 != null) {
            System.out.println("\nKhách hàng đã nhận:");
            banhMi1.hienThiThongTin();
        }

        System.out.println("\n-------------------\n");

        BanhMi banhMi2 = cuaHang.nhanDonDatHang("Bánh mì phô mai");
        if (banhMi2 != null) {
            System.out.println("\nKhách hàng đã nhận:");
            banhMi2.hienThiThongTin();
        }

        System.out.println("\n-------------------\n");

        BanhMi banhMi3 = cuaHang.nhanDonDatHang("Bánh mì thịt");
        if (banhMi3 != null) {
            System.out.println("\nKhách hàng đã nhận:");
            banhMi3.hienThiThongTin();
        }
    }
}
