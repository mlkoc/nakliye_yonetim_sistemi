
package musteri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static connection.nakliyeBaglanti.ConnectDb;
import static giris_ekrani.musteriLogin.musteri;

public class u_cargoadd extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    
    
    /**
     * Creates new form u_cargoadd
     */
    public u_cargoadd() {
        initComponents();
         conn=ConnectDb();
         kombodoldur();
    }
    
    
    public void kombodoldur(){
        try{
            String sql="Select sehir_adi from sehirler";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            
            while(re.next()){
                String ad=re.getString("sehir_adi");
                 sehir_adi1.addItem(ad);
               sehir_adi2.addItem(ad);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sehir_adi1 = new javax.swing.JComboBox<>();
        sehir_adi2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Yeni Nakliye İsteği");
        setMinimumSize(new java.awt.Dimension(367, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YENİ NAKLİYE İSTEĞİ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 337, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 357, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Nereden:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Nereye:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Tarih:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        sehir_adi1.setToolTipText("");
        sehir_adi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir_adi1ActionPerformed(evt);
            }
        });
        jPanel1.add(sehir_adi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 146, 30));
        sehir_adi1.getAccessibleContext().setAccessibleParent(this);

        sehir_adi2.setToolTipText("");
        jPanel1.add(sehir_adi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 146, 30));
        sehir_adi2.getAccessibleContext().setAccessibleParent(this);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 146, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 347, 190));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_1.png"))); // NOI18N
        jButton1.setText("İstek Yolla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 133, 46));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sehir_adi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir_adi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sehir_adi1ActionPerformed
public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{ 
             String sql="Insert into u_nakliyeistek (musteri_id, nakliyeistek_nerden,nakliyeistek_nereye,nakliyeistek_tarih) Values(?,?,?,?)";
             pst=conn.prepareStatement(sql);
              pst.setString(1,Integer.toString(musteri));
              pst.setString(2, sehir_adi1.getSelectedItem().toString());
              pst.setString(3,sehir_adi2.getSelectedItem().toString());
            pst.setDate(4,convertUtilDateToSqlDate(jDateChooser1.getDate()));

             pst.execute();
            JOptionPane.showMessageDialog(null, "Nakliye isteğiniz başarıyla kaydedilmiştir.");
            JOptionPane.showMessageDialog(null, "Nakliye durumunuz ile ilgili iletişime geçilecektir.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // Create an array list to be filled with group names


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
            java.util.logging.Logger.getLogger(u_cargoadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(u_cargoadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(u_cargoadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(u_cargoadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u_cargoadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> sehir_adi1;
    private javax.swing.JComboBox<String> sehir_adi2;
    // End of variables declaration//GEN-END:variables
}
