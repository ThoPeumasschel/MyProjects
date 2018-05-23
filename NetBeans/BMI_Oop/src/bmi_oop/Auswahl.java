/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class Auswahl {

    private double BMI = 0;
    private String klass = null;

    void auswahlStart() throws Exception {

        // Es werden Instanzen der Klassen erzeugt
        Eingabe e = new Eingabe(); // Der User gibt Name, Geschlecht, Größe und Gewicht ein. 
        Ausgabe a = new Ausgabe(); // MessageBox mit Eingaben, Berechnung und Klassifikation
        Speichern s = new Speichern(); // Daten werden mit Zeit und Datum gespeichert. 
        Berechnung b = new Berechnung();
        Klassifikation k = new Klassifikation();
        Datenbank d = new Datenbank();

        boolean laeuft = true;
        while (laeuft) {
            int auswahl = Integer.parseInt(JOptionPane.showInputDialog("Datensatz eingeben:"
                + "   1\nErgebnis anzeigen:   2\nErgebnis in Datei speichern:"
                + "   3\nErgebnis in Datenbank speichern:   4\nDatenbank anzeigen:   5\n"
                + "Datensatz an Index löschen:   6\nDatensatz ändern:   7\nProgramm beenden:   0"));

            switch (auswahl) {
                case 1: {
                    e.eingeben();
                    BMI = (b.berechne(e.getGewicht(), e.getGroesse()));
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
                    d.erstelleDatensatz(e, BMI, klass);
                    System.out.println("Datensatz wurde erstellt!");
                    break;

                }
                case 5: {
                    d.zeigeDatensatz();
                    break;
                }
                case 6: {
                    d.entferneDatensatz();

                    break;
                }
                case 7: {
                    d.aendereDatensatz();
                    System.out.println("Datensatz wurde geändert!");
                    break;
                }
                case 0: {
                    laeuft = false;
                    System.out.println("Das Programm wurde erfolgreich beendet!");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Sie müssen hier eine Zahl von 1 bis 8 eingeben!");

            }
        }
    }

    public double getBMI() {
        return BMI;
    }

    public String getKlass() {
        return klass;
    }
}
