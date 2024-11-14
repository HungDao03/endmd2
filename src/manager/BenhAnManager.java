package manager;

import product.BenhAn;
import product.BenhAnThuong;
import product.BenhAnVIP;
import java.util.*;

public class BenhAnManager {
    private static List<BenhAn> danhSachBenhAn = new ArrayList<>();

    public static void themMoi(String soThuTu, String maBenhAn, String tenBenhAn, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int loaiBenhAn, double phiNamVien, String loaiVIP, String thoiHanVIP) {
        if (loaiBenhAn == 1) {
            BenhAn benhAnThuong = new BenhAnThuong(soThuTu, maBenhAn, tenBenhAn, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
            danhSachBenhAn.add(benhAnThuong);
        } else if (loaiBenhAn == 2) {
            BenhAn benhAnVIP = new BenhAnVIP(soThuTu, maBenhAn, tenBenhAn, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP);
            danhSachBenhAn.add(benhAnVIP);
        }
    }

    public static void xoa(String maBenhAn) {
        danhSachBenhAn.removeIf(benhAn -> benhAn.toString().contains(maBenhAn));
    }

    public static void xemDanhSach() {
        for (BenhAn benhAn : danhSachBenhAn) {
            benhAn.thongTin();
        }
    }

    public static List<BenhAn> getDanhSachBenhAn() {
        return danhSachBenhAn;
    }
}
