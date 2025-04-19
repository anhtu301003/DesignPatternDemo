import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> danhSachBanhMi = new ArrayList<>();

    public Menu() {
        danhSachBanhMi.add("Bánh mì thường");
        danhSachBanhMi.add("Bánh mì phô mai");
        danhSachBanhMi.add("Bánh mì thịt");
    }

    public void hienThiMenu() {
        System.out.println("===== MENU BÁNH MÌ =====");
        for (int i = 0; i < danhSachBanhMi.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachBanhMi.get(i));
        }
        System.out.println("=======================");
    }

    public List<String> getDanhSachBanhMi() {
        return danhSachBanhMi;
    }
}
