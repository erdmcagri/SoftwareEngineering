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

public class GörevliÖdeme extends javax.swing.JFrame {

    static int oID;
    int ucret = 100;
    String islemYapan = GörevliEkrani.kAdi;
    static String sosGuv;
    static String tc;
    static String ad;

    public GörevliÖdeme() {
        initComponents();
        Doldur();
    }

    void odemeId() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT MAX(p.odemeid) FROM Odeme p");

        int d = (int) q.getResultList().get(0);
        oID = d + 1;

        em.close();
        emf.close();

    }

    void Doldur() {
        Connection c1;
        try {
            c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sqlIfade = "SELECT MID,MHASTANO, MTCNO,MADSOYAD,MCEPTEL,MEVTEL,MADRES,MTARIH,MSIKAYET,MBULGU,MTESHIS,MTEDAVI,MRECETEID,MRAPORID,MSEVKID,MDURUM FROM MUAYENE";
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
                satir.add(rs.getInt(2));
                satir.add(rs.getString(3));
                satir.add(rs.getString(4));
                satir.add(rs.getString(5));
                satir.add(rs.getString(6));
                satir.add(rs.getString(7));
                satir.add(rs.getString(8));
                satir.add(rs.getString(9));
                satir.add(rs.getString(10));
                satir.add(rs.getString(11));
                satir.add(rs.getString(12));
                satir.add(rs.getInt(13));
                satir.add(rs.getInt(14));
                satir.add(rs.getInt(15));
                satir.add(rs.getString(16));

                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliÖdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("TC Kimlik No");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Hasta Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ödeme Şeklini Seçiniz.");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Kredi Kartı");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nakit");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Toplam Ücret");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Ödeme Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tc = txtTc.getText();
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = c1.prepareStatement("SELECT MID,MHASTANO, MTCNO,MADSOYAD,MCEPTEL,MEVTEL,MADRES,MTARIH,MSIKAYET,MBULGU,MTESHIS,MTEDAVI,MRECETEID,MRAPORID,MSEVKID,MDURUM FROM MUAYENE WHERE MTCNO = ?");
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
                satir.add(rs.getInt(2));
                satir.add(rs.getString(3));
                satir.add(rs.getString(4));
                satir.add(rs.getString(5));
                satir.add(rs.getString(6));
                satir.add(rs.getString(7));
                satir.add(rs.getString(8));
                satir.add(rs.getString(9));
                satir.add(rs.getString(10));
                satir.add(rs.getString(11));
                satir.add(rs.getString(12));
                satir.add(rs.getInt(13));
                satir.add(rs.getInt(14));
                satir.add(rs.getInt(15));
                satir.add(rs.getString(16));
                tm1.addRow(satir);
            }
            jTable1.setModel(tm1);

        } catch (SQLException ex) {
            Logger.getLogger(GörevliÖdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Odeme o = new Odeme();
            o.setOdemeid(oID);
            o.setOtcno(tc);
            o.setOadsoyad(ad);
            o.setOsosguv(sosGuv);
            if (jRadioButton1.isSelected()) {
                o.setOsekli("Kredi Kartı");
            } else if (jRadioButton2.isSelected()) {
                o.setOsekli("Nakit");
            } else {
                JOptionPane.showMessageDialog(this, "Ödeme Şekli Seçmelisiniz!!");
            }

            o.setOtutar(Integer.parseInt(jLabel3.getText().substring(15)));
            o.setOislemyapan(islemYapan);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Ödeme İşlemi Tamamlandı.");
            em.close();
            emf.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ödeme İşlemi Tamamlanamadı.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        sosGuv = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 9);
        tc = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        ad = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
        if (sosGuv.equals("SGK")) {
            jLabel3.setText("Toplam Tutar : 75");
        } else if (sosGuv.equals("Yeşilkart")) {
            jLabel3.setText("Toplam Tutar : 90");
        } else if (sosGuv.equals("Emekli Sandığı")) {
            jLabel3.setText("Toplam Tutar : 85");
        } else if (sosGuv.equals("18 Yaş Altı Sosyal Güvence")) {
            jLabel3.setText("Toplam Tutar : 80");
        } else {
            jLabel3.setText("Toplam Tutar : 100");
        }
    }//GEN-LAST:event_jTable1MousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GörevliÖdeme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTc;
    // End of variables declaration//GEN-END:variables
}
