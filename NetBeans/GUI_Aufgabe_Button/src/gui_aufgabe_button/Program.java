package gui_aufgabe_button;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Program {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Fenster für Eingabe und Ausgabe");
        jf.setLocation(0, 0);
        jf.setSize(500, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jf.add(new Fenster());
        jf.setVisible(true);
    }

}
