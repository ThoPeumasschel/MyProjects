/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecopy;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author tjackisch
 */
public class FileCopy 
{
    /**
     * @param args the command line arguments
     */
    
    //throws IOException wird erweitert:
    //Falls jegliche Interaktion ihres Programmes in einem Netzwerk abläuft,
    //für das sie eine Authentifizierung benötigen, dient die "throws IOE"
    //dazu, dass sie eine Fehlerausgabe erhalten mit Urasche des Fehlers,
    //warum ihre Main-Methode blockiert wird
    //Unterschied zu normal lokalen Anwendungen: die Main-Methode funzt immer
    public static void main(String[] args) throws IOException
    {    
        //VERSUCHE:
        //AUSFÜHRUNG DER ANWEISUNG INNERHALB DES TRY{}
        try
        {
            //FÜR KOPIERVORGANG BENÖTIGEN WIR EINE QUELLE UND EIN ZIEL!!!
            //Aufruf eines Objektes aus der Klasse PATH mit Namensgebung(hier: von),
            //um die Quelldatei und deren Dateipfad zu definieren
            //Aufruf eines Objektes aus der Unterklasse PATHS. Aufruf der Methode
            //get ("erhalte") --> Dateipfad als Paramter in () erforderlich          
            Path von = Paths.get("C:\\testdatei.txt");
            
            //Aufruf eines Objektes aus der Klasse PATH mit Namensgebung(hier: zu),
            //um den Zielort und dessen Dateipfad zu definieren
            //Aufruf eines Objektes aus der Unterklasse PATHS. Aufruf der Methode
            //get ("erhalte") --> Dateipfad als Paramter in () erforderlich  
            Path zu = Paths.get("E:\\testdatei.txt");
        
            //FÜR KOPIERVORGANG BENÖTIGEN WIR EINE SAMMLUNG VON KOPIERREGELN!!!
            //Für das Anlegen der Regeln nutzen wir ein Array bzw. eine Liste
            
            //Objekt eines Arrays deklarieren und instanziieren
            CopyOption[] ueberschreibefallsvorhanden = new CopyOption[]
            {
                //Regelung, was passiert, wenn Zielpfad = Quellpfad und
                //Dateiname.Dateiformat identisch sind?
                //Datei wird überschrieben
                StandardCopyOption.REPLACE_EXISTING,
                
                //Regelung, dass alle Attribute/Eigenschaften der Quelldatei und
                //deren Inhalt übernommen werden in die Kopie
                StandardCopyOption.COPY_ATTRIBUTES
            };
            
            //WIR KOPIEREN!!!!
            //Aufruf des Objektes Files aus der Bibliothek File.
            //Aufruf der Methode copy mit der Übergabe der notwendigen Parameter
            //hier: Quellpfad, Zielpfad, Kopierbedingungen
            Files.copy(von, zu, ueberschreibefallsvorhanden);
            
        }       
        //WENN VERSUCH AUS TRY{}SCHEITERT, DANN
        //ABFANGEN von Ausnahmen:
        //z.B. wenn das Programm einen Syntaxfehler hat
        //     oder aufgrund Rechteeinschränkungen die Anwendung 
        //     nicht erfolgreich arbeiten kann
        catch(IOException ausnahmeinfo)
        {
            ausnahmeinfo.printStackTrace();
        }
    }     
}
