package bmi_oop;

import java.awt.HeadlessException;
import java.io.*;

public class Speichern extends Output {

    void speichern(Eingabe e, double BMI, String k) {
        
        try {
            // Datei wird erstellt oder vorhandene Datei zum schreiben geöffnet. 
            File f = new File("BMI-Daten.txt");
            // In einem neuen try-catch-block wird eine Instanz der FileWriter-Klasse
            // gebildet, mit der sichergestellt wird, dass die neuen Daten angehängt werden. 
            try (FileWriter w = new FileWriter(f, true)) {
                w.write("BMI Ergebnis für " + e.getName() + "\r\nGeschlecht: " + e.getGeschlecht()
                    + "\r\nGröße: " + e.getGroesse() + "cm\r\nGewicht: " + e.getGewicht()
                    + "Kg\r\nBMI = " + df.format(BMI) + " bedeutet " + k + "\r\n"
                    + "Zeit + Datum: " + now.format(dateform) + 
                        "\r\n     ---------------     \r\n");
                w.close();
            }

        } catch (@SuppressWarnings("LocalVariableHidesMemberVariable") 
                HeadlessException | IOException I) {

        }
        System.out.println("Die Daten wurden in der Datei BMI-Daten.txt gespeichert.");
    }

}
