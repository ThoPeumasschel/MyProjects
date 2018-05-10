package kreisrechner;

import javax.swing.*;
import java.io.*;

// Hier befindet sich die Hauptklasse mit der Main Funktion
public class Kreisrechner {

    public static void main(String... Fertig) {
        try {
            double radius = Double.parseDouble(JOptionPane.showInputDialog("Geben "
                + "Sie den Radius in cm ein: "));
            String umfang = String.format("%.2f", (2 * radius * Math.PI));
            String flaeche = String.format("%.2f", (Math.pow(radius, 2) * Math.PI));

            JOptionPane.showMessageDialog(null, "Kreisumfang: " + umfang + "cm"
                + "\r\nKreisfläche: " + flaeche + "cm²");

            File file = new File("Kreisergebnis.txt");
            
            /*boolean neu = file.createNewFile();
            if (neu) {
                System.out.println("Datei erfolgreich erstellt!");
            } else {
                System.out.println("Datei existiert bereits!");*/

            FileWriter writeFile = new FileWriter(file, true);
            writeFile.write("Folgender Radius war gegeben: \t"
                + String.format("%.2f", radius)
                + "cm" + "\r\n\n\t\tKreisumfang: \t" + umfang + "cm\r\n"
                + "\t\tKreisfläche: \t" + flaeche + "cm²\r\n\r\n");
            writeFile.close();
            JOptionPane.showMessageDialog(null, "Ergebnisse wurden "
                + "in Datei " + file + " geschrieben. ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bitte nur Zahlen eingeben!");
        }
    }
}