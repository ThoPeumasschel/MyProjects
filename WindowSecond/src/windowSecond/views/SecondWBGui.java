package windowSecond.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

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
	private JButton btnUebernehmen;
	private JLabel lblOrt;
	private JTextField txtOrt;
	private JLabel lblStrasse;
	private JLabel lblNachname;
	private JLabel lblVorname;

	private JLabel lblNr;
	private JTextField txtHausnr;
	private JLabel lblPlz;
	private JTextField txtplz;
	private static JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnSpeichern;
	private static String[] arr = new String[100];
	public static int iIndex;
	public Person g;
	private JButton btnEinlesen;
	private JButton btnFileSave;
	private JButton btnFileRead;

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
		btnUebernehmen.addActionListener(new ActionListener() {

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
		btnFileSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeToFile(arr);
			}
		});
		btnFileRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFromFile();
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
			for (int j = 0; j <= iIndex; j++) {
				textArea.setText(arr[j]);
				
			}

		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	static void writeToFile(String[] arr) {

		try {
			//
			Formatter f = new Formatter("Datenbank1.txt");
			f.format("%s", arr);
			f.close();

			//

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}
	}

	static void readFromFile() {
		try {

			File x = new File("Datenbank1.txt");
			Scanner sc = new Scanner(x);
			while (sc.hasNext()) {
				arr[iIndex] = sc.next();
				iIndex++;
			}
			for (int i = 0; i < arr.length; i++)
			textArea.setText(arr[i]);
			sc.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}

	}

	private void initComponents() {
		setTitle("Name und Adresse eingeben");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 356);
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

		btnUebernehmen = new JButton("\u00DCbernehmen");

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

		btnSpeichern = new JButton("Speichern");

		btnEinlesen = new JButton("Einlesen");

		JLabel lblNewLabel = new JLabel("Zuletzt eingegeben");

		btnFileSave = new JButton("File Save");

		btnFileRead = new JButton("File Read");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(scrollPane,
								GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
										.addComponent(btnUebernehmen))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnSpeichern)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnFileSave)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnFileRead)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEinlesen))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
								.addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING).addComponent(lblVorname)
										.addComponent(lblNachname).addComponent(lblStrasse).addComponent(lblOrt))
								.addGap(15)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
										.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtOrt, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
												.addComponent(txtStrasse, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														148, Short.MAX_VALUE))
										.addGap(25)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNr).addComponent(lblPlz))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtplz, 0, 0, Short.MAX_VALUE).addComponent(txtHausnr,
														GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
										.addComponent(txtVorname, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
										.addComponent(txtNachname, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
				.addGap(32)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
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
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(btnUebernehmen))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnSpeichern)
								.addComponent(btnEinlesen).addComponent(btnFileSave).addComponent(btnFileRead))
						.addContainerGap()));
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		contentPane.setLayout(gl_contentPane);
	}
}
