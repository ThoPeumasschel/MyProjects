/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tjackisch
 */
public class FileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Stringvariable zum Hinterlegen des Dateipfades
        String dateiname = "C:\\testdatei.doc";

        //Erstellen eines Objektes vom Typ BufferedReader mit Namen lesepuffer
        //das Objekt dient als Zwischenspeicher für die Daten, die später
        //eingelesen und verarbeitet werden sollen (hier noch keine Daten im Puffer)
        BufferedReader lesepuffer = null;

//      Zugriff auf Klasse Filereader, Erzeugen eines Objektes dateilesen
//      Objekt dateilesen wird auf "null" gesetzt
//      "null"-setzen bewirkt, dass der Streamkanal leer ist und noch nicht
//      genutzt wird --> aber das Zitat Eckardt "Rindviech" ist erstmal da
        FileReader dateilesen = null;

        //VERSUCHE:
        //AUSFÜHRUNG DER ANWEISUNG INNERHALB DES TRY{}
        try {
//          das Objekt dateilesen(Streamkanal) wird neu instanziert!
//          dateilesen - Zuweisen des Dateipfades, damit die Verbindung zwischen
//          Datei und Programm aktiv wird und nutzbar ist für Übertragungen
            dateilesen = new FileReader(dateiname);

//          das Objekt lesepuffer(Streamkanal) wird neu instanziert!
//          lesepuffer - Zuweisen des Streamkanals, damit der Lesepuffer 
//          über den Kanal Daten aus der Datei empfangen und sammeln kann
            lesepuffer = new BufferedReader(dateilesen);

//          START EINLESEPROZESS:
//          Damit der Lesepuffer die Daten aufnehmen kann, braucht er eine
//          Speichervariable. Da der Puffer nicht weiss, welche Zeichen er bekommt,
//          definieren wir die Variable vom Typ String
            String inhaltaktuellezeile;

            //Der Lesepuffer erfasst zuerst die Struktur des Textes:
            //Text in einer Zeile?
            //Text auf mehrere Zeilen verteilt?
            //Der Lesepuffer liest durch die Funktion readLine() ein, ob in der
            //ersten auffindbaren Zeile eine Aktion stattgefunden hat
            //Aktion: Eingabe von Zeichen(egal, ob Buchstabe, Ziffer oder Symbol)
            //        aber auch Tastenanschläge (z.B. Leerzeichen, Tab, Enter)
            //solange also eine Aktion stattfindet, lies die Zeile und deren Inhalt ein
            //übergib die Zeile und den Inhalt an die Speichervariable des Lesepuffers
            while ((inhaltaktuellezeile = lesepuffer.readLine()) != null) {
                //solange while-Bedingung erfüllt, wird in Konsole eine Ausgabe erzeugt:
                //Inhalt der Speichervariable des Lesepuffers wird angezeigt
                System.out.println(inhaltaktuellezeile);
            }

//          das Objekt dateilesen kriegt eine Funktion zugewiesen:
//          dateilesen - Zuweisen der Methode "close"
//          der Streamkanal wird geschlossen, Verbindung zwischen Programm und Datei
//          wird getrennt
            dateilesen.close();
        } //WENN VERSUCH AUS TRY{}SCHEITERT, DANN
        //ABFANGEN von Ausnahmen:
        //z.B. wenn das Programm einen Syntaxfehler hat
        //     oder aufgrund Rechteeinschränkungen die Anwendung 
        //     nicht erfolgreich arbeiten kann
        catch (IOException ausnahmeinfo) {
            ausnahmeinfo.printStackTrace();
        }
    }
}
