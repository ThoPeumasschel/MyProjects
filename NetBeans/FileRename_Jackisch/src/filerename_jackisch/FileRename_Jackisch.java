/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filerename_jackisch;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author tjackisch
 */
public class FileRename_Jackisch 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try       
        {         
            File dateialtername  = new File("C:\\testdatei.txt");           
            File dateineuername  = new File("C:\\testdatei1.txt");
                                  
            if(dateialtername.renameTo(dateineuername))
            {
                System.out.println("Datei wurde umbenannt");
            }
            else
            {
                System.out.println("Datei wurde nicht umbenannt");
            }
        }
        catch(Exception ausnahmeinfo)
        {
            ausnahmeinfo.printStackTrace();
        }       
    }   
}
