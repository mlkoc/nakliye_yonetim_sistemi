
package musteri;
import ana_menu.u_index;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static connection.nakliyeBaglanti.ConnectDb;
import static musteri.u_cargoadd.convertUtilDateToSqlDate;
import static giris_ekrani.musteriLogin.musteri;
import net.proteanit.sql.DbUtils;

public class u_odemebildir extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pst=null;
    
 ResultSet re1=null;
    PreparedStatement pst1=null;
    
    public u_odemebildir() {
        initComponents();
         conn=ConnectDb();
         kombodoldur();
    Update_table();
    }
 public void Update_table(){
        try{
            String sql="Select uodeme_ad,uodeme_tutar,uodeme_tarih,uodeme_islemno from u_odeme where musteri_id ="+musteri;
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
            String sql="Select * from bankalar";
            pst=conn.prepareStatement(sql);
            
            re=(ResultSet) pst.executeQuery();
            
            while(re.next()){
              String id=re.getString("banka_id");
                String ad=re.getString("banka_adi");
                String sube=re.getString("banka_sube");
                String hesapno1=re.getString("banka_hesapno");
                String iban=re.getString("banka_iban");
                 banka.addItem(ad);
                  subekod.setText(sube);
                 hesapno.setText(hesapno1);
                 ibanno.setText(iban);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void veriduzelt(){
        try{
            String sql2="Select * from bankalar where banka_adi='"+banka.getSelectedItem()+"'";
            pst1=conn.prepareStatement(sql2);
            
            re1=(ResultSet) pst1.executeQuery();
            
            while(re1.next()){
               
                String sube=re1.getString("banka_sube");
                String hesapno1=re1.getString("banka_hesapno");
                String iban=re1.getString("banka_iban");
               
                 subekod.setText(sube);
                 hesapno.setText(hesapno1);
                 ibanno.setText(iban);
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
        tablo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gonderici = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tarih = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        islemno = new javax.swing.JTextField();
        tutar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        banka = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        hesapno = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        subekod = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ibanno = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ödeme Bildirim");
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ÖDEME BİLDİRİM VE ÖDEME GEÇMİŞİ");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 449, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 469, -1));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        tablo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Ödemeyi Yapan Ad", "Ödemeyi Yapan Soyad", "Ödeme Tarihi", "Ödeme Yapılan Miktar", "Ödeme Yapılan Banka", "İşlem Numarası"
            }
        ));
        tablo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Önceki Ödemeler", new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/16/Rank History.png")), jPanel1); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Ödemeyi Gönderen Ad:");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 26, -1, -1));
        jPanel4.add(gonderici, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 19, 233, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Ödeme Tarihi:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 67, -1, -1));

        tarih.setDateFormatString("yyyy-MM.dd");
        jPanel4.add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 67, 233, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("İşlem No:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 209, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Ödenen Tutar:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 115, -1, -1));
        jPanel4.add(islemno, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 202, 234, 30));
        jPanel4.add(tutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 108, 234, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Ödenen Banka:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 163, -1, -1));

        banka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankaActionPerformed(evt);
            }
        });
        jPanel4.add(banka, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 156, 234, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/24/cash.png"))); // NOI18N
        jButton5.setText("ÖDEME BİLDİR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 333, 180, 40));

        hesapno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hesapno.setText("Banka Seçimiyle Görünecektir");
        jPanel4.add(hesapno, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 280, 197, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Hesap No:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Şube Kodu:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 243, 79, -1));

        subekod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subekod.setText("Banka Seçimiyle Görünecektir");
        jPanel4.add(subekod, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 243, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("IBAN No:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 312, -1, -1));

        ibanno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ibanno.setText("Banka Seçimiyle Görünecektir");
        jPanel4.add(ibanno, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 312, 240, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTabbedPane1.addTab("Ödeme Bildirimi Yap", new javax.swing.ImageIcon(getClass().getResource("/nakliye/iconpack/16/cash.png")), jPanel3); // NOI18N

        jTabbedPane1.setSelectedComponent(jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Ödeme Bildirimi Yap");

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 529, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        u_index geri = new u_index();
        this.setVisible(false);
        geri.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

          try{ 
             String sql="Insert into u_odeme (musteri_id, uodeme_ad,uodeme_tarih,uodeme_tutar,uodeme_banka,uodeme_islemno) Values(?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             pst.setString(1,Integer.toString(musteri));
             pst.setString(2, gonderici.getText());
             pst.setDate(3,convertUtilDateToSqlDate(tarih.getDate()));
             pst.setString(4,tutar.getText());
             pst.setString(5,Integer.toString(banka.getSelectedIndex()));
             pst.setString(6, islemno.getText());
             pst.execute();
            JOptionPane.showMessageDialog(null, "Ödeme bildiriminiz başarıyla kaydedilmiştir.");
            Update_table();
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bankaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankaActionPerformed
veriduzelt();
// TODO add your handling code here:
    }//GEN-LAST:event_bankaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u_odemebildir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> banka;
    private javax.swing.JTextField gonderici;
    private javax.swing.JLabel hesapno;
    private javax.swing.JLabel ibanno;
    private javax.swing.JTextField islemno;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel subekod;
    private javax.swing.JTable tablo;
    private com.toedter.calendar.JDateChooser tarih;
    private javax.swing.JTextField tutar;
    // End of variables declaration//GEN-END:variables
}
