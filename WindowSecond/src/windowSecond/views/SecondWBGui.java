package windowSecond.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import windowSecond.common.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SecondWBGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtStrasse;
	private JButton btnOk;
	private JLabel lblOrt;
	private JTextField txtOrt;
	private JLabel lblStrasse;
	private JLabel lblNachname;
	private JLabel lblVorname;

	private JLabel lblNr;
	private JTextField txtHausnr;
	private JLabel lblPlz;
	private JTextField txtplz;
	private JTextField txtZuletztEingegeben;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnSpeichern;
	private String[] arr = new String[10];
	public static int iIndex = 0;
	public Person g;
	private JButton btnEinlesen;

	/**
	 * Create the frame.
	 */
	public SecondWBGui() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(SecondWBGui.class.getResource("/windowSecond/resources/mario_3501733.jpg")));

		initComponents();
		createEvents();

	}

	private void createEvents() {
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Person g = new Person(txtVorname.getText(), txtNachname.getText(), txtStrasse.getText(),
						txtHausnr.getText(), txtOrt.getText(), txtplz.getText());
				JOptionPane.showMessageDialog(null, g.toString());
				textArea.setText(g.toString());

				arr[iIndex] = g.toString();
				iIndex++;

				
					
				
			}
		});

		btnSpeichern.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				speichern();
			}
		});
		btnEinlesen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				einlesen();
				for (int i = 0; arr[i] != null; i++)
				textArea.setText(arr[i]);

			}
		});

	}

	public void speichern() {
		try {
			FileOutputStream fs = new FileOutputStream("Datenbank1.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(arr);
			os.close();

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	void einlesen() {
		try {

			FileInputStream fs = new FileInputStream("Datenbank1.ser");
			ObjectInputStream os = new ObjectInputStream(fs);
			arr = (String[]) os.readObject();
			for (int i = 0; arr[i] != null; ++i)
				iIndex = i + 1;
			os.close();

		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	private void initComponents() {
		setTitle("Name und Adresse eingeben");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblVorname = new JLabel("Vorname:");

		lblNachname = new JLabel("Nachname:");

		lblStrasse = new JLabel("Stra\u00DFe:");

		txtVorname = new JTextField();
		txtVorname.setColumns(10);

		txtNachname = new JTextField();
		txtNachname.setColumns(10);

		txtStrasse = new JTextField();
		txtStrasse.setColumns(10);

		btnOk = new JButton("\u00DCbernehmen");

		lblOrt = new JLabel("Ort:");

		txtOrt = new JTextField();
		txtOrt.setColumns(10);

		lblNr = new JLabel("Nr.");

		txtHausnr = new JTextField();
		txtHausnr.setColumns(10);

		lblPlz = new JLabel("PLZ");

		txtplz = new JTextField();
		txtplz.setColumns(10);

		scrollPane = new JScrollPane();

		txtZuletztEingegeben = new JTextField();
		txtZuletztEingegeben.setText("Zuletzt eingegeben:");
		txtZuletztEingegeben.setColumns(10);

		btnSpeichern = new JButton("Speichern");

		btnEinlesen = new JButton("Einlesen");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup().addContainerGap()
										.addComponent(
												txtZuletztEingegeben, GroupLayout.PREFERRED_SIZE, 122,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(232, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(
										Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addContainerGap().addComponent(
												scrollPane, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnOk))
								.addGroup(
										gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane
														.createSequentialGroup().addContainerGap()
														.addComponent(btnSpeichern).addGap(154)
														.addComponent(btnEinlesen))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblVorname).addComponent(lblNachname)
																.addComponent(lblStrasse).addComponent(lblOrt))
														.addGap(15)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.LEADING)
																				.addComponent(txtOrt,
																						GroupLayout.DEFAULT_SIZE, 148,
																						Short.MAX_VALUE)
																				.addComponent(
																						txtStrasse, Alignment.TRAILING,
																						GroupLayout.DEFAULT_SIZE, 148,
																						Short.MAX_VALUE))
																		.addGap(25)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(lblNr)
																				.addComponent(lblPlz))
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING,
																						false)
																				.addComponent(txtplz, 0, 0,
																						Short.MAX_VALUE)
																				.addComponent(txtHausnr,
																						GroupLayout.DEFAULT_SIZE, 59,
																						Short.MAX_VALUE)))
																.addComponent(txtVorname, GroupLayout.DEFAULT_SIZE, 253,
																		Short.MAX_VALUE)
																.addComponent(txtNachname, GroupLayout.DEFAULT_SIZE,
																		253, Short.MAX_VALUE)))))
								.addGap(32)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblVorname)
						.addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNachname))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblStrasse)
						.addComponent(txtStrasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHausnr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNr))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblOrt)
						.addComponent(txtOrt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtplz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlz))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
						.addComponent(txtZuletztEingegeben, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(btnOk)
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addGroup(gl_contentPane
						.createParallelGroup(Alignment.BASELINE).addComponent(btnSpeichern).addComponent(btnEinlesen))
				.addContainerGap()));
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		contentPane.setLayout(gl_contentPane);
	}
}
