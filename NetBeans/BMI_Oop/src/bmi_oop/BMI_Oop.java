/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class BMI_Oop {
   
   
    public static void main(String[] args) {
        Eingabe e = new Eingabe();
        Ausgabe a = new Ausgabe();
        Speichern s = new Speichern();
        Berechnung b = new Berechnung();
        Klassifikation k = new Klassifikation();
        e.eingeben();
        System.out.println(e.name + e.geschlecht + "Gewicht: " + e.gewicht + "Größe: " + e.groesse);
        double BMI = (b.berechne(e.gewicht, e.groesse));
        DecimalFormat df = new DecimalFormat("0");
        //String BMIString = df.format(BMI);
        System.out.println("Hallo: " + df.format(BMI));
        a.ausgeben(e, k);
        s.speichern(e, b, k);
        
    }
    
}
