package gui_tutorial_events;

import java.awt.event.*;
import javax.swing.*;

public class GUI_Tutorial_Events implements ActionListener {

    public void actionPerformed(ActionEvent ae) {
        System.out.println("Geklickt: " + ae.getActionCommand());
    }

    public static void main(String[] args) {

        JFrame jf = new JFrame("BeispielActionListener");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(200, 300);
        // Beschriftung des JButton ist gleichzeitig ActionCommand
        JButton btn = new JButton("Klick mich");
        GUI_Tutorial_Events bal = new GUI_Tutorial_Events();
        System.out.println(bal);
        btn.addActionListener(bal);
        jf.add(btn);
        jf.pack();
        jf.setVisible(true);
        jf.repaint();
        

    }

}
