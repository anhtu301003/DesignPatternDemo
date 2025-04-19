public class BanhMiThuong extends BanhMi {
    public BanhMiThuong() {
        this.ten = "Bánh mì thường";
        this.nguyenLieu = new String[]{"bột", "sữa"};
    }

    @Override
    public void cheBien() {
        System.out.println("Đang chế biến bánh mì thường với bột và sữa...");
    }
}
