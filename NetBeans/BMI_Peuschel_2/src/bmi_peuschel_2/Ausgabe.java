package bmi_peuschel_2;

import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;

public class Ausgabe {
    

    void speichern(String BMI) {
        
        try {
            // Datei wird erstellt oder vorhandene Datei zum schreiben geöffnet. 
            File f = new File("BMI-Daten.doc");
            //File g = new File("BMI-Daten.txt");
            // Damit die Daten zugeordnet werden können, wird hier noch der Name abgefragt. 
            String name = JOptionPane.showInputDialog("Bitte geben Sie noch Ihren "
                    + "Vornamen ein.");
            // Für die Statistik noch das Alter...
            String alter = JOptionPane.showInputDialog("Und jetzt noch Ihr Alter. "
                    + "\n(Nur für die Statistik, keine Sorge!)");
            // In einem neuen try-catch-block wird eine Instanz der FileWriter-Klasse
            // gebildet, mit der sichergestellt wird, dass die neuen Daten angehängt werden. 
            try (FileWriter w = new FileWriter(f, true)) {
                w.write("Name: " + name + "\nGeschlecht: " + Eingabe.sex + "\nAlter: " + 
                    alter + "\nBMI = " + BMI + "\n");
            }
            /*try (FileWriter v = new FileWriter(g, true)) {
                v.write("Name: " + name + "\nGeschlecht: " + geschlecht + "\nAlter: " + alter + "\nBMI = " + BMI + "\n");
            }*/

        } catch (@SuppressWarnings("LocalVariableHidesMemberVariable") HeadlessException | IOException e) {
        }
        // Schlussbotschaft
        JOptionPane.showMessageDialog(null, "Vielen Dank!\nIhre Daten werden von uns "
                + "vertraulich behandelt. \nSelbstverständlich steht für uns der "
                + "Datenschutz an oberster Stelle!");
        
    }
}
