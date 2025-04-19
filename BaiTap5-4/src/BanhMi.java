public abstract class BanhMi {
    protected String ten;
    protected String[] nguyenLieu;

    public String getTen() {
        return ten;
    }

    public String[] getNguyenLieu() {
        return nguyenLieu;
    }

    public void hienThiThongTin() {
        System.out.println("Bánh mì: " + ten);
        System.out.print("Nguyên liệu: ");
        for (int i = 0; i < nguyenLieu.length; i++) {
            System.out.print(nguyenLieu[i]);
            if (i < nguyenLieu.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public abstract void cheBien();
}
