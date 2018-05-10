/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreate;

//Importquellen über google suchen!
import java.io.File;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author tjackisch
 */
public class FileCreate 
{    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) 
    {    
        //VERSUCHE:
        //AUSFÜHRUNG DER ANWEISUNG INNERHALB DES TRY{}
        try 
        {   //Klasse File Objektname instanzieren mit folgenden Parametern:
            //Vorgabe des Dateipfades mit Name der Datei und Dateiformat
            
            //Variante 1: statischer Pfad durch Vorgabe im Quellcode
	    File neuedatei = new File("C:\\testdatei.doc");
            
            //Variante 2: dynamischer Pfad durch Eingabe über Eingabebox
            //String dateipfad = JOptionPane.showInputDialog("Geben Sie den Dateipfad ein!");
	    //File neuedatei = new File(dateipfad);
            
            //Erstellen einer Zustandsvariable für den Zustand:
            //"Objekt.ErstelleNeueDatei" ist wahr
            boolean dateiwirdneuerstellt = neuedatei.createNewFile();
            
            //wenn Zustand der bool-Variable = wahr, dann
            //z.B. Datei existiert noch nicht
	    if (dateiwirdneuerstellt)
            {
	        System.out.println("Datei wurde erfolgreich erstellt");
	    }
            //wenn Zustand der bool-Variable = falsch, dann
            //z.B. Datei bereits existiert
	    else
            {
	        System.out.println("Datei existiert bereits");
	    }
    	} 
        //WENN VERSUCH AUS TRY{}SCHEITERT, DANN
        //ABFANGEN von Ausnahmen:
        //z.B. wenn das Programm einen Syntaxfehler hat
        //     oder aufgrund Rechteeinschränkungen die Anwendung 
        //     nicht erfolgreich arbeiten kann
        catch (IOException ausnahmeinfo) 
        {
            System.out.println("Ausnahmefall eingetreten:");
	    ausnahmeinfo.printStackTrace();
	}     
    }   
}
