package yazılımmühendisliği;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class GörevliHastaRandevuDüzenle extends javax.swing.JFrame {

    public GörevliHastaRandevuDüzenle() {
        initComponents();
        DoldurTablo();
        txtDoldur();
        klinikDoldur();
    }

    void DoldurTablo() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT DRRANID, DRKLINIK, DRDOKTOR, DRBASBITSAAT, DRREZTARIH, DRHADSOYAD, DRCALDURUM FROM DRCALSAAT";
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

                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaRandevuDüzenle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void klinikDoldur() {
        String sonuc = "";
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s1 = c1.createStatement();
            ResultSet rs = s1.executeQuery("SELECT KADI FROM KLINIK");
            while (rs.next()) {
                sonuc = rs.getString("KADI");
                cmbKlinik.addItem(sonuc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaRandevuDüzenle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void doktorDoldur(String s) {
        String sonuc = "";
        String temp = "";
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s1 = c1.createStatement();
            ResultSet rs = s1.executeQuery("SELECT KDRKLINIK,KDRDRADSOYAD FROM KLINIKDR");

            while (rs.next()) {
                temp = rs.getString("KDRKLINIK");
                sonuc = rs.getString("KDRDRADSOYAD");
                if (temp.equals(s)) {
                    cmbDoktor.addItem(sonuc);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaRandevuDüzenle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void txtDoldur() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Hrezervasyon p WHERE p.hrrezno = :rezno");
        q.setParameter("rezno", GörevliHastaRandevu.gonder);
        List<Hrezervasyon> kisiList = q.getResultList();
        for (Hrezervasyon rezno : kisiList) {
            txtRtcno.setText(rezno.getHrtcno());
            txtRadsoyad.setText(rezno.getHradsoyad());
            txtDtarih.setText(rezno.getHrdtarih());
            txtTel.setText(rezno.getHrtelno());
            txtRandevuNo.setText(String.valueOf(rezno.getHrrezno()));
            txtKaytarih.setText(rezno.getHrkayittarih());
        }
        em.close();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDüzenle = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRtcno = new javax.swing.JTextField();
        txtRadsoyad = new javax.swing.JTextField();
        txtDtarih = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtKaytarih = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRandevuNo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmbKlinik = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        cmbDoktor = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        txtReztarih = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRezSaat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        btnDüzenle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDüzenle.setText("Randevuyu Düzenle");
        btnDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDüzenleActionPerformed(evt);
            }
        });

        btnVazgec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVazgec.setText("Vazgeç");
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasta Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("TC Kimlik No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ad Soyad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Doğum Tarihi");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Telefon Numarası");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Kayıt Tarihi");

        txtKaytarih.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Randevu No");

        txtRandevuNo.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtKaytarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRandevuNo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtRtcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtRadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtDtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel12, jLabel2, jLabel3, jLabel5, jLabel6});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDtarih, txtKaytarih, txtRadsoyad, txtRandevuNo, txtRtcno, txtTel});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRandevuNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRtcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtKaytarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel12, jLabel2, jLabel3, jLabel5, jLabel6});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDtarih, txtKaytarih, txtRadsoyad, txtRandevuNo, txtRtcno, txtTel});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Klinik Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Klinik Seçiniz");

        cmbKlinik.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKlinikİtemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Doktor Seçiniz.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Rezervasyon Tarihi");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Rezervasyon Saati");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(cmbKlinik, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(cmbDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRezSaat, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtReztarih))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbKlinik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtReztarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRezSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDüzenle)
                        .addGap(18, 18, 18)
                        .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDüzenle, btnVazgec});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVazgec, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnDüzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKlinikİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKlinikİtemStateChanged
        String a = cmbKlinik.getSelectedItem().toString();
        doktorDoldur(a);
    }//GEN-LAST:event_cmbKlinikİtemStateChanged

    private void btnDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDüzenleActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("update Hrezervasyon p set p.hrtcno=:tcno, p.hradsoyad=:adsoyad, p.hrdtarih=:dtarih, p.hrtelno=:tel,p.hrkayittarih=:ktarih,p.hrklinik=:klinik, p.hrdoktor=:doktor, p.hreztarih=:reztarih,p.hrrezsaat=:rezsaat WHERE p.hrrezno=:rezno");

        q.setParameter("tcno", txtRtcno.getText());
        q.setParameter("adsoyad", txtRadsoyad.getText());
        q.setParameter("dtarih", txtDtarih.getText());
        q.setParameter("tel", txtTel.getText());
        q.setParameter("ktarih", txtKaytarih.getText());
        q.setParameter("klinik", cmbKlinik.getSelectedItem().toString());
        q.setParameter("doktor", cmbDoktor.getSelectedItem().toString());
        q.setParameter("reztarih", txtReztarih.getText());
        q.setParameter("rezsaat", txtRezSaat.getText());

        q.setParameter("rezno", Integer.parseInt(txtRandevuNo.getText()));
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Kayıt Güncellendi.");
        this.setVisible(false);
        em.close();
        emf.close();
    }//GEN-LAST:event_btnDüzenleActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        int m = JOptionPane.showConfirmDialog(this, "Bu Ekranı Kapatırsanız Tüm Bilgileri Kaybedeceksiniz.");
        if (m == 0) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            txtReztarih.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            txtRezSaat.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        });
    }//GEN-LAST:event_jTable1MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GörevliHastaRandevuDüzenle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDüzenle;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JComboBox<String> cmbDoktor;
    private javax.swing.JComboBox<String> cmbKlinik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDtarih;
    private javax.swing.JTextField txtKaytarih;
    private javax.swing.JTextField txtRadsoyad;
    private javax.swing.JTextField txtRandevuNo;
    private javax.swing.JTextField txtRezSaat;
    private javax.swing.JTextField txtReztarih;
    private javax.swing.JTextField txtRtcno;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
