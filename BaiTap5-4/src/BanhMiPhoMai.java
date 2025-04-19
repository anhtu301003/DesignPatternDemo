public class BanhMiPhoMai extends BanhMi {
    public BanhMiPhoMai() {
        this.ten = "Bánh mì phô mai";
        this.nguyenLieu = new String[]{"bột", "sữa", "phô mai"};
    }

    @Override
    public void cheBien() {
        System.out.println("Đang chế biến bánh mì phô mai với bột, sữa và phô mai...");
    }
}
