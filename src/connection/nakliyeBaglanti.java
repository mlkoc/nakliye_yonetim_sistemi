/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Furkan
 */
public class nakliyeBaglanti {
    public static Connection ConnectDb(){
        
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        
        /*
        String driver = "com.mysql.cj.jdbc.Driver";
        String dbName = "kurs_otomasyon";
        
        
        public Connection conn = null;
    public Statement st = null;
    public ResultSet rs = null;

    public DB() {
        baglan();
    }

    public DB(String dbName) {
        if (kontrol()) {
        this.dbName = dbName;
        baglan();
        }else {
            JOptionPane.showMessageDialog(null, "Lütfen Bağlantınızı Kontrol Ediniz");
        }
    }

    public void baglan() {
        try {
            if (kontrol()) {
                // bağlantı nesnesi kontrol ediliyor
                Class.forName(driver);
                
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kurs_otomasyon?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "42mlk61");
                st = conn.createStatement();
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen Bağlantınızı Kontrol Ediniz");
                System.exit(0);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Bağlantı Hatası : " + e);
        }
    }
        
        
        
        */
        
        try{ 
           Class.forName(/*"com.mysql.jdbc.Driver"*/"com.mysql.cj.jdbc.Driver");
           //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nakliyee", "root", "123456");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/koc_nakliyat?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "xxx"); //acilis_sifresi
         }
         
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
         }
         
         return conn;
    }
}
