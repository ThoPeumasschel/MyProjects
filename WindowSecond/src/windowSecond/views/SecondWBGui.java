package windowSecond.views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class SecondWBGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtAdresse;
	private JButton btnOk;
	protected String vorname;

	/**
	 * Create the frame.
	 */
	public SecondWBGui() {

		initComponents();
		createEvents();

	}

	

	private void initComponents() {
		setTitle("Name und Adresse eingeben");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblVorname = new JLabel("Vorname:");

		JLabel lblName = new JLabel("Nachname:");

		JLabel lblAdresse = new JLabel("Adresse:");

		txtVorname = new JTextField();
		txtVorname.setColumns(10);

		txtNachname = new JTextField();
		txtNachname.setColumns(10);

		txtAdresse = new JTextField();
		txtAdresse.setColumns(10);

		btnOk = new JButton("Ok");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblVorname)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
												.addComponent(lblAdresse))
										.addComponent(lblName)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(txtNachname)
								.addComponent(txtAdresse)
								.addComponent(txtVorname, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
						.addComponent(btnOk, Alignment.TRAILING))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblVorname).addComponent(
						txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblName).addComponent(
						txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblAdresse).addComponent(
						txtAdresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE).addComponent(btnOk)
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
	private void createEvents() {
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				vorname = txtVorname.getText();
			}
		});		
	}

}
