package yazılımmühendisliği;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GörevliHastaRandevu extends javax.swing.JFrame {

    static int gonder;
    static boolean abas = false;
    static boolean atcno = false;
    static boolean aadı = false;

    public GörevliHastaRandevu() {
        initComponents();
        Doldur();
    }

    void Doldur() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT HRREZNO, HRTCNO, HRADSOYAD, HRDTARIH, HRTELNO,HRKAYITTARIH, HREZTARIH, HRREZSAAT, HRDOKTOR, HRKLINIK, HRREZDURUM  FROM HREZERVASYON";
            PreparedStatement s1 = c1.prepareStatement(sqlIfade);
            ResultSet rs = s1.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            Vector kolonIsimList = new Vector();
            DefaultTableModel tm1 = new DefaultTableModel();
            for (int i = 1; i < md.getColumnCount() + 1; i++) {
                kolonIsimList.add(md.getColumnName(i));
            }
            tm1.setDataVector(null, kolonIsimList);
            while (rs.next()) {
                Vector satir = new Vector(md.getColumnCount());
                satir.add(rs.getInt(1));
                satir.add(rs.getString(2));
                satir.add(rs.getString(3));
                satir.add(rs.getString(4));
                satir.add(rs.getString(5));
                satir.add(rs.getString(6));
                satir.add(rs.getString(7));
                satir.add(rs.getString(8));
                satir.add(rs.getString(9));
                satir.add(rs.getString(10));
                satir.add(rs.getString(11));

                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaRandevu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBastarih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTCkimlikno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        btnFiltrele = new javax.swing.JButton();
        btnRandevu = new javax.swing.JButton();
        btnDüzenle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrele", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Randevu Tarihi");

        txtBastarih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBastarihKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("TC Kimlik No");

        txtTCkimlikno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTCkimliknoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ad Soyad");

        txtAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdiKeyReleased(evt);
            }
        });

        btnFiltrele.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFiltrele.setText("Filtrele");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtBastarih)))
                    .addComponent(btnFiltrele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTCkimlikno, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBastarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTCkimlikno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnFiltrele, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRandevu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRandevu.setText("Yeni Randevu");
        btnRandevu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandevuActionPerformed(evt);
            }
        });

        btnDüzenle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDüzenle.setText("Düzenle");
        btnDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDüzenleActionPerformed(evt);
            }
        });

        btnSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnYenile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnYenile.setText("Yenile");
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnRandevu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDüzenle, btnRandevu, btnSil, btnYenile});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnYenile, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDüzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRandevu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDüzenle, btnRandevu, btnSil, btnYenile});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandevuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandevuActionPerformed
        GörevliHastaYeniRandevu ghr = new GörevliHastaYeniRandevu();
        ghr.setVisible(true);
    }//GEN-LAST:event_btnRandevuActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        this.setVisible(false);
        GörevliHastaRandevu ghr = new GörevliHastaRandevu();
        ghr.setVisible(true);
    }//GEN-LAST:event_btnYenileActionPerformed

    private void btnDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDüzenleActionPerformed
        try {
            gonder = (Integer) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            GörevliHastaRandevuDüzenle ghrd = new GörevliHastaRandevuDüzenle();
            ghrd.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan bir kayıt seçmelisiniz!!");
        }
    }//GEN-LAST:event_btnDüzenleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("delete from Hrezervasyon p where p.hrrezno=:rezno");
        q.setParameter("rezno", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Kayıt Silindi.");
        em.close();
        emf.close();

    }//GEN-LAST:event_btnSilActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        if (abas == true) {
            String abas = txtBastarih.getText();
            try {
                Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = c1.prepareStatement("SELECT HRREZNO, HRTCNO, HRADSOYAD, HRDTARIH, HRTELNO,HRKAYITTARIH, HREZTARIH, HRREZSAAT, HRDOKTOR, HRKLINIK, HRREZDURUM  FROM HREZERVASYON WHERE HREZTARIH = ?");
                ps.setString(1, abas);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData md = rs.getMetaData();
                Vector kolonIsimList = new Vector();
                DefaultTableModel tm1 = new DefaultTableModel();
                for (int i = 1; i < md.getColumnCount() + 1; i++) {
                    kolonIsimList.add(md.getColumnName(i));
                }
                tm1.setDataVector(null, kolonIsimList);
                while (rs.next()) {
                    Vector satir = new Vector(md.getColumnCount());
                    satir.add(rs.getInt(1));
                    satir.add(rs.getString(2));
                    satir.add(rs.getString(3));
                    satir.add(rs.getString(4));
                    satir.add(rs.getString(5));
                    satir.add(rs.getString(6));
                    satir.add(rs.getString(7));
                    satir.add(rs.getString(8));
                    satir.add(rs.getString(9));
                    satir.add(rs.getString(10));
                    satir.add(rs.getString(11));
                    tm1.addRow(satir);
                }
                jTable1.setModel(tm1);

            } catch (SQLException ex) {
                Logger.getLogger(GörevliHastaRandevu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (atcno == true) {
            String tc = txtTCkimlikno.getText();
            try {
                Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = c1.prepareStatement("SELECT HRREZNO, HRTCNO, HRADSOYAD, HRDTARIH, HRTELNO,HRKAYITTARIH, HREZTARIH, HRREZSAAT, HRDOKTOR, HRKLINIK, HRREZDURUM  FROM HREZERVASYON WHERE HRTCNO = ?");
                ps.setString(1, tc);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData md = rs.getMetaData();
                Vector kolonIsimList = new Vector();
                DefaultTableModel tm1 = new DefaultTableModel();
                for (int i = 1; i < md.getColumnCount() + 1; i++) {
                    kolonIsimList.add(md.getColumnName(i));
                }
                tm1.setDataVector(null, kolonIsimList);
                while (rs.next()) {
                    Vector satir = new Vector(md.getColumnCount());
                    satir.add(rs.getInt(1));
                    satir.add(rs.getString(2));
                    satir.add(rs.getString(3));
                    satir.add(rs.getString(4));
                    satir.add(rs.getString(5));
                    satir.add(rs.getString(6));
                    satir.add(rs.getString(7));
                    satir.add(rs.getString(8));
                    satir.add(rs.getString(9));
                    satir.add(rs.getString(10));
                    satir.add(rs.getString(11));
                    tm1.addRow(satir);
                }
                jTable1.setModel(tm1);

            } catch (SQLException ex) {
                Logger.getLogger(GörevliHastaRandevu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (aadı == true) {
            String ad = txtAdi.getText();
            try {
                Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = c1.prepareStatement("SELECT HRREZNO, HRTCNO, HRADSOYAD, HRDTARIH, HRTELNO,HRKAYITTARIH, HREZTARIH, HRREZSAAT, HRDOKTOR, HRKLINIK, HRREZDURUM  FROM HREZERVASYON WHERE HRADSOYAD = ?");
                ps.setString(1, ad);
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData md = rs.getMetaData();
                Vector kolonIsimList = new Vector();
                DefaultTableModel tm1 = new DefaultTableModel();
                for (int i = 1; i < md.getColumnCount() + 1; i++) {
                    kolonIsimList.add(md.getColumnName(i));
                }
                tm1.setDataVector(null, kolonIsimList);
                while (rs.next()) {
                    Vector satir = new Vector(md.getColumnCount());
                    satir.add(rs.getInt(1));
                    satir.add(rs.getString(2));
                    satir.add(rs.getString(3));
                    satir.add(rs.getString(4));
                    satir.add(rs.getString(5));
                    satir.add(rs.getString(6));
                    satir.add(rs.getString(7));
                    satir.add(rs.getString(8));
                    satir.add(rs.getString(9));
                    satir.add(rs.getString(10));
                    satir.add(rs.getString(11));
                    tm1.addRow(satir);
                }
                jTable1.setModel(tm1);

            } catch (SQLException ex) {
                Logger.getLogger(GörevliHastaRandevu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alanlardan bir tanesi doldurulmak zorunda!!!");

        }


    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void txtBastarihKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBastarihKeyReleased
        abas = true;
        if (txtBastarih.getText().length() == 0) {
            abas = false;
        }
    }//GEN-LAST:event_txtBastarihKeyReleased

    private void txtTCkimliknoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTCkimliknoKeyReleased
        atcno = true;
        if (txtTCkimlikno.getText().length() == 0) {
            atcno = false;
        }
    }//GEN-LAST:event_txtTCkimliknoKeyReleased

    private void txtAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdiKeyReleased
        aadı = true;
        if (txtAdi.getText().length() == 0) {
            aadı = false;
        }
    }//GEN-LAST:event_txtAdiKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GörevliHastaRandevu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDüzenle;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnRandevu;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtBastarih;
    private javax.swing.JTextField txtTCkimlikno;
    // End of variables declaration//GEN-END:variables
}
