package admins;
import com.github.sarxos.webcam.Webcam;

import ana_menu.a_index;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static connection.nakliyeBaglanti.ConnectDb;
import static musteri.u_cargoadd.convertUtilDateToSqlDate;
import static giris_ekrani.musteriLogin.musteri;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import net.proteanit.sql.DbUtils;



public class a_drivers extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    
    public a_drivers() {
        initComponents();
          conn=ConnectDb();
      
         Update_table();
    }

 public void Update_table(){
        try{
            String sql="Select sofor_id,sofor_adsoyad ,sofor_telefon,sofor_maas,sofor_email from a_soforler";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            tablo.setModel(DbUtils.resultSetToTableModel(re));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adsoyad = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adres = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tarih = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        maas = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        btnBaslat = new javax.swing.JButton();
        btnFotoCek = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        sil_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gmaas = new javax.swing.JTextField();
        gemail = new javax.swing.JTextField();
        gtelefon = new javax.swing.JTextField();
        gadsoyad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        gadres = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Şöförler");
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SÜRÜCÜ İŞLEMLERİ");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 705, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 725, -1));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ad Soyad:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefon:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 43, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("E-Mail:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 86, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Adres:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 203, -1, -1));
        jPanel3.add(adsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 0, 350, 30));
        jPanel3.add(telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 36, 350, 30));
        jPanel3.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 79, 350, 30));

        adres.setColumns(20);
        adres.setRows(5);
        jScrollPane1.setViewportView(adres);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 203, 350, 129));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tarih:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 162, -1, -1));

        tarih.setDateFormatString("yyyy.MM.dd");
        jPanel3.add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 162, 350, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("EKLE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 180, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Maaş:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 122, -1, -1));
        jPanel3.add(maas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 122, 350, 30));

        lblFoto.setText(" ");
        jPanel3.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, 220));

        btnBaslat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBaslat.setForeground(new java.awt.Color(0, 51, 102));
        btnBaslat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power.png"))); // NOI18N
        btnBaslat.setText("Başlat");
        btnBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaslatActionPerformed(evt);
            }
        });
        jPanel3.add(btnBaslat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, 39));

        btnFotoCek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFotoCek.setForeground(new java.awt.Color(0, 51, 102));
        btnFotoCek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/camera.png"))); // NOI18N
        btnFotoCek.setText("Fotoğraf Çek");
        btnFotoCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoCekActionPerformed(evt);
            }
        });
        jPanel3.add(btnFotoCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 39));

        jTabbedPane1.addTab("Yeni Sürücü Ekle", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 587, 188));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_1.png"))); // NOI18N
        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 217, 133, 42));
        jPanel1.add(sil_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 357, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Ad Soyad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("E-mail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Telefon");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Maaş");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Adres");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));
        jPanel1.add(gmaas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, -1));
        jPanel1.add(gemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, -1));
        jPanel1.add(gtelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, -1));

        gadsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gadsoyadActionPerformed(evt);
            }
        });
        jPanel1.add(gadsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, -1));

        gadres.setColumns(20);
        gadres.setRows(5);
        jScrollPane3.setViewportView(gadres);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 238, 208, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jButton4.setText("Güncelle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 270, 133, 42));

        jTabbedPane1.addTab("Sürücüleri Listele", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 700, 417));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        a_index geri = new a_index();
        this.setVisible(false);
        geri.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           try{ 
             String sql="Insert into a_soforler (sofor_adsoyad,sofor_telefon,sofor_adres,sofor_email,sofor_maas,sofor_tarih) Values(?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             pst.setString(1, adsoyad.getText());
              pst.setString(2,telefon.getText());
               pst.setString(3,adres.getText());
                pst.setString(4,mail.getText());
                 pst.setString(5,maas.getText());
             pst.setDate(6,convertUtilDateToSqlDate(tarih.getDate()));
            
             pst.execute();
            JOptionPane.showMessageDialog(null, "Yeni şoför başarıyla kaydedilmiştir.");
            Update_table();
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try{ 
             String sql="Delete from a_soforler where sofor_id=?";
             pst=conn.prepareStatement(sql);
             
             pst.setString(1, sil_txt.getText());
             pst.execute();
              JOptionPane.showMessageDialog(null, "Şoför başarıyla silinmiştir.");
              Update_table();
        }
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        
  try{ 
            int satir=tablo.getSelectedRow(); 
            String table_click=(tablo.getModel().getValueAt(satir, 0).toString());
            String sql="Select * from a_soforler where sofor_id='"+table_click+"' ";
            pst=conn.prepareStatement(sql);
            re=(ResultSet) pst.executeQuery();
            
            if(re.next()){
                String ekle1=re.getString("sofor_id");
                sil_txt.setText(ekle1);
                
                String ekle2 = re.getString("sofor_adsoyad");
                gadsoyad.setText(ekle2);
               
                 String ekle3 = re.getString("sofor_adres");
                gadres.setText(ekle3);
                
                 String ekle4 = re.getString("sofor_maas");
                gmaas.setText(ekle4);
                
                 String ekle5 = re.getString("sofor_telefon");
                gtelefon.setText(ekle5);
                
                  String ekle6 = re.getString("sofor_email");
                gemail.setText(ekle6);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                   try{ 
           String sql="Update a_soforler set sofor_adsoyad=?, sofor_telefon=?, sofor_adres=?, sofor_email=?, sofor_maas=? where sofor_id=?";
             pst=conn.prepareStatement(sql);
             
             pst.setString(1, gadsoyad.getText());
             pst.setString(2, gtelefon.getText());
            
             pst.setString(3, gadres.getText());
              pst.setString(4, gemail.getText());
                     pst.setString(5, gmaas.getText());
              pst.setString(6, sil_txt.getText());
             pst.execute();
                      JOptionPane.showMessageDialog(null,"Güncellendi !");
                      Update_table();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    public static boolean durum = false;
     void cam_calis() {
        
        durum = true;
        Runnable calis = () -> {
//            Dimension resolution = new Dimension(320, 180);
            Dimension resolution = new Dimension(190, 230);
            Webcam webcam = Webcam.getDefault();
            webcam.setCustomViewSizes(new Dimension[]{resolution});
            webcam.setViewSize(resolution);
            webcam.open();
            BufferedImage img = null;
            while (durum) {

                // get image
                img = webcam.getImage();

                if (img != null) {
                    ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), 1));
                    lblFoto.setIcon(imageIcon);
                }

            }
        };
        new Thread(calis).start();

    }
    BufferedImage image;

    public void fotoAl() throws IOException {

        durum = false;
        Webcam webcam = Webcam.getDefault();
        image = webcam.getImage();

        if (image != null) {
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), 1));
            lblFoto.setIcon(imageIcon);
        }

        webcam.close();
    }

    
    
    private void gadsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gadsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gadsoyadActionPerformed

    private void btnBaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaslatActionPerformed
        cam_calis();
    }//GEN-LAST:event_btnBaslatActionPerformed

    private void btnFotoCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoCekActionPerformed

        try {
            fotoAl();
        } catch (IOException ex) {
            System.err.println("foto alım hatası : " + ex);
        }
    }//GEN-LAST:event_btnFotoCekActionPerformed

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
            java.util.logging.Logger.getLogger(a_drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_drivers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adres;
    private javax.swing.JTextField adsoyad;
    private javax.swing.JButton btnBaslat;
    private javax.swing.JButton btnFotoCek;
    private javax.swing.JTextArea gadres;
    private javax.swing.JTextField gadsoyad;
    private javax.swing.JTextField gemail;
    private javax.swing.JTextField gmaas;
    private javax.swing.JTextField gtelefon;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField maas;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField sil_txt;
    private javax.swing.JTable tablo;
    private com.toedter.calendar.JDateChooser tarih;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
