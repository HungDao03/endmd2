package product;

public class BenhAnVIP extends BenhAn {
    private String loaiVIP;
    private String thoiHanVIP;

    public BenhAnVIP(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVIP, String thoiHanVIP) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public void thongTin() {
        System.out.println("Bệnh án VIP:");
        System.out.println("Số thứ tự: " + soThuTu);
        System.out.println("Mã bệnh án: " + maBenhAn);
        System.out.println("Mã bệnh nhân: " + maBenhNhan);
        System.out.println("Tên bệnh nhân: " + tenBenhNhan);
        System.out.println("Ngày nhập viện: " + ngayNhapVien);
        System.out.println("Ngày ra viện: " + ngayRaVien);
        System.out.println("Lý do nhập viện: " + lyDoNhapVien);
        System.out.println("Loại VIP: " + loaiVIP);
        System.out.println("Thời hạn VIP: " + thoiHanVIP);
    }
}
