
package Controller;

import Model.BenhNhan;
import Model.LoaiBaoHiem;
import Model.Tinh;
import View.QLBNView;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import javax.swing.JFrame;


public class QLBNController {
    
    public static void addDanhSachTinh(QLBNView qlbn) {
         ArrayList<Tinh> listTinh = Tinh.getDanhSachTinh();
        for(Tinh tinh : listTinh) {
            qlbn.address_input.addItem(tinh.getTenTinh());
        }
    }
    
    public static void addDanhSachCacLoaiBaoHiem(QLBNView qlbn) {
        ArrayList<String> cacLoaiBaoHiem = LoaiBaoHiem.getLoaiBaoHiem();
        for (String baoHiem : cacLoaiBaoHiem) {
            qlbn.cacLoaiBaoHiem.addItem(baoHiem);
        }
    }
    
    public static void xoaForm(QLBNView qlbn) {
        qlbn.maBenhNhan_input.setText("");
        qlbn.hoVaTen_input.setText("");
        qlbn.dateOfBirth_input.setText("");
        qlbn.buttonGroup1.clearSelection();
        qlbn.address_input.setSelectedItem(0);
        qlbn.btnPhongYc.setSelected(false);
        qlbn.cacLoaiBaoHiem.setSelectedItem(0);
        qlbn.ngayNhapVien.setText("");
        qlbn.soCCCD.setText("");
    }
}