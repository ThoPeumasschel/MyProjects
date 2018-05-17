package bmi_oop;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class BMI_Oop {

    static Connection verbindung = null;
    static Statement befehl = null;
    static ResultSet ausgabe = null;

    public static void main(String[] args) throws Exception {

        double BMI = 0;
        String klass = null;
        // Es werden Instanzen der Klassen erzeugt
        Eingabe e = new Eingabe(); // Der User gibt Name, Geschlecht, Größe und Gewicht ein. 
        Ausgabe a = new Ausgabe(); // MessageBox mit Eingaben, Berechnung und Klassifikation
        Speichern s = new Speichern(); // Daten werden mit Zeit und Datum gespeichert. 
        Berechnung b = new Berechnung();
        Klassifikation k = new Klassifikation();

        boolean run = true;
        while (run) {
            int auswahl = Integer.parseInt(JOptionPane.showInputDialog("Datensatz eingeben:"
                + "   1\nErgebnis anzeigen:   2\nErgebnis in Datei speichern:"
                + "   3\nErgebnis in Datenbank speichern:   4\nDatenbank anzeigen:   5\n"
                + "Datensatz an Index löschen:   6\nDatensatz ändern:   7\nProgramm beenden:   0"));

            switch (auswahl) {
                case 1: {
                    e.eingeben();
                    BMI = (b.berechne(e.gewicht, e.groesse));
                    klass = k.klassifizieren(e, BMI);
                    break;
                }
                case 2: {
                    a.ausgeben(e, klass, BMI);
                    break;
                }
                case 3: {
                    s.speichern(e, BMI, klass);
                    break;
                }
                case 4: {
                    erstelleDatensatz(e, BMI, klass);
                    System.out.println("Datensatz wurde erstellt!");
                    break;

                }
                case 5: {
                    zeigeDatensatz();
                    break;
                }
                case 6: {
                    entferneDatensatz();
                    
                    break;
                }
                case 7: {
                    aendereDatensatz();
                    System.out.println("Datensatz wurde geändert!");
                    break;
                }
                case 0: {
                    run = false;
                    System.out.println("Das Programm wurde erfolgreich beendet!");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Sie müssen hier eine Zahl von 1 bis 8 eingeben!");

            }
        }

        // Der BMI wird durch den Aufruf der Methode 'berechne()' der Instanz b 
        // aus den in 'e' gespeicherten Werten errechnet und in 'BMI' gespeichert
        // Von Objekt 'k' wird die Methode 'klassifizieren()' mit den Parametern 
        // 'e' und 'BMI' aufgerufen. Aus den Angaben Geschlecht und BMI wird nach der
        // Tabelle klassifiziert und das Ergebnis hier in 'klass' gespeichert. 
        // Die Benutzereingaben werden zusammen mit BMI und Klassifikation durch 
        // den Aufruf der Methode 'ausgeben()' von 'a' mit den Argumenten 'e' 
        // und 'klass' ausgegeben. 
        // Die Eingaben werden mit den Ergebnissen und der aktuellen Zeit in einer 
        // Datei gespeichert. Man beachte, dass einigen Funktionen Instanzen von 
        // anderen Klassen als Argumente übergeben werden. 
        //erstelleVerbindung();
        //aendereDatensatz();
        //zeigeDatensatz();
        //
        //zeigeDatensatz();
    }

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
                + "VALUES('" + e.name + "', '" + e.geschlecht + "', '" + e.groesse + "',  "
                + "" + e.gewicht + ", " + bmi + ", '" + classifi + "', '" + now.format(dateform) + "' )");
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
