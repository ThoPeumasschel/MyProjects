package bmi_oop;


import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Datenbank {
    
    static Connection verbindung = null;
    static Statement befehl = null;
    static ResultSet ausgabe = null;
    
     public static Connection erstelleVerbindung() throws Exception {
        try {

            String treiber = "com.mysql.cj.jdbc.Driver";

            Class.forName(treiber);

            Connection Verbindung = DriverManager.getConnection("jdbc:mysql://localhost/db_BMI?useSSL=false&serverTimezone=UTC", "root", "");

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
            ausgabe = befehl.executeQuery("SELECT * FROM rebels");

            while (ausgabe.next()) {
            System.out.println("\n" + ausgabe.getInt("rebel_ID") + " " + ausgabe.getString("Name")
            + ", " + ausgabe.getString("sex") + " " + ausgabe.getDouble("height") 
                + "cm " + ausgabe.getDouble("weight") + "kg\n   BMI: " + ausgabe.getDouble("bmi") 
                + " = " + ausgabe.getString("classification") + "\n   Datensatz erstellt am " + 
                ausgabe.getString("date_time"));
            }
        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }

    }

    public static void erstelleDatensatz(Eingabe e, double bmi, String classifi) throws Exception {
        LocalDateTime now = LocalDateTime.now();        
        DateTimeFormatter dateform = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");
        try {
            Connection verbindung = erstelleVerbindung();
            PreparedStatement erstelleEintrag = verbindung.prepareStatement("INSERT INTO rebels"
                + "(Name, sex, height, weight, bmi, classification, date_time) "
                + "VALUES('" + e.getName() + "', '" + e.getGeschlecht() + "', '" + e.getGroesse() + "',  "
                + "" + e.getGewicht() + ", " + bmi + ", '" + classifi + "', '" + now.format(dateform) + "' )");
            erstelleEintrag.executeUpdate();

        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }

    }

    public static void aendereDatensatz() throws Exception {

        String eingabe = JOptionPane.showInputDialog("Was möchten Sie ändern?\n\n"
            + "Geben Sie ein:  \n\nname\ngeschlecht\ngroesse\ngewicht\nBMI\nKlassifikation");
        int index = Integer.parseInt(JOptionPane.showInputDialog("Welchen Datensatz möchten Sie ändern?\n"
            + "Geben Sie bitte den Index ein. "));
        try {
            Connection verbindung = erstelleVerbindung();

            switch (eingabe) {
                case "name": {
                    String name_neu = JOptionPane.showInputDialog("Geben Sie den neuen Namen ein");
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set name = "
                        + "('" + name_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                case "geschlecht": {
                    String geschlecht_neu = JOptionPane.showInputDialog("Geben Sie das neue Geschlecht ein");
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set sex = "
                        + "('" + geschlecht_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                case "groesse": {
                    double groesse_neu = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die neue Größe ein"));
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set height = "
                        + "('" + groesse_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                case "gewicht": {
                    double gewicht_neu = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie das neue Gewicht ein"));
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set weight = "
                        + "('" + gewicht_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                case "BMI": {
                    double bmi_neu = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den neuen BMI ein"));
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set bmi = "
                        + "('" + bmi_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                case "Klassifikation": {
                    String klass_neu = JOptionPane.showInputDialog("Geben Sie die neue Klassifikation ein");
                    PreparedStatement aendereEintrag = verbindung.prepareStatement("UPDATE rebels set classification = "
                        + "('" + klass_neu + "') where rebel_id = ('" + index + "')");
                    aendereEintrag.executeUpdate();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Anscheinend haben Sie sich vertippt. \n"
                        + "Zurück zum Menü.");
            }

        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }
    }

    public static void entferneDatensatz() throws Exception {

        //JOptionPane.showMessageDialog(null, "");
        String ID = JOptionPane.showInputDialog("ID löschen: ");
        //String name = JOptionPane.showInputDialog("Name löschen: ");

        try {
            Connection verbindung = erstelleVerbindung();
            PreparedStatement entferneEintrag = verbindung.prepareStatement("DELETE FROM rebels where rebel_ID = ('" + ID + "')");
            entferneEintrag.executeUpdate();
            System.out.println("Datensatz wurde entfernt!");

        } catch (Exception abbruch) {
            System.out.println(abbruch.getMessage());
        }
    }
    
    
    
}
