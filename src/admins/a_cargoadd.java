
package admins;

import ana_menu.a_index;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static connection.nakliyeBaglanti.ConnectDb;
import static giris_ekrani.musteriLogin.musteri;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class a_cargoadd extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
   
    ResultSet re1=null;
    PreparedStatement pst1=null;
    
    ResultSet re2=null;
    PreparedStatement pst2=null;
    
     ResultSet re3=null;
    PreparedStatement pst3=null;
    public a_cargoadd() {
        initComponents();
         conn=ConnectDb();
         kombodoldur();
          kombodoldur2();
          kombodoldur3();
           Update_table();
    }
    
 public void Update_table(){
        try{
            String sql="Select nakliyat_id,nakliyat_nerden ,nakliyat_nereye,sofor_id,musteri_id, nakliyat_tarih from a_nakliyatlar";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            nakliyetablo.setModel(DbUtils.resultSetToTableModel(re));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
         try{
            String sql="Select nakliyeistek_id,nakliyeistek_nerden ,nakliyeistek_nereye,nakliyeistek_tarih from u_nakliyeistek";
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
            String sql="Select sehir_adi from sehirler";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            
            while(re.next()){
                String ad=re.getString("sehir_adi");
                 nerden.addItem(ad);
               nereye.addItem(ad);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void kombodoldur2(){
        try{
            String sql="Select musteri_id,musteri_adsoyad from musteriler";
            pst1=conn.prepareStatement(sql);
            
            re1=(ResultSet) pst1.executeQuery();
            
            while(re1.next()){
                String ad=re1.getString("musteri_adsoyad");
                 musteri.addItem(ad);
              
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void kombodoldur3(){
        try{
            String sql="Select sofor_adsoyad from a_soforler";
            pst2=conn.prepareStatement(sql);
            
            re2=(ResultSet) pst2.executeQuery();
            
            while(re2.next()){
                String ad=re2.getString("sofor_adsoyad");
                 sofor.addItem(ad);
              
            }
            
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nakliyetablo = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sofor = new javax.swing.JComboBox<>();
        musteri = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tarih = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        nerden = new javax.swing.JComboBox<>();
        nereye = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        sil_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        sil_txt2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Yeni Nakliyat Ekle");
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAKLİYAT EKLE & SİL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 622, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 642, -1));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nakliyetablo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nakliyetablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nerden", "Nereye", "Müşteri", "Şöförü", "Kayıt Tarihi"
            }
        ));
        nakliyetablo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nakliyetablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nakliyetablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nakliyetabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(nakliyetablo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 617, 188));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Nakliyat Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 117, 42));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 208, -1, -1));

        jTabbedPane1.addTab("Nakliyatları Görüntüle", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nerden:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nereye:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 62, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Müşteri:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 137, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Şöför:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 177, -1, -1));

        jPanel5.add(sofor, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 174, 233, -1));

        musteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriActionPerformed(evt);
            }
        });
        jPanel5.add(musteri, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 134, 233, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tarih:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 92, -1, -1));

        tarih.setDateFormatString("yyyy-MM-dd");
        jPanel5.add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 92, 233, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Accept_1.png"))); // NOI18N
        jButton5.setText("EKLE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 214, 233, 60));

        jPanel5.add(nerden, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 11, 233, 32));

        jPanel5.add(nereye, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 54, 233, 32));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 283));

        jTabbedPane1.addTab("Nakliyat Ekle", jPanel3);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Musteri", "Nerden", "Nereye", "Tarih"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("İsteği Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        sil_txt.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(sil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        jTabbedPane1.addTab("Nakliyat İstekleri", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, 328));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 428, -1, -1));

        sil_txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(sil_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 428, 0, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        a_index geri = new a_index();
        this.setVisible(false);
        geri.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
            
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                              
         try{ 
             String sql="Insert into a_nakliyatlar (nakliyat_nerden, nakliyat_nereye,sofor_id,musteri_id,nakliyat_tarih) Values(?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
              
              pst.setString(1, nerden.getSelectedItem().toString());
              pst.setString(2,nereye.getSelectedItem().toString());
               pst.setString(3,sofor.getSelectedItem().toString());
               pst.setString(4,musteri.getSelectedItem().toString());
            pst.setDate(5,convertUtilDateToSqlDate(tarih.getDate()));
          
             pst.execute();
            JOptionPane.showMessageDialog(null, "Nakliye başarıyla kaydedilmiştir.");
             Update_table();
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  try{ 
             String sql="Delete from u_nakliyeistek where nakliyeistek_id=?";
             pst=conn.prepareStatement(sql);
             
             pst.setString(1, sil_txt.getText());
             pst.execute();
             JOptionPane.showMessageDialog(null, "İstek başarıyla silinmiştir.");
              Update_table();
             
        }
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked

  try{ 
            int satir=tablo.getSelectedRow(); 
            String table_click=(tablo.getModel().getValueAt(satir, 0).toString());
            String sql="Select * from u_nakliyeistek where nakliyeistek_id='"+table_click+"' ";
            pst3=conn.prepareStatement(sql);
            re3=(ResultSet) pst3.executeQuery();
            
            if(re3.next()){
                String ekle1=re3.getString("nakliyeistek_id");
                sil_txt.setText(ekle1);
                
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 try{ 
             String sql4="Delete from a_nakliyatlar where nakliyat_id=?";
             pst=conn.prepareStatement(sql4);
             
             pst.setString(1, sil_txt2.getText());
             pst.execute();
             JOptionPane.showMessageDialog(null, "İşlem başarıyla tamamlandı.");
              Update_table();
             
        }
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

              
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nakliyetabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nakliyetabloMouseClicked
  try{ 
            int satir2=nakliyetablo.getSelectedRow(); 
            String table_click2=(tablo.getModel().getValueAt(satir2, 0).toString());
            String sql="Select * from a_nakliyatlar where nakliyat_id='"+table_click2+"' ";
            pst3=conn.prepareStatement(sql);
            re3=(ResultSet) pst3.executeQuery();
            
            if(re3.next()){
                String ekle3=re3.getString("nakliyat_id");
                sil_txt2.setText(ekle3);
               
               
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_nakliyetabloMouseClicked

    private void sil_txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sil_txt2ActionPerformed

    private void musteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_cargoadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> musteri;
    private javax.swing.JTable nakliyetablo;
    private javax.swing.JComboBox<String> nerden;
    private javax.swing.JComboBox<String> nereye;
    private javax.swing.JTextField sil_txt;
    private javax.swing.JTextField sil_txt2;
    private javax.swing.JComboBox<String> sofor;
    private javax.swing.JTable tablo;
    private com.toedter.calendar.JDateChooser tarih;
    // End of variables declaration//GEN-END:variables
}
