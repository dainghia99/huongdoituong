
package Model;

import java.util.ArrayList;

/**
 *
 * @author DaiNghia
 */
public class LoaiBaoHiem {
    public static ArrayList<String> getLoaiBaoHiem() {
        String []cacLoaiBaoHiem = {"Bảo Hiểm Thương Binh", "Bảo Hiểm Sinh Viên", "Bảo Hiểm Hưu Trí"};
        
        ArrayList<String> danhSachCacLoaiBaoHiem = new ArrayList<String>();
        for (String loaiBaoHiem : cacLoaiBaoHiem) {
            danhSachCacLoaiBaoHiem.add(loaiBaoHiem);
        }
        return danhSachCacLoaiBaoHiem;
    }
}
