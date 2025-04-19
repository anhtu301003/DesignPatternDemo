public class BanhMiFactory {
    public static BanhMi taoBanhMi(String loai) {
        switch (loai.toLowerCase()) {
            case "bánh mì thường":
                return new BanhMiThuong();
            case "bánh mì phô mai":
                return new BanhMiPhoMai();
            case "bánh mì thịt":
                return new BanhMiThit();
            default:
                throw new IllegalArgumentException("Loại bánh mì không được hỗ trợ: " + loai);
        }
    }
}
