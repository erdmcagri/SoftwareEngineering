package yazılımmühendisliği;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class KlinikDoktorAta extends javax.swing.JFrame {

    public KlinikDoktorAta() {
        initComponents();
        kNo();
        txtAD.setText(GörevliKlinikTanımlama.ad);
        doktorDoldur();
    }

      void kNo() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT MAX(p.kdrid) FROM Klinikdr p");

        int d = (int) q.getResultList().get(0);
        txtKlinik.setText(String.valueOf(d + 1));

        em.close();
        emf.close();

    }

    void doktorDoldur() {
        String sonuc = "";
        try {
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s1 = c1.createStatement();
            ResultSet rs = s1.executeQuery("SELECT PADSOYAD FROM PBILGI WHERE PUNVAN = 'Doktor'");
            while (rs.next()) {
                sonuc = rs.getString("PADSOYAD");
                cmbDr.addItem(sonuc);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GörevliHastaYeniRandevu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKlinik = new javax.swing.JTextField();
        txtAD = new javax.swing.JTextField();
        cmbDr = new javax.swing.JComboBox();
        btnAta = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jTextField3.setText("jTextField3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Klinik ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Klinik Adı");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Doktor");

        txtKlinik.setEditable(false);

        txtAD.setEditable(false);

        btnAta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAta.setText("Ata");
        btnAta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKlinik)
                    .addComponent(txtAD)
                    .addComponent(cmbDr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(btnAta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKlinik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaActionPerformed
         try {
            Klinikdr k = new Klinikdr();
            k.setKdrid(Integer.parseInt(txtKlinik.getText()));
            k.setKdrdradsoyad(cmbDr.getSelectedItem().toString());
            k.setKdrklinik(txtAD.getText());
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("YazilimMuhPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(k);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Doktor Atama Başarılı.");
            em.close();
            emf.close();
            cmbDr.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Doktor Atama Başarısız.");
        }
    }//GEN-LAST:event_btnAtaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlinikDoktorAta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAta;
    private javax.swing.JComboBox cmbDr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAD;
    private javax.swing.JTextField txtKlinik;
    // End of variables declaration//GEN-END:variables
}
