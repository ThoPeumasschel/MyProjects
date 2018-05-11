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
        DecimalFormat df = new DecimalFormat("0");
        
        Eingabe e = new Eingabe();
        Ausgabe a = new Ausgabe();
        Speichern s = new Speichern();
        Berechnung b = new Berechnung();
        Klassifikation k = new Klassifikation();
        
        e.eingeben();
        //System.out.println(e.name + ", " + e.geschlecht + " Gewicht: " + e.gewicht + "Größe: " + e.groesse);
        double BMI = (b.berechne(e.gewicht, e.groesse));
        
        //System.out.println("BMI: " + df.format(BMI));
        String klass = k.klassifizieren(e, BMI);
        //System.out.println("Klassifizierung: " + klass);
        a.ausgeben(e, klass);
        s.speichern(e, BMI, klass);
        
    }
    
}
