import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Fenster extends JFrame {

	private JPanel contentPane;
	private JTextField tfZahl1;
	private JTextField tfZahl2;
	private JLabel lblAusgabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenster frame = new Fenster();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfZahl1 = new JTextField();
		tfZahl1.setBounds(26, 71, 86, 20);
		contentPane.add(tfZahl1);
		tfZahl1.setColumns(10);
		
		tfZahl2 = new JTextField();
		tfZahl2.setBounds(231, 71, 86, 20);
		contentPane.add(tfZahl2);
		tfZahl2.setColumns(10);
		
		JLabel lblZahl = new JLabel("Zahl1");
		lblZahl.setFont(new Font("Calibri", Font.BOLD, 14));
		lblZahl.setBounds(26, 47, 46, 14);
		contentPane.add(lblZahl);
		
		JLabel lblZahl_1 = new JLabel("Zahl2");
		lblZahl_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblZahl_1.setBounds(235, 47, 46, 14);
		contentPane.add(lblZahl_1);
		
		lblAusgabe = new JLabel("Ausgabe");
		lblAusgabe.setForeground(new Color(204, 0, 102));
		lblAusgabe.setBackground(new Color(255, 255, 255));
		lblAusgabe.setFont(new Font("Calibri", Font.BOLD, 14));
		lblAusgabe.setBounds(26, 117, 86, 14);
		contentPane.add(lblAusgabe);
		
		JButton btnBerechnen = new JButton("berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int zahl1 = Integer.parseInt( tfZahl1.getText() );				
				int zahl2 = Integer.parseInt( tfZahl2.getText() );
				
				int berechnung = zahl1 + zahl2;
				
				lblAusgabe.setText( Integer.toString( berechnung ) );
				
			}
		});
		btnBerechnen.setBounds(295, 209, 129, 42);
		contentPane.add(btnBerechnen);
	}
}
