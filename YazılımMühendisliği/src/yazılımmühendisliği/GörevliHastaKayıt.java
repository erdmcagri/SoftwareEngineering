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
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class GörevliHastaKayıt extends javax.swing.JFrame {

    static int hastaNo;
    static boolean atc = false;
    static boolean bhno = false;
    static boolean cadsoyad = false;

    public GörevliHastaKayıt() {
        initComponents();
        hastaDoldur();
    }

    void hastaDoldur() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT HASTANO,HTCNO,HADSOYAD,HDTARIH,HKAYTARIH,HADRES,HEVTEL,HCEPTEL,HMAIL FROM HKAYIT";
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
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHKTc = new javax.swing.JTextField();
        txtHKHNo = new javax.swing.JTextField();
        txtHKadi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSorgula = new javax.swing.JButton();
        btnYeniKayit = new javax.swing.JButton();
        btnDüzenle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hastanın herhangi bir bilgisi girilerek sorgulama yapılabilir.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("TC Kimlik No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ad Soyad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hasta Numarası");

        txtHKTc.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtHKTcİnputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtHKTc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHKTcKeyReleased(evt);
            }
        });

        txtHKHNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHKHNoKeyReleased(evt);
            }
        });

        txtHKadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHKadiKeyReleased(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSorgula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSorgula.setText("Sorgula");
        btnSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaActionPerformed(evt);
            }
        });

        btnYeniKayit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnYeniKayit.setText("Yeni Kayıt");
        btnYeniKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniKayitActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnYeniKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHKTc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHKHNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(btnSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHKHNo, txtHKTc, txtHKadi});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnYenile, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnYeniKayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDüzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHKTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHKHNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYeniKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniKayitActionPerformed
        GörevliHastaYeniKayıt ghy = new GörevliHastaYeniKayıt();
        ghy.setVisible(true);

    }//GEN-LAST:event_btnYeniKayitActionPerformed

    private void btnDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDüzenleActionPerformed
        //Yetkili Girebilir Ancak düzenle!!!
        try {
            hastaNo = (Integer) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            int a = 1234;
            int b = Integer.parseInt(JOptionPane.showInputDialog("Giriş İçin Şifre Giriniz!"));
            if (a == b) {
                GörevliHastaDüzenle ghd = new GörevliHastaDüzenle();
                ghd.setVisible(true);
            }
            if (a != b) {
                JOptionPane.showMessageDialog(this, "Buraya Giriş Yetkiniz Bulunmamaktadır.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Tablodan bir kayıt seçmelisiniz!!");
        }


    }//GEN-LAST:event_btnDüzenleActionPerformed

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        this.setVisible(false);
        txtHKHNo.setText(null);
        txtHKTc.setText(null);
        txtHKadi.setText(null);
        GörevliHastaKayıt c = new GörevliHastaKayıt();
        c.setVisible(true);
    }//GEN-LAST:event_btnYenileActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("delete from Hkayit p where p.hastano=:hastano");
        q.setParameter("hastano", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(this, "Kayıt Silindi.");
        em.close();
        emf.close();
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaActionPerformed
        if (atc == true) {
            String tc = txtHKTc.getText();
            sorgulatc(tc);
        } else if (bhno == true) {
            int hno = Integer.parseInt(txtHKHNo.getText());
            sorgulahno(hno);
        } else if (cadsoyad == true) {
            String adsoyad = txtHKadi.getText();
            try {
                Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = c1.prepareStatement("SELECT HASTANO,HTCNO,HADSOYAD,HDTARIH,HKAYTARIH,HADRES,HEVTEL,HCEPTEL,HMAIL FROM HKAYIT WHERE HADSOYAD = ?");
                ps.setString(1, adsoyad);
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
                    tm1.addRow(satir);
                }
                jTable1.setModel(tm1);

            } catch (SQLException ex) {
                Logger.getLogger(GörevliHastaKayıt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alanlardan bir tanesi doldurulmak zorunda!!!");
        }


    }//GEN-LAST:event_btnSorgulaActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            hastaNo = (Integer) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        });

    }//GEN-LAST:event_jTable1MousePressed

    private void txtHKTcİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtHKTcİnputMethodTextChanged

    }//GEN-LAST:event_txtHKTcİnputMethodTextChanged

    private void txtHKTcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHKTcKeyReleased
        atc = true;
        if (txtHKTc.getText().length() == 0) {
            atc = false;
        }
    }//GEN-LAST:event_txtHKTcKeyReleased

    private void txtHKHNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHKHNoKeyReleased
        bhno = true;
        if (txtHKHNo.getText().length() == 0) {
            bhno = false;
        }
    }//GEN-LAST:event_txtHKHNoKeyReleased

    private void txtHKadiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHKadiKeyReleased
        cadsoyad = true;
        if (txtHKadi.getText().length() == 0) {
            cadsoyad = false;
        }
    }//GEN-LAST:event_txtHKadiKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GörevliHastaKayıt().setVisible(true);
            }
        });
    }

    void sorgulatc(String a) {
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = c1.prepareStatement("SELECT HASTANO,HTCNO,HADSOYAD,HDTARIH,HKAYTARIH,HADRES,HEVTEL,HCEPTEL,HMAIL FROM HKAYIT WHERE HTCNO = ?");
            ps.setString(1, a);
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
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void sorgulahno(int a) {
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = c1.prepareStatement("SELECT HASTANO,HTCNO,HADSOYAD,HDTARIH,HKAYTARIH,HADRES,HEVTEL,HCEPTEL,HMAIL FROM HKAYIT WHERE HASTANO = ?");
            ps.setInt(1, a);
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
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDüzenle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSorgula;
    private javax.swing.JButton btnYeniKayit;
    private javax.swing.JButton btnYenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHKHNo;
    private javax.swing.JTextField txtHKTc;
    private javax.swing.JTextField txtHKadi;
    // End of variables declaration//GEN-END:variables
}
