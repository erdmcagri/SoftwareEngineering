package yazılımmühendisliği;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class GörevliEkrani extends javax.swing.JFrame {

    static String kAdi;
    static int yetki;

    public GörevliEkrani() {
        initComponents();
        Date s = new Date();
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        saat.setText(sdf.format(s));
        Doldur();
    }

    void Doldur() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT p FROM Pbilgi p WHERE p.pid = :id");
        q.setParameter("id", GirisEkrani.kID);
        List<Pbilgi> kisiList = q.getResultList();
        for (Pbilgi kartNo : kisiList) {
            jLabel1.setText(kartNo.getPadsoyad());
            kAdi = kartNo.getPadsoyad();
            yetki = kartNo.getPyetki();
        }
        em.close();
        emf.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOdeme = new javax.swing.JButton();
        btnPersonel = new javax.swing.JButton();
        btnHastaKayit = new javax.swing.JButton();
        btnHastaRandevu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        saat = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOdeme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOdeme.setText("Ödeme");
        btnOdeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdemeActionPerformed(evt);
            }
        });

        btnPersonel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPersonel.setText("Personel");
        btnPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonelActionPerformed(evt);
            }
        });

        btnHastaKayit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHastaKayit.setText("Hasta Kayıt");
        btnHastaKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaKayitActionPerformed(evt);
            }
        });

        btnHastaRandevu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHastaRandevu.setText("Hasta Randevu");
        btnHastaRandevu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaRandevuActionPerformed(evt);
            }
        });

        jLabel1.setText("Kulanıcı adı");

        saat.setText("Saat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHastaKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHastaRandevu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(saat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(183, 183, 183))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHastaRandevu, btnOdeme, btnPersonel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(saat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHastaKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHastaRandevu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHastaKayit, btnHastaRandevu, btnOdeme, btnPersonel});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jMenu2.setText("Klinik İşlemleri");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Klinik Tanımlama");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHastaKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaKayitActionPerformed
        if (yetki == 2 || yetki == 1) {
            GörevliHastaKayıt ghk = new GörevliHastaKayıt();
            ghk.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Buraya Erişim İzniniz Bulunmamaktadır.");
        }
    }//GEN-LAST:event_btnHastaKayitActionPerformed

    private void btnHastaRandevuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaRandevuActionPerformed
        if (yetki == 3 || yetki == 1) {
            GörevliHastaRandevu ghr = new GörevliHastaRandevu();
            ghr.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Buraya Erişim İzniniz Bulunmamaktadır.");
        }
    }//GEN-LAST:event_btnHastaRandevuActionPerformed

    private void btnPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonelActionPerformed
        if (yetki == 1) {
            GörevliPersonelEkle gpe = new GörevliPersonelEkle();
            gpe.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Buraya Erişim İzniniz Bulunmamaktadır.");
        }
    }//GEN-LAST:event_btnPersonelActionPerformed

    private void btnOdemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdemeActionPerformed
        if (yetki == 4 || yetki == 1) {
            GörevliÖdeme gö = new GörevliÖdeme();
            gö.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Buraya Erişim İzniniz Bulunmamaktadır.");
        }
    }//GEN-LAST:event_btnOdemeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (yetki == 1) {
            GörevliKlinikTanımlama gkt = new GörevliKlinikTanımlama();
            gkt.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Buraya Erişim İzniniz Bulunmamaktadır.");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        GörevliKlinikTanımlama gkt = new GörevliKlinikTanımlama();
        gkt.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GörevliEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHastaKayit;
    private javax.swing.JButton btnHastaRandevu;
    private javax.swing.JButton btnOdeme;
    private javax.swing.JButton btnPersonel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel saat;
    // End of variables declaration//GEN-END:variables
}
