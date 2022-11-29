
package Model;

/**
 *
 * @author DaiNghia
 */
public class TinhTienTheoLoaiBaoHiem extends TienPhongTheoYeuCau{

    @Override
    public double tinhTienPhongYeuCauTheoLoaiBaoHiem(int giam) {
        return (soTienPhong * giam) / 100;
    }
}
