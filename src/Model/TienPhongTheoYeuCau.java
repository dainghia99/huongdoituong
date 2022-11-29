
package Model;

/**
 *
 * @author DaiNghia
 */
public abstract class TienPhongTheoYeuCau implements TinhTien{
    protected double soTienPhong = 200000;
    protected int giam;

    public int getGiam() {
        return giam;
    }

    public void setGiam(int giam) {
        this.giam = giam;
    }

}
