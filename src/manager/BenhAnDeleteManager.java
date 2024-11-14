package manager;

import product.BenhAn;
import java.util.*;

public class BenhAnDeleteManager {
    // Xóa bệnh án theo mã bệnh án với cảnh báo
    public static void xoa(Scanner sc, List<BenhAn> danhSachBenhAn) {
        System.out.print("Nhập mã bệnh án cần xóa: ");
        String maBenhAn = sc.nextLine();
        boolean found = false;

        // Tìm bệnh án và hỏi người dùng có chắc chắn muốn xóa không
        Iterator<BenhAn> iterator = danhSachBenhAn.iterator();
        while (iterator.hasNext()) {
            BenhAn benhAn = iterator.next();
            if (benhAn.toString().contains(maBenhAn)) {
                System.out.print("Bạn có chắc chắn muốn xóa bệnh án có mã: " + maBenhAn + " (y/n)? ");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    iterator.remove();  // Xóa bệnh án
                    found = true;
                    System.out.println("Đã xóa bệnh án có mã: " + maBenhAn);
                    // Ghi lại danh sách bệnh án mới vào file
                    BenhAnFileManager.ghiFileDanhSach(danhSachBenhAn);
                    break;
                } else {
                    System.out.println("Hủy bỏ xóa bệnh án.");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh án có mã: " + maBenhAn);
        }
    }
}
