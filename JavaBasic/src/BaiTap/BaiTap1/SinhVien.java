package BaiTap.BaiTap1;

import BaiTap.BaiTap1.ThongTin;

public class SinhVien {
    // biến Static
    public static String BienStatic = "Automation Test";
    // bien toan cuc
    public String BienToanCuc = "Toi la bien toan cuc";

    public void HamLocal() {
        String BienLocal = "quyen";
        System.out.println("Ten toi là: " + BienLocal);
    }

    public void HamToanCuc() {

        System.out.println("Ten toi là: " + BienToanCuc);
    }

    public static void main(String[] args) {
        SinhVien bienLocal1 = new SinhVien();
        bienLocal1.HamLocal();
        SinhVien TCuc = new SinhVien();
        TCuc.HamToanCuc();
        System.out.println("Ten toi là: " + BienStatic);
        System.out.println("Bien goi lai tu ham Thong Tin " + ThongTin.Address);
    }

}