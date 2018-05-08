/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class Eingabe {
    
    void eingeben() {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein!"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Geben + "
            + "Sie noch eine Zahl ein!"));
        
        
        
    }
    
    Scanner sc = new Scanner(System.in);
}
