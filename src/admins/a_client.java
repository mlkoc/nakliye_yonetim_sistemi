/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admins;
import ana_menu.a_index;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.util.Random;
import connection.nakliyeBaglanti;
import static musteri.u_cargoadd.convertUtilDateToSqlDate;
import static giris_ekrani.musteriLogin.musteri;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Mlkoc
 */
public class a_client extends javax.swing.JFrame {

    /**
     * Creates new form a_client
     */
    
        
    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    
  

    
    public a_client() {
        initComponents();
        conn=nakliyeBaglanti.ConnectDb();
        Update_table();
    }
    
 public void Update_table(){
        try{
            String sql="Select musteri_id,musteri_adsoyad,musteri_telefon,musteri_email from musteriler";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            tablo.setModel(DbUtils.resultSetToTableModel(re));
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
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        musteri_idu = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        adres = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        adsoyad = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        aramas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tarih = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Müşteriler");
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MÜŞTERİ İŞLEMLERİ");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 850, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 870, -1));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ad", "Soyad", "Telefon", "Adres", "E-Mail", "Kayıt Tarihi"
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 962, 168));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Upload_1.png"))); // NOI18N
        jButton1.setText("Bilgi Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 270, 140, 42));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete1_1.png"))); // NOI18N
        jButton3.setText("Müşteriyi Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 197, 140, 42));
        jPanel1.add(musteri_idu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 0, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adres.setColumns(20);
        adres.setRows(5);
        jScrollPane3.setViewportView(adres);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 43, 248, 113));

        jLabel9.setText("Adres");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 23, -1, -1));
        jPanel4.add(adsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 49, 160, -1));
        jPanel4.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 121, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Ad Soyad:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("E-mail:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Telefon:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("ARAMA:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel4.add(telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 83, 162, -1));

        aramas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramasKeyReleased(evt);
            }
        });
        jPanel4.add(aramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, 160, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 187, -1, -1));

        jTabbedPane1.addTab("Müşteri Görüntüle", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Ad:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Telefon:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("E-Mail:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Adres:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 233, 30));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 233, 30));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 234, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 234, 129));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Tarih:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        tarih.setDateFormatString("yyyy.MM.dd");
        jPanel3.add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 233, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Addons_1.png"))); // NOI18N
        jButton5.setText("EKLE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 180, 40));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 180, 39));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Müşteri Şifresi");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jTabbedPane1.addTab("Müşteri Ekle", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 870, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        a_index geri = new a_index();
        this.setVisible(false);
        geri.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String sql="INSERT INTO musteriler(musteri_adsoyad,musteri_telefon,musteri_email,musteri_adres,musteri_sifre,musteri_tarih) VALUES(?,?,?,?,?,?)";
        
        try{
            
            pst = conn.prepareStatement(sql);

            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField3.getText());
            pst.setString(3, jTextField4.getText());
            pst.setString(4, jTextArea1.getText());
            pst.setString(5, jTextField5.getText());
            pst.setDate(6,convertUtilDateToSqlDate(tarih.getDate()));

            int sifre;
        
            Random r = new Random();
            sifre=(r.nextInt(999999))+1000001;
            jTextField5.setText(String.valueOf(sifre));

                
            if(jTextField5.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Şifre Oluşturmadınız!");
            }
            else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Müşteri Eklendi");
                Update_table();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{ 
           String sql="Update musteriler set musteri_adsoyad=?, musteri_email=?, musteri_telefon=?, musteri_adres=? where musteri_id=?";
             pst=conn.prepareStatement(sql);
             
             pst.setString(1, adsoyad.getText());
             pst.setString(2, mail.getText());
              pst.setString(3, telefon.getText());
             pst.setString(4, adres.getText());
              pst.setString(5, musteri_idu.getText());
             pst.execute();
                      JOptionPane.showMessageDialog(null,"Güncellendi !");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            try{ 
          
             String sql="Delete from musteriler where musteri_id=? ";
             pst=conn.prepareStatement(sql);
             
             pst.setString(1, musteri_idu.getText());
             pst.execute();
                      JOptionPane.showMessageDialog(null,"Müşteri Silindi !");

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
            String sql="Select * from musteriler where musteri_id='"+table_click+"' ";
            pst=conn.prepareStatement(sql);
            re=(ResultSet) pst.executeQuery();
            
            if(re.next()){
                
                
                String ekle1=re.getString("musteri_adsoyad");
                adsoyad.setText(ekle1);
                
                String ekle3=re.getString("musteri_email");
                mail.setText(ekle3);
                
                String ekle2=re.getString("musteri_telefon");
                telefon.setText(ekle2);

                   String ekle4=re.getString("musteri_adres");
                adres.setText(ekle4);
                
                String ekle5 = re.getString("musteri_id");
                musteri_idu.setText(ekle5);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked

    private void aramasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramasKeyReleased

 try{ 
           
            String sql="Select * from musteriler where musteri_adsoyad = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,aramas.getText());
            re=(ResultSet) pst.executeQuery();
            
            if(re.next()){
                
                
                String ekle1=re.getString("musteri_adsoyad");
                adsoyad.setText(ekle1);
                
                String ekle3=re.getString("musteri_email");
                mail.setText(ekle3);
                
                String ekle2=re.getString("musteri_telefon");
                telefon.setText(ekle2);

                   String ekle4=re.getString("musteri_adres");
                adres.setText(ekle4);
                
                String ekle5 = re.getString("musteri_id");
                musteri_idu.setText(ekle5);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_aramasKeyReleased

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
            java.util.logging.Logger.getLogger(a_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adres;
    private javax.swing.JTextField adsoyad;
    private javax.swing.JTextField aramas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField musteri_idu;
    private javax.swing.JTable tablo;
    private com.toedter.calendar.JDateChooser tarih;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables

}
