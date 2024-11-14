package manager;

import product.BenhAn;
import product.BenhAnThuong;
import product.BenhAnVIP;

import java.io.*;
import java.util.List;

public class BenhAnFileManager {

    // Ghi một bệnh án vào file
    public static void ghiFile(BenhAn benhAn) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("benhAn.csv", true))) {
            writer.write(benhAn.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Đọc danh sách bệnh án từ file
    public static void docFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("benhAn.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    // Phân tích dữ liệu từ file và tạo đối tượng BenhAn phù hợp
                    int soThuTu = Integer.parseInt(data[0].trim());
                    String maBenhAn = data[1].trim();
                    String maBenhNhan = data[2].trim();
                    String tenBenhNhan = data[3].trim();
                    String ngayNhapVien = data[4].trim();
                    String ngayRaVien = data[5].trim();
                    String lyDoNhapVien = data[6].trim();

                    // Tạo bệnh án từ dữ liệu
                    BenhAn benhAn = null;
                    // Giả sử nếu mã bệnh án bắt đầu với "VIP", đó là bệnh án VIP
                    if (maBenhAn.startsWith("VIP")) {
                        // Cần thêm phần tử cho bệnh án VIP nếu cần thiết, ví dụ thoiHanVIP, loaiVIP
                        benhAn = new BenhAnVIP(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, "Loại VIP", "Thời gian VIP");
                    } else {
                        benhAn = new BenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, 500000);  // Giả sử phí nằm viện
                    }

                    // Gọi phương thức thongTin() để hiển thị thông tin bệnh án
                    benhAn.thongTin();
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    // Ghi toàn bộ danh sách bệnh án vào file (vẫn sử dụng dữ liệu đã được thay đổi)
    public static void ghiFileDanhSach(List<BenhAn> danhSachBenhAn) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("benhAn.csv"))) {
            for (BenhAn benhAn : danhSachBenhAn) {
                writer.write(benhAn.toString());
                writer.newLine(); // Viết dòng mới sau mỗi bệnh án
            }
            System.out.println("Danh sách bệnh án đã được ghi vào file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Phương thức thêm một bệnh án vào danh sách và ghi lại vào file
    public static void themBenhAn(List<BenhAn> danhSachBenhAn, BenhAn benhAnMoi) {
        // Thêm bệnh án vào danh sách
        danhSachBenhAn.add(benhAnMoi);

        // Ghi lại toàn bộ danh sách vào file
        ghiFileDanhSach(danhSachBenhAn);

        // Hiển thị lại thông tin bệnh án
        benhAnMoi.thongTin();
    }
}
