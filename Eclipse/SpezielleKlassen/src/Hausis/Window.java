package Hausis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Window implements ActionListener{

	JFrame frame;
	JButton btnSpeichern = new JButton("Speichern und beenden");
	JButton btnAnzeigen = new JButton("Messwerte anzeigen");
	JButton btnAngestelltenEingeben = new JButton("Messwerte anfügen");
	private final JPanel panel = new JPanel();
	private final JLabel lblFirmaXyz = new JLabel("Messungen");
	JPanel panel_1 = new JPanel();
	
	
	
	 void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		//CLOSE PROG. ON X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//SET LAYOUTS
		frame.getContentPane().setLayout(null);
		panel.setLayout(null);
		panel_1.setLayout(null);
		
		//SET FONTS
		lblFirmaXyz.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//SET BORDERS
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		//ADD STUFF TO FRAME
		frame.getContentPane().add(panel);
		panel.add(btnSpeichern);
		panel.add(lblFirmaXyz);
		panel.add(panel_1);
		
		panel_1.add(btnAnzeigen);
		panel_1.add(btnAngestelltenEingeben);
		
		//SET BOUNDS - LOCATION OF OBJECTS
		frame.setBounds(100, 100, 453, 214);
		panel.setBounds(0, 0, 447, 185);
		panel_1.setBounds(10, 34, 190, 85);
		lblFirmaXyz.setBounds(10, 9, 417, 14);
	
		btnAnzeigen.setBounds(10, 11, 170, 23);
		btnSpeichern.setBounds(227, 146, 200, 23);
		btnAngestelltenEingeben.setBounds(10, 45, 170, 23);
		btnAngestelltenEingeben.setBounds(10, 45, 170, 23);
		
		//BUTTONS ACTIONLISTENER
		btnAngestelltenEingeben.addActionListener(this);
		btnAnzeigen.addActionListener(this);
		btnSpeichern.addActionListener(this);
	}
	
	//BUTTON ACTIONS
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnSpeichern) {
//			SaveDatenbank s1 = new SaveDatenbank();
			System.exit(0);
		}
		if (e.getSource() == this.btnAnzeigen)	{
//			Read_Frame.main(null);
		}
		if (e.getSource() == this.btnAngestelltenEingeben)	{
			Write_Frame.main(null);
		}
	}

}
