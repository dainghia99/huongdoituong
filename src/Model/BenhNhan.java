
package Model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author DaiNghia
 */
public class BenhNhan extends ConNguoi{
    private String maBenhNhan;
    private Tinh queQuan;
    private Date ngayNhapVien;
    private boolean phongTheoYeuCau, gioiTinh;
    private String loaiBaoHiem;
    private String maBHYT;

    public BenhNhan() {
    }

    public BenhNhan(String maBenhNhan, Tinh queQuan, Date ngayNhapVien, boolean phongTheoYeuCau, boolean gioiTinh, String loaiBaoHiem, String maBHYT, String name, Date ngaySinh) {
        super(name, ngaySinh);
        this.maBenhNhan = maBenhNhan;
        this.queQuan = queQuan;
        this.ngayNhapVien = ngayNhapVien;
        this.phongTheoYeuCau = phongTheoYeuCau;
        this.gioiTinh = gioiTinh;
        this.loaiBaoHiem = loaiBaoHiem;
        this.maBHYT = maBHYT;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public boolean isPhongTheoYeuCau() {
        return phongTheoYeuCau;
    }

    public void setPhongTheoYeuCau(boolean phongTheoYeuCau) {
        this.phongTheoYeuCau = phongTheoYeuCau;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoaiBaoHiem() {
        return loaiBaoHiem;
    }

    public void setLoaiBaoHiem(String loaiBaoHiem) {
        this.loaiBaoHiem = loaiBaoHiem;
    }

    public String getMaBHYT() {
        return maBHYT;
    }

    public void setMaBHYT(String maBHYT) {
        this.maBHYT = maBHYT;
    }
    
    
 
    
}
