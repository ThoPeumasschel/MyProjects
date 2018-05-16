package tutorialdb;

import java.sql.*;
import javax.swing.JOptionPane;

public class TutorialDB {

    static Connection verbindung = null;
    static Statement befehl = null;
    static ResultSet ausgabe = null;

    public static void main(String[] args) throws Exception {

        //erstelleVerbindung();
        //erstelleDatensatz();
        zeigeDatensatz();
        aendereDatensatz();
        zeigeDatensatz();
    }

    public static Connection erstelleVerbindung() throws Exception {
        try {

            String treiber = "com.mysql.cj.jdbc.Driver";

            Class.forName(treiber);

            Connection Verbindung = DriverManager.getConnection("jdbc:mysql://localhost/db_imperium?useSSL=false&serverTimezone=UTC", "root", "");

            System.out.println("Verbindung erstellt");

            return Verbindung;
        } catch (Exception abbruch) {
            abbruch.printStackTrace();
        }
        return null;
    }

    public static void zeigeDatensatz() throws Exception {
        try {
            //Connection hallo = new Connection();
            //hallo.erstelleVerbinung();
            Connection verbindung = erstelleVerbindung();
            befehl = verbindung.createStatement();
            ausgabe = befehl.executeQuery("SELECT * FROM imperiummitglied");

            while (ausgabe.next()) {
                System.out.println("\n" + ausgabe.getInt("MitgliedID") + " " + ausgabe.getString("Name"));
            }
        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }

    }

    public static void erstelleDatensatz() throws Exception {

        final String name = JOptionPane.showInputDialog("Geben Sie eine Namen ein");

        try {
            Connection verbindung = erstelleVerbindung();
            PreparedStatement erstelleEintrag = verbindung.prepareStatement
            ("INSERT INTO imperiummitglied(Name) VALUE('" + name + "')");
            erstelleEintrag.executeUpdate();

        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }

    }

    public static void aendereDatensatz() throws Exception {

        String name_alt = JOptionPane.showInputDialog("Zu ändernden Namen eingeben");
        String name_neu = JOptionPane.showInputDialog("Geben Sie den neuen Namen ein");

        try {
            Connection verbindung = erstelleVerbindung();
            PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE "
                + "imperiummitglied set name = ('" + name_neu + "') where name = ('" + name_alt + "')");
                         
            aendereEintrag.executeUpdate();

        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }
    }
}
