public class BanhMiThit extends BanhMi {
    public BanhMiThit() {
        this.ten = "Bánh mì thịt";
        this.nguyenLieu = new String[]{"bột", "sữa", "thịt nguội"};
    }

    @Override
    public void cheBien() {
        System.out.println("Đang chế biến bánh mì thịt với bột, sữa và thịt nguội...");
    }
}
