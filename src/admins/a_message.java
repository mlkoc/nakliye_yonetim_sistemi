package admins;
import ana_menu.a_index;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static connection.nakliyeBaglanti.ConnectDb;
import static giris_ekrani.musteriLogin.musteri;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import net.proteanit.sql.DbUtils;

public class a_message extends javax.swing.JFrame {
   Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    
    public a_message() {
     initComponents();
         conn=ConnectDb();
         kombodoldur();
         Update_table();
    }
 public void Update_table(){
        try{
            String sql="Select mesaj_baslik,mesaj_icerik,mesaj_tarih from a_mesaj";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            tablo.setModel(DbUtils.resultSetToTableModel(re));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void kombodoldur(){
        try{
            String sql="Select musteri_email, musteri_id from musteriler";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            
            while(re.next()){
                String ad=re.getString("musteri_email");
                 musteriadi.addItem(ad);
                 
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mesaj_icerik = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        musteriadi = new javax.swing.JComboBox<>();
        mesaj_baslik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mesaj Sayfası");

        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Kimden", "Mesaj Başlığı", "Mesaj İçeriği", "Mesaj Tarihi"
            }
        ));
        jScrollPane1.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(2).setResizable(false);
        }

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 659, 132));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mesaj Gönder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mesaj Alıcısı:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, -1, -1));

        mesaj_icerik.setColumns(20);
        mesaj_icerik.setRows(3);
        jScrollPane2.setViewportView(mesaj_icerik);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 105, 409, 124));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/32/send-message2.png"))); // NOI18N
        jButton1.setText("YOLLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 235, -1, 30));

        musteriadi.setSelectedIndex(musteriadi.getSelectedIndex());
        musteriadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriadiActionPerformed(evt);
            }
        });
        jPanel1.add(musteriadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 17, 145, -1));
        jPanel1.add(mesaj_baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 57, 361, -1));

        jLabel2.setText("Başlık:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 60, -1, -1));

        jLabel3.setText("İçerik:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 11, 440, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void musteriadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriadiActionPerformed
    
    }//GEN-LAST:event_musteriadiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
  try{ 
             String sql="Insert into u_mesaj (musteri_id, mesaj_baslik,mesaj_icerik) Values(?,?,?)";
             pst=conn.prepareStatement(sql);
              pst.setString(1,Integer.toString(musteriadi.getSelectedIndex()));
              pst.setString(2, mesaj_baslik.getText());
              pst.setString(3,mesaj_icerik.getText());
         
             pst.execute();
             
             
             
             
               Properties pro = new Properties();
            pro.put("mail.smtp.host", "smtp.live.com");
            pro.put("mail.smtp.socketFactory.port", "465");
            pro.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            pro.put("mail.smtp.auth", "true");
            pro.put("mail.smtp.starttls.enable", "true");
            pro.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(pro,
                    new javax.mail.Authenticator() {
                
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("mlevent61@hotmail.com", "hotmailsifre"); /////// ŞİFREYİ GİRMEYİ UNUTMA 15.04.2020
                }
            });

            Runnable task2 = () -> {

                
                try {
                    Message mesaj = new MimeMessage(session);
                    mesaj.setFrom(new InternetAddress("mlevent61@hotmail.com"));
                    //String ab = (String) jTable1.getValueAt(i, 5);
                    mesaj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(musteriadi.getSelectedItem().toString().trim()));

                    mesaj.setSubject("Firmadan Mesaj Var");
                    mesaj.setText(mesaj_icerik.getText());
                    Transport.send(mesaj);
                   
                    
                } catch (MessagingException eex) {
                    System.err.println("mesaj gonderiminde hata : " + eex.toString());
                }

            };

            new Thread(task2).start();

             
             
             
             
             
             
             
             
            JOptionPane.showMessageDialog(null, "Mesajınız başarıyla gönderildi.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        a_index geri = new a_index();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a_message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_message().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mesaj_baslik;
    private javax.swing.JTextArea mesaj_icerik;
    private javax.swing.JComboBox<String> musteriadi;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
