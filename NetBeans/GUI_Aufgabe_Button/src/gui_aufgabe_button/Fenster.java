package gui_aufgabe_button;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Fenster extends JPanel implements ActionListener {

    private JButton btn;
    private JTextArea txtarea1;
    private JTextArea txtarea2;

    public Fenster() {

        setLayout(new GridLayout(3, 0, 5, 5));

        btn = new JButton("Daten aus ttextArea1 lesen und ausgeben");
        btn.setBackground(Color.red);
        txtarea1 = new JTextArea();
        txtarea2 = new JTextArea();
        txtarea2.setBackground(Color.red);

        add(txtarea1);
        add(txtarea2);
        add(btn);

        try {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    txtarea2.setText(txtarea1.getText());
                    txtarea2.setBackground(Color.white);
                    btn.setText("Daten wurden aus TextArea1 ausgelesen und in TextArea2 ausgegeben");
                    btn.setBackground(Color.green);

                    txtarea1.setText("");
                    txtarea1.setBackground(Color.red);
                }
            });
            //btn.addActionListener(this);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //txtarea2.setText(txtarea1.getText());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
