public class MaySanXuatBanhMi {
    public BanhMi sanXuat(String loaiBanhMi) {
        System.out.println("Máy đang bắt đầu sản xuất " + loaiBanhMi + "...");
        BanhMi banhMi = BanhMiFactory.taoBanhMi(loaiBanhMi);
        banhMi.cheBien();
        System.out.println("Sản xuất hoàn tất!");
        return banhMi;
    }
}
