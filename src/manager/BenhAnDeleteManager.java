package manager;

import product.BenhAn;
import java.util.*;

public class BenhAnDeleteManager {
    // Xóa bệnh án theo mã bệnh án
    public static void xoa(Scanner sc, List<BenhAn> danhSachBenhAn) {
        System.out.print("Nhập mã bệnh án cần xóa: ");
        String maBenhAn = sc.nextLine();
        boolean found = false;
        Iterator<BenhAn> iterator = danhSachBenhAn.iterator();
        while (iterator.hasNext()) {
            BenhAn benhAn = iterator.next();
            if (benhAn.toString().contains(maBenhAn)) {
                iterator.remove();
                found = true;
                System.out.println("Đã xóa bệnh án có mã: " + maBenhAn);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy bệnh án có mã: " + maBenhAn);
        }
    }
}
