package product;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void thongTin() {
        System.out.println("Bệnh án Thường:");
        System.out.println("Số thứ tự: " + soThuTu);
        System.out.println("Mã bệnh án: " + maBenhAn);
        System.out.println("Mã bệnh nhân: " + maBenhNhan);
        System.out.println("Tên bệnh nhân: " + tenBenhNhan);
        System.out.println("Ngày nhập viện: " + ngayNhapVien);
        System.out.println("Ngày ra viện: " + ngayRaVien);
        System.out.println("Lý do nhập viện: " + lyDoNhapVien);
        System.out.println("Phí nằm viện: " + phiNamVien + " VND");
    }
}
