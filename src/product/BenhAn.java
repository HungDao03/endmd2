package product;

public abstract class BenhAn {
    protected static int soThuTuCount = 1;  // Số thứ tự bệnh án tự động tăng
    protected int soThuTu;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhNhan;
    protected String ngayNhapVien;
    protected String ngayRaVien;
    protected String lyDoNhapVien;

    public BenhAn(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTuCount++;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public abstract void thongTin();

    @Override
    public String toString() {
        return soThuTu + "," + maBenhAn + "," + maBenhNhan + "," + tenBenhNhan + "," + ngayNhapVien + "," + ngayRaVien + "," + lyDoNhapVien;
    }
}
