package bmi_oop;

import java.awt.HeadlessException;
import java.io.*;
import java.text.DecimalFormat;
import java.time.*;
import java.time.format.*;

public class Speichern {

    void speichern(Eingabe e, double BMI, String k) {
        DecimalFormat df = new DecimalFormat("0");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateform;
        dateform = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");

        try {
            // Datei wird erstellt oder vorhandene Datei zum schreiben geöffnet. 
            File f = new File("BMI-Daten.txt");
            // In einem neuen try-catch-block wird eine Instanz der FileWriter-Klasse
            // gebildet, mit der sichergestellt wird, dass die neuen Daten angehängt werden. 
            try (FileWriter w = new FileWriter(f, true)) {
                w.write("BMI Ergebnis für " + e.name + "\r\nGeschlecht: " + e.geschlecht
                    + "\r\nGröße: " + e.groesse + "cm\r\nGewicht: " + e.gewicht
                    + "Kg\r\nBMI = " + df.format(BMI) + " bedeutet " + k + "\r\n"
                    + "Zeit + Datum: " + now.format(dateform) + "\r\n     ---------------     \r\n");
                w.close();
            }

        } catch (@SuppressWarnings("LocalVariableHidesMemberVariable") HeadlessException | IOException I) {

        }

    }

}
