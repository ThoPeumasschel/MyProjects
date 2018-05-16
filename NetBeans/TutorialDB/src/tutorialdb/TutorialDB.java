package tutorialdb;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;


public class TutorialDB {

    static Connection verbindung = null;
    static Statement befehl = null;
    static ResultSet ausgabe = null;
    
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static Connection erstelleVerbindung() throws Exception {
        try {
            
            String treiber = "com.mysql.cj.jdbc.Driver";
            
            Class.forName(treiber);
            
            Connection Verbindung = DriverManager.getConnection("jdbc:mysql://localhost/db_imperium?useSSL=false&serverTimezone=UTC", "root", "");
            
            System.out.println("Verbindung erstellt");
            
            return verbindung;
        }
            catch (Exception abbruch) {
                abbruch.printStackTrace();
            }
        return null;
    }
}
