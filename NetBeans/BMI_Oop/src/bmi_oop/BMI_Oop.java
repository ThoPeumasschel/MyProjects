package bmi_oop;

import java.text.DecimalFormat;


public class BMI_Oop {
   
   
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");
        // Es werden Instanzen der Klassen erzeugt
        Eingabe e = new Eingabe(); // Der User gibt Name, Geschlecht, Größe und Gewicht ein. 
        Ausgabe a = new Ausgabe(); // MessageBox mit Eingaben, Berechnung und Klassifikation
        Speichern s = new Speichern(); // Daten werden mit Zeit und Datum gespeichert. 
        Berechnung b = new Berechnung();
        Klassifikation k = new Klassifikation();
        // Von Objekt 'e' wird die Methode 'eingeben()' aufgerufen
        e.eingeben();
        // Der BMI wird durch den Aufruf der Methode 'berechne()' der Instanz b 
        // aus den in 'e' gespeicherten Werten errechnet und in 'BMI' gespeichert
        double BMI = (b.berechne(e.gewicht, e.groesse));
        // System.out.println("BMI für Männer: " + BMI);
        
        // System.out.println("BMI für Frauen: " + BMI);
        // Von Objekt 'k' wird die Methode 'klassifizieren()' mit den Parametern 
        // 'e' und 'BMI' aufgerufen. Aus den Angaben Geschlecht und BMI wird nach der
        //Tabelle klassifiziert und das Ergebnis hier in 'klass' gespeichert. 
        String klass = k.klassifizieren(e, BMI);
        // Die Benutzereingaben werden zusammen mit BMI und Klassifikation durch 
        // den Aufruf der Methode 'ausgeben()' von 'a' mit den Argumenten 'e' 
        // und 'klass' ausgegeben. 
        a.ausgeben(e, klass, BMI);
        // Die Eingaben werden mit den Ergebnissen und der aktuellen Zeit in einer 
        // Datei gespeichert. Man beachte, dass einigen Funktionen Instanzen von 
        // anderen Klassen als Argumente übergeben werden. 
        s.speichern(e, BMI, klass);
        
    }
    
}
