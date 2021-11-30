/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana_menu;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import admins.a_info;
import musteri.u_cargoadd;
import musteri.u_mesajlar;
import musteri.u_nakliyelerim;
import musteri.u_odemebildir;
import musteri.u_profile;
import yedekleme.yedeklemeEkran;
import static connection.nakliyeBaglanti.ConnectDb;
import static giris_ekrani.musteriLogin.musteri;

/**
 *
 * @author Mlkoc
 */
public class u_index extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    /**
     * Creates new form a_index
     */
    public u_index() {
        initComponents();
                  conn=ConnectDb();
                    try{ 
            String sql="Select musteri_adsoyad from musteriler where musteri_id="+musteri;
            pst=conn.prepareStatement(sql);
            re=(ResultSet) pst.executeQuery();
            
            if(re.next()){
                String ekle1=re.getString("musteri_adsoyad");
                musteri_id.setText(ekle1);
                  }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        musteri_id = new javax.swing.JLabel();
        musteri_id1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        musteribtn = new javax.swing.JButton();
        nakliyekayitbtn = new javax.swing.JButton();
        dosyayzdr = new javax.swing.JButton();
        raporbtn = new javax.swing.JButton();
        odemebildirbtn = new javax.swing.JButton();
        mesajlarbtn = new javax.swing.JButton();
        nakliyelerbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetim Sistemi Anasayfa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        musteri_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        musteri_id.setText("İsim Soyisim");
        jPanel2.add(musteri_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        musteri_id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        musteri_id1.setText("Sayın:");
        jPanel2.add(musteri_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 920, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        musteribtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        musteribtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/users.png"))); // NOI18N
        musteribtn.setText("PROFİLİM");
        musteribtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musteribtn.setBorderPainted(false);
        musteribtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        musteribtn.setOpaque(false);
        musteribtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        musteribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteribtnActionPerformed(evt);
            }
        });
        jPanel1.add(musteribtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 90, 84));

        nakliyekayitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nakliyekayitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/map.png"))); // NOI18N
        nakliyekayitbtn.setText("YENİ NAKLİYE");
        nakliyekayitbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nakliyekayitbtn.setBorderPainted(false);
        nakliyekayitbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nakliyekayitbtn.setOpaque(false);
        nakliyekayitbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nakliyekayitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nakliyekayitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(nakliyekayitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 130, 84));

        dosyayzdr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dosyayzdr.setForeground(new java.awt.Color(255, 255, 255));
        dosyayzdr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/File-explorer.png"))); // NOI18N
        dosyayzdr.setText("YEDEKLEME");
        dosyayzdr.setToolTipText("");
        dosyayzdr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dosyayzdr.setBorderPainted(false);
        dosyayzdr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dosyayzdr.setOpaque(false);
        dosyayzdr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dosyayzdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyayzdrActionPerformed(evt);
            }
        });
        jPanel1.add(dosyayzdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 110, 84));

        raporbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        raporbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/Reports.png"))); // NOI18N
        raporbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raporbtn.setBorderPainted(false);
        raporbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raporbtn.setLabel("RAPORLAMA");
        raporbtn.setMaximumSize(new java.awt.Dimension(165, 73));
        raporbtn.setOpaque(false);
        raporbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        raporbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raporbtnActionPerformed(evt);
            }
        });
        jPanel1.add(raporbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 100, 84));

        odemebildirbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        odemebildirbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/add.png"))); // NOI18N
        odemebildirbtn.setText("ÖDEME İŞLEMLERİ");
        odemebildirbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        odemebildirbtn.setBorderPainted(false);
        odemebildirbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        odemebildirbtn.setOpaque(false);
        odemebildirbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        odemebildirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemebildirbtnActionPerformed(evt);
            }
        });
        jPanel1.add(odemebildirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 84));

        mesajlarbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesajlarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/Message-already-read.png"))); // NOI18N
        mesajlarbtn.setText("MESAJLAR");
        mesajlarbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mesajlarbtn.setBorderPainted(false);
        mesajlarbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mesajlarbtn.setOpaque(false);
        mesajlarbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mesajlarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesajlarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(mesajlarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 90, 84));

        nakliyelerbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nakliyelerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/64/Order-history.png"))); // NOI18N
        nakliyelerbtn.setText("NAKLİYELERİM");
        nakliyelerbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nakliyelerbtn.setBorderPainted(false);
        nakliyelerbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nakliyelerbtn.setMaximumSize(new java.awt.Dimension(195, 73));
        nakliyelerbtn.setMinimumSize(new java.awt.Dimension(195, 73));
        nakliyelerbtn.setOpaque(false);
        nakliyelerbtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nakliyelerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nakliyelerbtnActionPerformed(evt);
            }
        });
        jPanel1.add(nakliyelerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 120, 84));

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KULLANICI ALANI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 325, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 910, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lojloj.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nakliyekayitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nakliyekayitbtnActionPerformed
         u_cargoadd u_cargoadd = new u_cargoadd();
          u_cargoadd.setVisible(true); 
    }//GEN-LAST:event_nakliyekayitbtnActionPerformed

    private void raporbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raporbtnActionPerformed
       
    }//GEN-LAST:event_raporbtnActionPerformed

    private void musteribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteribtnActionPerformed
     
          u_profile u_profile = new u_profile();
          u_profile.setVisible(true); 
    }//GEN-LAST:event_musteribtnActionPerformed

    private void dosyayzdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyayzdrActionPerformed
        yedeklemeEkran u_form = new yedeklemeEkran();
          u_form.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_dosyayzdrActionPerformed

    private void odemebildirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemebildirbtnActionPerformed
         u_odemebildir u_odemebildir = new u_odemebildir();
          u_odemebildir.setVisible(true); 
    }//GEN-LAST:event_odemebildirbtnActionPerformed

    private void mesajlarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesajlarbtnActionPerformed
 u_mesajlar u_mesajlar = new u_mesajlar();
          u_mesajlar.setVisible(true);     }//GEN-LAST:event_mesajlarbtnActionPerformed

    private void nakliyelerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nakliyelerbtnActionPerformed
u_nakliyelerim u_nakliyelerim = new u_nakliyelerim();
          u_nakliyelerim.setVisible(true);     
        // TODO add your handling code here:
    }//GEN-LAST:event_nakliyelerbtnActionPerformed

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
            java.util.logging.Logger.getLogger(u_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(u_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(u_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(u_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u_index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dosyayzdr;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mesajlarbtn;
    private javax.swing.JLabel musteri_id;
    private javax.swing.JLabel musteri_id1;
    private javax.swing.JButton musteribtn;
    private javax.swing.JButton nakliyekayitbtn;
    private javax.swing.JButton nakliyelerbtn;
    private javax.swing.JButton odemebildirbtn;
    private javax.swing.JButton raporbtn;
    // End of variables declaration//GEN-END:variables
}