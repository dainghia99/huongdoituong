
package Model;

import java.util.Date;

/**
 *
 * @author DaiNghia
 */
public class ConNguoi {
    private String name;
    private Date ngaySinh;

    public ConNguoi() {
    }

    public ConNguoi(String name, Date ngaySinh) {
        this.name = name;
        this.ngaySinh = ngaySinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
