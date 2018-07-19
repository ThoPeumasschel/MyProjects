package visual;

import java.awt.*;
import javax.swing.*;

public class Gui1 {

	public static void main(String[] args) {
		
		
//	Grundger�st erzeugen:		
		JFrame grundgeruest = new JFrame("Test: Rahmen");
		grundgeruest.setLocationRelativeTo(null);
		grundgeruest.setLayout(null);									// setzt das Layout auf Reset (sonst Z.B. f�llt Button den Rahmen aus
		grundgeruest.setSize(500,250);									// Breite und H�he
		grundgeruest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Programm komplett schlie�en (GUI UND! Anwendung)
		grundgeruest.setVisible(true);									// Rahmen sichtbar (ja/nein)
		

		
		
//	Button erzeugen:		
		JButton button1 = new JButton("RUF... MICH... AN!");
		button1.setVisible(true);
		button1.setSize(150,50);
		button1.setLocation(10, 10);
//	Zusammenfassung von setSize und setLocation:
//		button1.setBounds(10, 10, 150, 50);								// (von links, von oben, L�nge, H�he)
		
		
		JButton button2 = new JButton("N�");
		button2.setBounds(10, 70, 50, 50);
		button2.setVisible(true);		
		
//	Textfield erzeugen:
		JTextField textfield1 = new JTextField();
		textfield1.setBounds(10, 130, 60, 30);
		textfield1.setBackground(Color.RED);;							// Hintergrundfarbe
		textfield1.setVisible(true);
		
//	PasswordField erzeugen:
		JPasswordField pw1 = new JPasswordField();
		pw1.setBounds(10, 170, 100, 30);
		pw1.setVisible(true);		
		
//	Label erzeugen (links vor dem ersten Button)
		JLabel label1 = new JLabel("Button 1 Label");
		label1.setBounds(0, 10, 50, 50);
		label1.setVisible(true);	
		
//		Unterteilung des Rahmens in verschiedene Areas
		JPanel panel1 = new JPanel();
		panel1.setSize(100,100);
		panel1.setBackground(Color.red);
		panel1.setVisible(true);
		
		JPanel panel2 = new JPanel();
		panel2.setSize(50,50);
		panel2.setBackground(Color.green);
		panel2.setVisible(true);
		
		
//	Button/ Textfield/ ... wurden erzeugt, aber noch nicht dem Rahmen hinzugef�gt.
//	F�ge dem Rahmen die Buttons, ... zu:
	//	grundgeruest.add(label);
		grundgeruest.add(textfield1);
		grundgeruest.add(button1);
		grundgeruest.add(button2);
		grundgeruest.add(pw1);		
//		grundgeruest.add(panel1);
//		grundgeruest.add(panel2);
		
		
		panel1.add(label1);
		panel2.add(button1);
		
		grundgeruest.pack();
		

	}

}
