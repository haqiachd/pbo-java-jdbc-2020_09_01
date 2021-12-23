
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class InputBarangMasukLama extends javax.swing.JFrame {

    private int x, y;
    private Connection conn;
    private PreparedStatement stat;
    
    public InputBarangMasukLama() {
        initComponents();
       
        this.setTitle("Input Barang Masuk");
        this.setLocationRelativeTo(null);
        this.btnSave.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnExit.setUI(new javax.swing.plaf.basic.BasicButtonUI());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        lineTop = new javax.swing.JSeparator();
        lblNamaBrg = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        lblJumlahBrg = new javax.swing.JLabel();
        inputJumlah = new javax.swing.JTextField();
        inputHarga = new javax.swing.JTextField();
        lblHargaBrg = new javax.swing.JLabel();
        lblTanggalBrg = new javax.swing.JLabel();
        inputTanggal = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(35, 34, 34));

        lblTop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTop.setForeground(new java.awt.Color(28, 126, 233));
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop.setText(" Menu Input Barang Masuk");

        lineTop.setBackground(new java.awt.Color(245, 238, 238));
        lineTop.setForeground(new java.awt.Color(245, 238, 238));

        lblNamaBrg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNamaBrg.setForeground(new java.awt.Color(248, 237, 237));
        lblNamaBrg.setText("  Nama Barang");

        inputNama.setBackground(new java.awt.Color(36, 37, 39));
        inputNama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inputNama.setForeground(new java.awt.Color(255, 255, 255));
        inputNama.setCaretColor(new java.awt.Color(255, 255, 255));

        lblJumlahBrg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblJumlahBrg.setForeground(new java.awt.Color(248, 237, 237));
        lblJumlahBrg.setText("  Jumlah Barang");

        inputJumlah.setBackground(new java.awt.Color(36, 37, 39));
        inputJumlah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inputJumlah.setForeground(new java.awt.Color(255, 255, 255));
        inputJumlah.setCaretColor(new java.awt.Color(255, 255, 255));

        inputHarga.setBackground(new java.awt.Color(36, 37, 39));
        inputHarga.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inputHarga.setForeground(new java.awt.Color(255, 255, 255));
        inputHarga.setCaretColor(new java.awt.Color(255, 255, 255));

        lblHargaBrg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblHargaBrg.setForeground(new java.awt.Color(248, 237, 237));
        lblHargaBrg.setText("  Harga Barang");

        lblTanggalBrg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblTanggalBrg.setForeground(new java.awt.Color(248, 237, 237));
        lblTanggalBrg.setText("  Tanggal Barang");

        inputTanggal.setBackground(new java.awt.Color(36, 37, 39));
        inputTanggal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inputTanggal.setForeground(new java.awt.Color(255, 255, 255));
        inputTanggal.setCaretColor(new java.awt.Color(255, 255, 255));

        btnSave.setBackground(new java.awt.Color(93, 156, 233));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnSave.setForeground(new java.awt.Color(253, 253, 253));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(239, 69, 69));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(253, 253, 253));
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblCopyright.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCopyright.setForeground(new java.awt.Color(249, 249, 249));
        lblCopyright.setText("Copyright © 2020 Achmad Baihaqi.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lineTop, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 213, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblHargaBrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJumlahBrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNamaBrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTanggalBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(inputJumlah)
                            .addComponent(inputHarga)
                            .addComponent(inputTanggal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineTop, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblJumlahBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHargaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTanggalBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblCopyright))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int xx = evt.getXOnScreen(),
        yy = evt.getYOnScreen();

        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_formMouseDragged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        
        try{
            // mengecek apakah input kosong atau tidak
            if (this.inputNama.getText().length() <= 0){
                JOptionPane.showMessageDialog(null, "Nama barang tidak diisi!");
            }else if(this.inputJumlah.getText().length() <= 0){
                JOptionPane.showMessageDialog(null, "Jumlah barang tidak diisi!");
            }else if(this.inputHarga.getText().length() <= 0){
                JOptionPane.showMessageDialog(null, "Harga barang tidak diisi!");
            }else if(this.inputTanggal.getText().length() <= 0){
                JOptionPane.showMessageDialog(null, "Tanggal barang tidak diisi!");
            }else{
                // menambahkan data ke table
                String sql = "INSERT INTO InputBarangMasuk VALUES('"+ this.inputNama.getText() + "', '" + this.inputJumlah.getText() + "', '" + this.inputHarga.getText() + "', '" + this.inputTanggal.getText() + "')";
                java.sql.Connection conn = (java.sql.Connection) Koneksi.config();
                stat = conn.prepareStatement(sql);
                stat.execute();
                JOptionPane.showMessageDialog(null, "Data sukses ditambahkan!!");
                conn.close();     
                
                // menghapus text pada input
                this.inputNama.setText("");
                this.inputJumlah.setText("");
                this.inputHarga.setText("");
                this.inputTanggal.setText("");
            }
            
        }catch(java.sql.SQLException sx){
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data\n" + sx);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        new MenuUtama().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        this.btnSave.setBackground(new java.awt.Color(239,69,69));
        this.btnExit.setBackground(new java.awt.Color(93,156,233));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        this.btnSave.setBackground(new java.awt.Color(93,156,233));
        this.btnExit.setBackground(new java.awt.Color(239,69,69));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        this.btnSave.setBackground(new java.awt.Color(93,156,233));
        this.btnExit.setBackground(new java.awt.Color(239,69,69));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        this.btnSave.setBackground(new java.awt.Color(239,69,69));
        this.btnExit.setBackground(new java.awt.Color(93,156,233));
    }//GEN-LAST:event_btnExitMouseExited


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputBarangMasukLama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputJumlah;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputTanggal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblHargaBrg;
    private javax.swing.JLabel lblJumlahBrg;
    private javax.swing.JLabel lblNamaBrg;
    private javax.swing.JLabel lblTanggalBrg;
    private javax.swing.JLabel lblTop;
    private javax.swing.JSeparator lineTop;
    // End of variables declaration//GEN-END:variables
}
