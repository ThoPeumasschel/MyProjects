package gui_tutorial;

import java.awt.Dimension;
import javax.swing.*;

public class Program {

    public static void main(String[] args) {

        JFrame grundgeruest = new JFrame("Das Fenster zur Welt");
        grundgeruest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grundgeruest.setSize(600, 400);
        grundgeruest.setLayout(null);
        grundgeruest.setVisible(true);


        JButton button1 = new JButton("Klick mich!");
        button1.setSize(150, 50);
        button1.setLocation(10, 10);
        //button1.setPreferredSize(new Dimension(150, 50));
        //button1.setBounds(10, 10, 150, 50);
        button1.setVisible(true);
        
        JButton button2 = new JButton("Klick mich endlich!!");
        //button2.setSize(150, 50);
        //button2.setLocation(165, 10);
        button2.setBounds(10, 70, 250, 50);
        button2.setVisible(true);
        
        grundgeruest.add(button1);
        grundgeruest.add(button2);
        button1.setVisible(true);
        
        
        
    }
    
}
