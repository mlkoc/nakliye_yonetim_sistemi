package giris_ekrani;

import java.sql.*;
import javax.swing.JOptionPane;
import ana_menu.a_index;
import connection.nakliyeBaglanti;
import giris_ekrani.girisPaneli;



public class adminLogin extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;

    public static int admin;
    
    
     public adminLogin() {
        initComponents();
        conn=nakliyeBaglanti.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        y_kadi = new javax.swing.JTextField();
        y_sifre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel1.setText("Kullanıcı Adı:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 170, 77, 15);
        getContentPane().add(y_kadi);
        y_kadi.setBounds(310, 160, 160, 20);
        getContentPane().add(y_sifre);
        y_sifre.setBounds(310, 200, 160, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Şifre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 200, 32, 15);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/16/Login.png"))); // NOI18N
        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 280, 93, 25);

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
        jButton2.setBounds(220, 280, 93, 25);

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

        String sql="Select * from admin where a_username=? and a_password=?";

        try{

            pst = conn.prepareStatement(sql);

            pst.setString(1, y_kadi.getText());
            pst.setString(2, y_sifre.getText());

            re=(ResultSet) pst.executeQuery();

            if(re.next()){
                JOptionPane.showMessageDialog(null, "Giriş Yapılıyor");
                int isim=re.getInt("a_id");
                admin = isim;
                a_index aindex = new a_index();
                this.setVisible(false);
                aindex.setVisible(true);
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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new adminLogin().setVisible(true);
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
    private javax.swing.JTextField y_kadi;
    private javax.swing.JTextField y_sifre;
    // End of variables declaration//GEN-END:variables
}
