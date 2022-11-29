
package Model;

import java.util.ArrayList;

/**
 *
 * @author DaiNghia
 */
public class QLBNModel {
    private ArrayList<BenhNhan> dsBenhNhan;

    public QLBNModel() {
        this.dsBenhNhan = new ArrayList<BenhNhan>();
    }

    public QLBNModel(ArrayList<BenhNhan> dsBenhNhan) {
        this.dsBenhNhan = dsBenhNhan;
    }

    public ArrayList<BenhNhan> getDsBenhNhan() {
        return dsBenhNhan;
    }

    public void setDsBenhNhan(ArrayList<BenhNhan> dsBenhNhan) {
        this.dsBenhNhan = dsBenhNhan;
    }
    
    public void insert(BenhNhan benhNhan) {
        this.dsBenhNhan.add(benhNhan);
    }
    
    public void delete(BenhNhan benhNhan) {
        this.dsBenhNhan.remove(benhNhan);
    }
    
    public void update(BenhNhan benhNhan) {
        this.dsBenhNhan.remove(benhNhan);
        this.dsBenhNhan.add(benhNhan);
    }
}
