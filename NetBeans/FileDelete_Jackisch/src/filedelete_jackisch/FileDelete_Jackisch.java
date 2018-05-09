/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedelete_jackisch;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author tjackisch
 */
public class FileDelete_Jackisch 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            //Datei löschen
            File dateiloeschen  = new File("C:\\testdatei1.txt");
            //Ornder löschen wollen (wenn Ordner leer)
            File ordnerloeschen  = new File("C:\\test_loeschen");
            
            //wenn Datei gelöscht wurde
            if(dateiloeschen.delete())
            {
                System.out.println("Datei wurde gelöscht");
            }
            else
            {
                System.out.println("Datei wurde nicht gelöscht");
            }
            
            //wenn Ordner gelöscht wurde
            if(ordnerloeschen.delete())
            {
                System.out.println("Ordner wurde gelöscht");
            }
            else
            {
                System.out.println("Ordner wurde nicht gelöscht");
            }
        }
        catch(Exception ausnahmeinfo)
        {
            ausnahmeinfo.printStackTrace();
        }
    }
    
}
