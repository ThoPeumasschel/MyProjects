package Hausis;
/*	Created by: Patrick Kleinschmidt
 * 	Date: 14.03.18
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Write_Frame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	static private String NameTemp, LastNameTemp, BirthdayTemp, AdressTemp, PLZTemp, CityTemp;
	static private int roleTemp;
	private JTextField textField_2, textField_3, textField_4, textField_5, textField_6;
	JButton btnNewButton = new JButton("In Datenbank ablegen");
	JPanel panel = new JPanel();
	JLabel lblNeuAnlegen = new JLabel("Neu Anlegen:");
	JLabel lblName = new JLabel("Vorname:");
	
	//STARTPOINT
	public static void main(String[] args) {
		Write_Frame window = new Write_Frame();
		window.frame.setVisible(true);
	}

	//INITIALIZE FRAME
	public Write_Frame() {
		initialize();
	}

	//FRAMESTUFF
	private void initialize() {
		textField = new JTextField();
		frame = new JFrame();
		frame.setResizable(false);
		//DISPOSE FRAME ON X
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//SET LAYOUTS
		frame.getContentPane().setLayout(null);
		panel.setLayout(null);
		
		//SET FONTS
		lblNeuAnlegen.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//SET BORDERS
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		//ADD STUFF TO FRAME
		frame.getContentPane().add(panel);
		panel.add(lblNeuAnlegen);
		panel.add(lblName);
		panel.add(textField);
		
		//SET BOUNDS - LOCATION OF OBJECTS
		frame.setBounds(100, 100, 282, 310);
		panel.setBounds(0, 0, 266, 228);
		lblNeuAnlegen.setBounds(10, 11, 201, 14);
		lblName.setBounds(10, 36, 92, 14);
		textField.setBounds(112, 33, 150, 20);

		//UNSORTED!
		textField.setColumns(10);		
		JLabel lblAr = new JLabel("Angestellt?");
		lblAr.setBounds(10, 192, 80, 14);
		panel.add(lblAr);
		textField_1 = new JTextField();
		textField_1.setBounds(112, 189, 19, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		JLabel lblNein = new JLabel("0 = nein     1 = ja");
		lblNein.setBounds(141, 192, 121, 14);
		panel.add(lblNein);
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(10, 61, 92, 14);
		panel.add(lblNachname);
		textField_2 = new JTextField();
		textField_2.setBounds(112, 58, 150, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum:");
		lblGeburtsdatum.setBounds(10, 86, 92, 14);
		panel.add(lblGeburtsdatum);
		textField_3 = new JTextField();
		textField_3.setBounds(112, 83, 150, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		JLabel lblAnschrift = new JLabel("Straße:");
		lblAnschrift.setBounds(10, 111, 92, 14);
		panel.add(lblAnschrift);
		textField_4 = new JTextField();
		textField_4.setBounds(112, 108, 150, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(10, 136, 92, 14);
		panel.add(lblPlz);
		textField_5 = new JTextField();
		textField_5.setBounds(112, 133, 150, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		JLabel lblStadt = new JLabel("Stadt:");
		lblStadt.setBounds(10, 161, 92, 14);
		panel.add(lblStadt);
		textField_6 = new JTextField();
		textField_6.setBounds(112, 158, 150, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		btnNewButton.setBounds(27, 239, 223, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
	}
	
	//BUTTON ACTIONS
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnNewButton) {
			//GET DATA FROM TEXTFIELDS
			NameTemp = textField.getText();
			LastNameTemp = textField_2.getText();
			BirthdayTemp = textField_3.getText();
			AdressTemp = textField_4.getText();
			PLZTemp = textField_5.getText();
			CityTemp = textField_6.getText();
			roleTemp = Integer.parseInt(textField_1.getText());
			//ARBEITER OR ANGESTELLTER
			switch (roleTemp)	{
			//IS ARBEITER
			case 0: { 
				//SEARCH FREE PLACE IN ARRAY
				
						break;
					}	
				
			
			//IS ANGESTELLTER
			case 1: { 
				//SEARCH FREE PLACE IN ARRAY
				
						break;
				}
				//MESSAGE BOX
			}
			}
		}
	}			
