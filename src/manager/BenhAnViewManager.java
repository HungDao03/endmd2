package manager;

import product.BenhAn;
import java.util.*;

public class BenhAnViewManager {
    // Xem danh sách bệnh án
    public static void xemDanhSach(List<BenhAn> danhSachBenhAn) {
        if (danhSachBenhAn.isEmpty()) {
            System.out.println("Danh sách bệnh án rỗng!");
        } else {
            for (BenhAn benhAn : danhSachBenhAn) {
                benhAn.thongTin();
            }
        }
    }
}
