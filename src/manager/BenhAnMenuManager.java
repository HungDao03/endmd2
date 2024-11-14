package manager;

import java.util.Scanner;

public class BenhAnMenuManager {
    // Hiển thị menu và xử lý các chức năng
    public static void hienMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-- Chức năng quản lý bệnh án --");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách bệnh án");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int chucNang = sc.nextInt();
            sc.nextLine(); // Đọc bỏ ký tự enter

            switch (chucNang) {
                case 1:
                    BenhAnAddManager.themMoi(sc);
                    break;
                case 2:
                    BenhAnDeleteManager.xoa(sc, BenhAnManager.getDanhSachBenhAn());
                    break;
                case 3:
                    BenhAnViewManager.xemDanhSach(BenhAnManager.getDanhSachBenhAn());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        }
    }
}
