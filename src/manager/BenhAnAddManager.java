package manager;

import product.BenhAn;
import product.BenhAnThuong;
import product.BenhAnVIP;

import java.util.Scanner;

public class BenhAnAddManager {
    // Thêm bệnh án mới vào danh sách
    public static void themMoi(Scanner sc) {
        System.out.print("Nhập mã bệnh án: ");
        String maBenhAn = sc.nextLine();
        System.out.print("Nhập mã bệnh nhân: ");
        String maBenhNhan = sc.nextLine();
        System.out.print("Nhập tên bệnh nhân: ");
        String tenBenhNhan = sc.nextLine();
        System.out.print("Nhập ngày nhập viện: ");
        String ngayNhapVien = sc.nextLine();
        System.out.print("Nhập ngày ra viện: ");
        String ngayRaVien = sc.nextLine();
        System.out.print("Nhập lý do nhập viện: ");
        String lyDoNhapVien = sc.nextLine();
        System.out.print("Nhập loại bệnh án (1 - Thường, 2 - VIP): ");
        int loaiBenhAn = sc.nextInt();
        sc.nextLine();  // Đọc bỏ ký tự enter

        if (loaiBenhAn == 1) {  // Bệnh án thường
            System.out.print("Nhập phí nằm viện: ");
            double phiNamVien = sc.nextDouble();
            BenhAn benhAnThuong = new BenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
            BenhAnManager.themMoi(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiBenhAn, phiNamVien, null, null);  // Thêm vào danh sách
            BenhAnFileManager.ghiFile(benhAnThuong);  // Ghi bệnh án vào file
        } else if (loaiBenhAn == 2) {  // Bệnh án VIP
            sc.nextLine(); // Đọc bỏ enter
            System.out.print("Nhập loại VIP: ");
            String loaiVIP = sc.nextLine();
            System.out.print("Nhập thời hạn VIP: ");
            String thoiHanVIP = sc.nextLine();
            BenhAn benhAnVIP = new BenhAnVIP(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP);
            BenhAnManager.themMoi(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiBenhAn, 0, loaiVIP, thoiHanVIP);  // Thêm vào danh sách
            BenhAnFileManager.ghiFile(benhAnVIP);  // Ghi bệnh án vào file
        }
    }
}
