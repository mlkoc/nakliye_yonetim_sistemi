package giris_ekrani;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import connection.nakliyeBaglanti;
import giris_ekrani.girisPaneli;
import ana_menu.u_index;



public class musteriLogin extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    public static int musteri;
    /**
     * Creates new form u_login
     */
    
     public musteriLogin() {
       initComponents();
        conn=nakliyeBaglanti.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m_email = new javax.swing.JTextField();
        m_sifre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Giriş Paneli");
        setMinimumSize(new java.awt.Dimension(738, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("E-Mail:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 160, 40, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Şifre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 190, 32, 15);
        getContentPane().add(m_email);
        m_email.setBounds(290, 160, 170, 20);
        getContentPane().add(m_sifre);
        m_sifre.setBounds(290, 190, 170, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/16/Login.png"))); // NOI18N
        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 250, 93, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/16/back.png"))); // NOI18N
        jButton2.setText("Geri");
        jButton2.setMaximumSize(new java.awt.Dimension(93, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(93, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(93, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 250, 93, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/koc_sistem.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 70, 170, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NAKLİYE OTOMASYON SİSTEMİNE HOŞGELDİNİZ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 350, 310, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/17949-NRYKWW.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(729, 596));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 730, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String sql="Select musteri_id from musteriler where musteri_email=? and musteri_sifre=?";

        try{
            pst = conn.prepareStatement(sql);

            pst.setString(1, m_email.getText());
            pst.setString(2, m_sifre.getText());

            re=(ResultSet) pst.executeQuery();

            if(re.next()){

                JOptionPane.showMessageDialog(null, "Giriş Yapılıyor");
                int isim=re.getInt("musteri_id");

                musteri = isim;

                u_index uindex = new u_index();

                this.setVisible(false);
                uindex.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Yanlış Bilgiler");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        girisPaneli geri = new girisPaneli();
        this.setVisible(false);
        geri.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(musteriLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new musteriLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField m_email;
    private javax.swing.JTextField m_sifre;
    // End of variables declaration//GEN-END:variables
}
