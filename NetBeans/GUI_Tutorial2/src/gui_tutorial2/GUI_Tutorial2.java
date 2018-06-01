
package gui_tutorial2;

import java.awt.*;
import javax.swing.*;

public class GUI_Tutorial2 {

    
    public static void main(String[] args) {

        JFrame grundgeruest = new JFrame("TPDevelop");
        grundgeruest.setSize(500, 350);
        grundgeruest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //grundgeruest.setLayout(null);

        JButton button1 = new JButton("Klick den Imperator");
        button1.setBounds(10, 10, 150, 50);
        button1.setVisible(true);

        JButton button2 = new JButton("Klick den Padawn!");
        button2.setBounds(10, 70, 250, 50);
        button2.setVisible(true);

        JTextField textfield1 = new JTextField();
        textfield1.setBounds(10, 130, 100, 50);
        textfield1.setBackground(Color.blue);
        textfield1.setVisible(true);

        JPasswordField passwd1 = new JPasswordField();
        passwd1.setBounds(10, 190, 100, 50);
        passwd1.setVisible(true);

        JLabel lbl1 = new JLabel("button1 Label");
        lbl1.setBounds(0, 10, 150, 50);
        lbl1.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setSize(200, 100);
        //panel1.setPreferredSize(new Dimension(100, 100));
        panel1.setBackground(Color.red);
        panel1.setVisible(true);

        JPanel panel2 = new JPanel();
        panel2.setSize(50, 50);
        panel2.setBackground(Color.green);
        panel2.setVisible(true);

        /* grundgeruest.add(button1);
        grundgeruest.add(button2);
        grundgeruest.add(textfield1);
        grundgeruest.add(passwd1);
        grundgeruest.add(lbl1);*/
        
        grundgeruest.add(panel1);
        grundgeruest.add(panel2);
        panel1.add(lbl1);
        panel2.add(button1);

            
        
        grundgeruest.setVisible(true);
        //grundgeruest.repaint();

    }

}
