/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class Speichern {

    void speichern(Eingabe e, Berechnung b, Klassifikation k) {

        try {
            // Datei wird erstellt oder vorhandene Datei zum schreiben geöffnet. 
            File f = new File("BMI-Daten.txt");
            //File g = new File("BMI-Daten.txt");
            // Damit die Daten zugeordnet werden können, wird hier noch der Name abgefragt. 

            // In einem neuen try-catch-block wird eine Instanz der FileWriter-Klasse
            // gebildet, mit der sichergestellt wird, dass die neuen Daten angehängt werden. 
            try (FileWriter w = new FileWriter(f, true)) {
                w.write("BMI Ergebnis für " + e.name + "\r\nGeschlecht: " + e.geschlecht + "\r\nGröße: " + e.groesse
                    + "cm, \r\nGewicht: " + e.gewicht + "Kg, \r\nBMI = " + (b.berechne(e.gewicht, e.groesse)) + " bedeutet " + k.klassifikation + "\r\n");
            }

        } catch (@SuppressWarnings("LocalVariableHidesMemberVariable") HeadlessException | IOException I) {
        }

    }
}
