package dateiarbeit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

    public static void main(String[] args) {
        textDateiSchreiben();
        
    }
    public static void textDateiSchreiben() {
        try {
            FileWriter fw = new FileWriter("datei.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Java is easy");
            
            
            
            bw.close();
            
            
            
            
        } catch (IOException ex) {
            System.out.println("Datei konnte nicht geschrieben werden.");
            ex.printStackTrace();
        }
    }
}
