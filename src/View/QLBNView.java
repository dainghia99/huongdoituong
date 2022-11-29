
package View;

import Controller.QLBNController;
import Model.BenhNhan;
import Model.QLBNModel;
import Model.Tinh;
import Model.TienPhongTheoYeuCau;
import Model.TinhTienTheoLoaiBaoHiem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class QLBNView extends javax.swing.JFrame {

    ViewFind find = new ViewFind();
    QLBNModel model; 
    QLBNController controller;
    TinhTienTheoLoaiBaoHiem tinhTien = new TinhTienTheoLoaiBaoHiem();
    QLBNModel dsBenhNhanCanTimBNModel = new QLBNModel();
    
    public QLBNView() {
        this.model = new QLBNModel();
        initComponents();
        setLocationRelativeTo(null);
        controller.addDanhSachTinh(this);
        controller.addDanhSachCacLoaiBaoHiem(this);
    }

    public void addBenhNhan(BenhNhan bn, boolean gt, boolean phongYC) {
        this.model.insert(bn);
        DefaultTableModel model_table = (DefaultTableModel) tableList.getModel();
        int demTongSoBenhNhan = 1;
        for (int i = 0 ; i < model_table.getRowCount() ; ++i) {
            demTongSoBenhNhan += 1;
        }
        double tongSoTien = 0;
        if (bn.getLoaiBaoHiem() == "Bảo Hiểm Thương Binh" && btnPhongYc.isSelected()) {
            tongSoTien = tinhTien.tinhTienPhongYeuCauTheoLoaiBaoHiem(20);
        }
        else if (bn.getLoaiBaoHiem() == "Bảo Hiểm Sinh Viên" && btnPhongYc.isSelected()) {
            tongSoTien = tinhTien.tinhTienPhongYeuCauTheoLoaiBaoHiem(80);
        }
        else if (bn.getLoaiBaoHiem() == "Bảo Hiểm Hưu Trí" && btnPhongYc.isSelected()) {
            tongSoTien = tinhTien.tinhTienPhongYeuCauTheoLoaiBaoHiem(50);
        }
        
        this.tongSoBN.setText("Tổng số bệnh nhân: " +  demTongSoBenhNhan);
        
        SimpleDateFormat fmDate = new SimpleDateFormat("dd/MM/yyyy");
        model_table.addRow(new Object[] {bn.getMaBenhNhan(), bn.getName(), fmDate.format(bn.getNgaySinh()), ((gt) ? "Nam" : "Nữ"), bn.getQueQuan().getTenTinh(), ((phongYC) ? "x" : ""), fmDate.format(bn.getNgayNhapVien()), bn.getMaBHYT(), bn.getLoaiBaoHiem(), tongSoTien });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lableMaBenhNhan = new javax.swing.JLabel();
        maBenhNhan_input = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lableQueQuan1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lableQueQuan2 = new javax.swing.JLabel();
        lableQueQuan3 = new javax.swing.JLabel();
        lableQueQuan4 = new javax.swing.JLabel();
        lableQueQuan5 = new javax.swing.JLabel();
        lableQueQuan6 = new javax.swing.JLabel();
        lableQueQuan7 = new javax.swing.JLabel();
        lableQueQuan9 = new javax.swing.JLabel();
        lableQueQuan11 = new javax.swing.JLabel();
        lableQueQuan10 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        timKiem = new javax.swing.JTextField();
        dateOfBirth_input = new javax.swing.JTextField();
        hoVaTen_input = new javax.swing.JTextField();
        soCCCD = new javax.swing.JTextField();
        ngayNhapVien = new javax.swing.JTextField();
        tongSoBN = new javax.swing.JLabel();
        address_input = new javax.swing.JComboBox<>();
        btnNam = new javax.swing.JRadioButton();
        btnNu = new javax.swing.JRadioButton();
        btnPhongYc = new javax.swing.JCheckBox();
        cacLoaiBaoHiem = new javax.swing.JComboBox<>();
        btnHuy = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileOpen = new javax.swing.JMenuItem();
        fileClose = new javax.swing.JMenuItem();
        fileSeparator = new javax.swing.JPopupMenu.Separator();
        fileExit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        aboutMe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bệnh Nhân");

        lableMaBenhNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableMaBenhNhan.setText("Mã Bệnh Nhân");

        maBenhNhan_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        maBenhNhan_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maBenhNhan_inputActionPerformed(evt);
            }
        });

        lableQueQuan1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan1.setText("Danh Sách Bệnh Nhân");

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Bệnh Nhân", "Họ Và Tên", "Ngày Tháng Năm Sinh", "Giới Tính", "Quê Quán", "Phòng YC", "Ngày Nhập Viện", "Mã BHYT", "Loại Bảo Hiểm", "Tổng Số Tiền"
            }
        ));
        jScrollPane1.setViewportView(tableList);

        lableQueQuan2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan2.setText("Mã Bệnh Nhân");

        lableQueQuan3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan3.setText("Họ và tên");

        lableQueQuan4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan4.setText("Ngày tháng năm sinh");

        lableQueQuan5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan5.setText("Quê Quán");

        lableQueQuan6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan6.setText("Giới tính");

        lableQueQuan7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan7.setText("Loại bảo hiểm");

        lableQueQuan9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan9.setText("Phòng theo yêu cầu");

        lableQueQuan11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan11.setText("Mã BHTY");

        lableQueQuan10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lableQueQuan10.setText("Ngày nhập viện");

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa ");
        btnXoa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        timKiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemActionPerformed(evt);
            }
        });

        dateOfBirth_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dateOfBirth_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirth_inputActionPerformed(evt);
            }
        });

        hoVaTen_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        hoVaTen_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoVaTen_inputActionPerformed(evt);
            }
        });

        soCCCD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        soCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soCCCDActionPerformed(evt);
            }
        });

        ngayNhapVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ngayNhapVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayNhapVienActionPerformed(evt);
            }
        });

        tongSoBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tongSoBN.setText("Tổng số bệnh nhân:");

        address_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        address_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_inputActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnNam);
        btnNam.setText("Nam");
        btnNam.setBorder(null);

        buttonGroup1.add(btnNu);
        btnNu.setText("Nữ");
        btnNu.setBorder(null);

        btnPhongYc.setBorder(null);
        btnPhongYc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongYcActionPerformed(evt);
            }
        });

        cacLoaiBaoHiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHuy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        fileOpen.setText("Open");
        menuFile.add(fileOpen);

        fileClose.setText("Close");
        menuFile.add(fileClose);

        fileSeparator.setForeground(new java.awt.Color(51, 51, 51));
        menuFile.add(fileSeparator);

        fileExit.setText("Exit");
        menuFile.add(fileExit);

        jMenuBar1.add(menuFile);

        about.setText("About");

        aboutMe.setText("About Me");
        about.add(aboutMe);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lableMaBenhNhan)
                .addGap(35, 35, 35)
                .addComponent(timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lableQueQuan2)
                                            .addComponent(lableQueQuan3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tongSoBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lableQueQuan4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(hoVaTen_input, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lableQueQuan6))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(maBenhNhan_input, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lableQueQuan5)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(address_input, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnNam)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnNu))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(84, 84, 84)
                                                        .addComponent(btnPhongYc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(dateOfBirth_input, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lableQueQuan9))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lableQueQuan1)))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableQueQuan10)
                                    .addComponent(lableQueQuan11)
                                    .addComponent(lableQueQuan7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(ngayNhapVien, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(cacLoaiBaoHiem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableMaBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lableQueQuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableQueQuan5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lableQueQuan2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lableQueQuan7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maBenhNhan_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(address_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cacLoaiBaoHiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableQueQuan3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableQueQuan6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableQueQuan10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoVaTen_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayNhapVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNam)
                    .addComponent(btnNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPhongYc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lableQueQuan4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lableQueQuan9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lableQueQuan11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateOfBirth_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(soCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tongSoBN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

            String kq = null;
            String maBNTB= null,hovaten = null;
            String loaibaohiem = null;
            String tentinh = null;
            Date ngaySinhTable = null, ngayNhapVienTable = null;
            String phongYc = null, gioiTinh = null;
            String mabaohiem = null;
            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
            double tongTien = 0;
            
            try {
                
                for (int i = 0 ; i < tableList.getRowCount(); ++i) {
                kq = (String) tableList.getValueAt(i, 0);
                int isOK = -1;
                String giaTriCanTim = this.timKiem.getText();
                
                if (giaTriCanTim.equals(kq)) {
                    isOK = i;
                    
                    maBNTB = (String) tableList.getValueAt(i, 0);
                    hovaten = (String) tableList.getValueAt(i, 1);
                    try {
                        ngaySinhTable = fm.parse( (String) tableList.getValueAt(i, 2));
                        ngayNhapVienTable = fm.parse( (String) tableList.getValueAt(i, 6));
                    } catch (ParseException ex) {
                        Logger.getLogger(QLBNView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    gioiTinh = (String) tableList.getValueAt(i, 3);
                    tentinh = (String) tableList.getValueAt(i, 4);
                    phongYc = (String) tableList.getValueAt(i, 5);
                    mabaohiem = (String) tableList.getValueAt(i, 7);
                    loaibaohiem = (String) tableList.getValueAt(i, 8);
                    tongTien = (double) tableList.getValueAt(i, 9);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Không tìm thấy bệnh nhân yêu cầu!");
                        /// BỊ bug
                    }
                }
           
//                try {
                    DefaultTableModel model_table = (DefaultTableModel) find.tableFind.getModel();

                    SimpleDateFormat fmDate = new SimpleDateFormat("dd/MM/yyyy");
                    model_table.addRow(new Object[] {maBNTB, hovaten, fmDate.format(ngaySinhTable), gioiTinh, tentinh, phongYc, fmDate.format(ngayNhapVienTable), mabaohiem, loaibaohiem, tongTien });
                    find.setVisible(true);
                    find.setLocationRelativeTo(null);
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(rootPane, "Không tìm thấy bệnh nhân yêu cầu!");
//                }
                
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập Mã bệnh Nhân!");
            }
            
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         DefaultTableModel model_table = (DefaultTableModel) tableList.getModel();
         int i_row = tableList.getSelectedRow();
         if (i_row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn một bệnh nhân để thực hiện xóa!");
         }
         else {
            model_table.removeRow(i_row);
            
            int kq = 0;
            for (int i = 0; i < tableList.getRowCount(); ++i) {
                kq += 1;
            }
            tongSoBN.setText("Tổng số bệnh nhân: " + kq);
         }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        String mabn,hovaten;
        String loaibaohiem;
        String tentinh;
        Date ngaySinh = null, ngaynhapvien = null;
        boolean phongYc, gioiTinh = true;
        String mabaohiem;

        mabn = maBenhNhan_input.getText();
        hovaten = hoVaTen_input.getText();
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh = fm.parse(dateOfBirth_input.getText());
            ngaynhapvien = fm.parse(ngayNhapVien.getText());
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(rootPane, "Ngày tháng được ngăn cách bởi dấu '/' và không chứa ký tự khác ");
        }          
          if (btnNam.isSelected()) {
              gioiTinh = true;
          }
          else if (btnNu.isSelected()) {
              gioiTinh = false;
          }
          
          if(btnPhongYc.isSelected()) {
              phongYc = true;
          }
          else {
              phongYc = false;
          }
          
          tentinh = (String) address_input.getSelectedItem();
          Tinh t = new Tinh(0, tentinh);
          loaibaohiem = (String) cacLoaiBaoHiem.getSelectedItem();
          mabaohiem = soCCCD.getText();
          BenhNhan bn = new BenhNhan(mabn, t, ngaynhapvien, phongYc, gioiTinh, loaibaohiem, mabaohiem, hovaten, ngaySinh);
          
          try {
              if (!mabn.equals("") && !mabaohiem.equals("") && !hovaten.equals("") ) {
                    if (btnNam.isSelected() || btnNu.isSelected()) {                   
                        addBenhNhan(bn, gioiTinh, phongYc);
                        JOptionPane.showMessageDialog(rootPane, "Thêm bệnh nhân thành công!");                        
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn giới tính!");
                    }
                    
               }
               else {
                   JOptionPane.showConfirmDialog(rootPane, "Bạn phải điền đầy đủ thông tin!");
               }
          }
          catch (Exception ex) {
              JOptionPane.showConfirmDialog(rootPane, "Thông tin vừa nhập không hợp lệ!");
          } 
          controller.xoaForm(this);
    }//GEN-LAST:event_btnThemActionPerformed

    private void maBenhNhan_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maBenhNhan_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maBenhNhan_inputActionPerformed

    private void dateOfBirth_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirth_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfBirth_inputActionPerformed

    private void hoVaTen_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoVaTen_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoVaTen_inputActionPerformed

    private void soCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soCCCDActionPerformed

    private void ngayNhapVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayNhapVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayNhapVienActionPerformed

    private void btnPhongYcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongYcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhongYcActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        controller.xoaForm(this);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timKiemActionPerformed

    private void address_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_inputActionPerformed
       
    }//GEN-LAST:event_address_inputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLBNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBNView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBNView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu about;
    public javax.swing.JMenuItem aboutMe;
    public javax.swing.JComboBox<String> address_input;
    public javax.swing.JButton btnHuy;
    public javax.swing.JRadioButton btnNam;
    public javax.swing.JRadioButton btnNu;
    public javax.swing.JCheckBox btnPhongYc;
    public javax.swing.JButton btnThem;
    public javax.swing.JButton btnTim;
    public javax.swing.JButton btnXoa;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cacLoaiBaoHiem;
    public javax.swing.JTextField dateOfBirth_input;
    public javax.swing.JMenuItem fileClose;
    public javax.swing.JMenuItem fileExit;
    public javax.swing.JMenuItem fileOpen;
    private javax.swing.JPopupMenu.Separator fileSeparator;
    public javax.swing.JTextField hoVaTen_input;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lableMaBenhNhan;
    public javax.swing.JLabel lableQueQuan1;
    public javax.swing.JLabel lableQueQuan10;
    public javax.swing.JLabel lableQueQuan11;
    public javax.swing.JLabel lableQueQuan2;
    public javax.swing.JLabel lableQueQuan3;
    public javax.swing.JLabel lableQueQuan4;
    public javax.swing.JLabel lableQueQuan5;
    public javax.swing.JLabel lableQueQuan6;
    public javax.swing.JLabel lableQueQuan7;
    public javax.swing.JLabel lableQueQuan9;
    public javax.swing.JTextField maBenhNhan_input;
    public javax.swing.JMenu menuFile;
    public javax.swing.JTextField ngayNhapVien;
    public javax.swing.JTextField soCCCD;
    public javax.swing.JTable tableList;
    public javax.swing.JTextField timKiem;
    public javax.swing.JLabel tongSoBN;
    // End of variables declaration//GEN-END:variables


}
