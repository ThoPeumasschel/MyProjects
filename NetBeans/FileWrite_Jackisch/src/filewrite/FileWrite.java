/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

/**
*
* @author tjackisch
*/
public class FileWrite 
{   /**
    * @param args the command line arguments
    */
    public static void main(String[] args) 
    {     
        //VERSUCHE:
        //AUSFÜHRUNG DER ANWEISUNG INNERHALB DES TRY{}
        try
        {
            //Stringvariable zum Hinterlegen des Dateipfades
            String dateiname = "C:\\testdatei.doc";
            
//            Variante 1: Text wird statisch vorgegeben:
//            Stringvariable für den Text, der in die Datei geschrieben werden soll
//             String text = "Datei bekommt neuen Text";
            
//            Variante 2: Text, der in Datei geschrieben wird, soll dynamisch
//                        über Eingabebox vorgegeben werden            
            String text = JOptionPane.showInputDialog("Geben Sie den Text ein, der in die Datei geschrieben werden soll");
            
//            Zugriff auf Klasse FileWriter, Erzeugen eines Objektes dateischreiben
//            Objekt dateischreiben wird auf "null" gesetzt
//            "null"-setzen bewirkt, dass der Streamkanal leer ist und noch nicht
//            genutzt wird --> aber das Zitat Eckardt "Rindviech" ist erstmal da
            FileWriter dateischreiben = null;
         
//            das Objekt dateischreiben(Streamkanal) wird neu instanziert!
//            dateischreiben - Zuweisen des Dateipfades, damit die Verbindung zwischen
//            Programm und Datei aktiv wird und nutzbar ist für Übertragungen
//             ", true" bewirkt, dass die Datei ergänzt wird
//             ohne ", true" wird die Datei komplett überschrieben
//             mit ", false" wird Datei ebenfalls überschrieben 
            dateischreiben = new FileWriter(dateiname, true);
            
//            das Objekt dateischreiben kriegt eine Funktion zugewiesen:
//            was soll jetzt über den Streamkanal gemacht werden
//            dateischreiben - Zuweisen der Methode "write"
//            über den Kanal wird in die Datei geschrieben, was in der Stringvariable
//            text definiert wurde
            dateischreiben.write(text + "\n"); 
            
//            das Objekt dateischreiben kriegt eine Funktion zugewiesen:
//            dateischreiben - Zuweisen der Methode "close"
//            der Streamkanal wird geschlossen, Verbindung zwischen Programm und Datei
//            wird getrennt
            dateischreiben.close();
           
//            Optional: Messagebox mit Ausgabe, was das Programm in die Datei 
//            geschrieben hat
            JOptionPane.showMessageDialog(null, "Folgender Text wurde in Datei geschrieben: " + text);
        }
        catch(IOException ausnahmeinfo)
        {   
            //String abbruch = "der Text konnte nicht erfolgreich in die Datei geschrieben werden";
            ausnahmeinfo.printStackTrace();
        }                   
    }   
}
