package taschenrechner;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Taschenrechner {

    public static void main(String... pustekuchen) {
        operationen o = new operationen();
        /*    System.out.println(o.addieren(5, 7));
        System.out.println(o.subtrahieren(19, 7));
        System.out.println(o.multiplizieren(3, 4));
        System.out.println(o.dividieren(48, 4));
        System.out.println(o.potenzieren(3, 3));
        System.out.println(o.radizieren(2));
         */
        String auswahl = JOptionPane.showInputDialog("Auswahl: + , -, *, /, 'pot', 'rad'");
        double x = Double.parseDouble(JOptionPane.showInputDialog("Geben "
            + "Sie eine Zahl ein!"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Geben "
            + "Sie noch eine Zahl ein!"));
        switch (auswahl){
            
            case "+" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.addieren(x, y));
                break;
            case "-" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.subtrahieren(x, y));
                break;    
            case "*" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.multiplizieren(x, y));
                break;
            case "/" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.dividieren(x, y));
                break;
            case "pot" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.potenzieren(x, y));
                break;
            case "rad" :
                JOptionPane.showMessageDialog(null, "Ergebnis: " + o.radizieren(x, y));
                break;    
        }
            
        
        
     
        
        
        
      /*  Eingabe e = new Eingabe();
        e.eingeben();*/

    }

}
