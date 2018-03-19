package windowBuilder.views;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class FirstWBGui extends JFrame {

	private JPanel ctpMain;
	private JTextField txtFirstName;
	private JLabel lblFirstName;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWBGui frame = new FirstWBGui();
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
	public FirstWBGui() {

		intiComponents();
		createEvents();

	}

	// This method contains all of the code for creating and initializing
	// components.
	private void intiComponents() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FirstWBGui.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		setTitle("Thomas Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);

		lblFirstName = new JLabel("First Name: ");

		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);

		btnOk = new JButton("Ok");
		
		JRadioButton rdbtnMail = new JRadioButton("Male");
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");

		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addComponent(rdbtnMail)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnFemale)
							.addGap(146)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tglbtnNewToggleButton))
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblFirstName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFirstName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOk)))
					.addGap(127))
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOk))
					.addGap(18)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMail)
						.addComponent(rdbtnFemale)
						.addComponent(tglbtnNewToggleButton))
					.addContainerGap(177, Short.MAX_VALUE))
		);
		ctpMain.setLayout(gl_ctpMain);
	}

	// This method contains all of the code for creating events
	private void createEvents() {
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, txtFirstName.getText());
				// txtFirstName.setText(txtFirstName.getText() + " blabla");

			}
		});
	}
}
