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
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FirstWBGui extends JFrame {

	private JPanel ctpMain;
	private JTextField txtFirstName;
	private JLabel lblFirstName;
	private JRadioButton rdbtnChili;
	private JRadioButton rdbtnBowl;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JCheckBox chckbxMildSauce;
	private JCheckBox chckbxMeduimSauce;
	private JCheckBox chckbxHotSauce;
	private JRadioButton rdbtnChicken;
	private JRadioButton rdbtnSteak;
	private JRadioButton rdbtnPork;
	private JButton btnmonkey;
	private JTextArea textArea;
	private JScrollPane scrollPane;

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
				.getImage(FirstWBGui.class.getResource("/windowBuilder/resources/monkey.png")));
		setTitle("Thomas Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);

		lblFirstName = new JLabel("First Name: ");

		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);

		rdbtnChili = new JRadioButton("Chili");
		buttonGroup.add(rdbtnChili);
		rdbtnChili.setSelected(true);

		rdbtnBowl = new JRadioButton("Bowl");
		buttonGroup.add(rdbtnBowl);

		JLabel lblNewLabel = new JLabel("Entree Type:");

		JLabel lblMeat = new JLabel("Meat:");

		rdbtnChicken = new JRadioButton("Chicken");
		rdbtnChicken.setSelected(true);
		buttonGroup_1.add(rdbtnChicken);

		rdbtnSteak = new JRadioButton("Steak");
		buttonGroup_1.add(rdbtnSteak);

		rdbtnPork = new JRadioButton("Pork");
		buttonGroup_1.add(rdbtnPork);

		JLabel lblNewLabel_1 = new JLabel("Extras:");

		chckbxMildSauce = new JCheckBox("Mild Sauce");

		chckbxMeduimSauce = new JCheckBox("Meduim Sauce");

		chckbxHotSauce = new JCheckBox("Hot Sauce");

		JLabel lblSpecialInstructions = new JLabel("Special Instructions:");

		btnmonkey = new JButton("Order");
		btnmonkey.setVerticalAlignment(SwingConstants.BOTTOM);
		btnmonkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnmonkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Customers", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		scrollPane = new JScrollPane();

		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_ctpMain.createSequentialGroup()
							.addComponent(lblFirstName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFirstName, 324, 324, 324))
						.addGroup(Alignment.LEADING, gl_ctpMain.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(lblMeat))
									.addGap(18)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnChicken)
										.addComponent(rdbtnChili))
									.addGap(28)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnBowl)
										.addComponent(rdbtnSteak))
									.addGap(42))
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(chckbxMildSauce)
									.addGap(18)
									.addComponent(chckbxMeduimSauce)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnPork)
								.addComponent(chckbxHotSauce)))
						.addGroup(Alignment.LEADING, gl_ctpMain.createSequentialGroup()
							.addComponent(lblSpecialInstructions)
							.addGap(8)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
						.addComponent(btnmonkey))
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName)
								.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(rdbtnBowl)
										.addComponent(rdbtnChili))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnSteak)
										.addComponent(rdbtnChicken)
										.addComponent(lblMeat))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxMildSauce)
										.addComponent(chckbxMeduimSauce)
										.addComponent(lblNewLabel_1)))
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addComponent(rdbtnPork)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxHotSauce)))
							.addGap(18)
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSpecialInstructions)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnmonkey)
							.addGap(11))))
		);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dr. ", "Mr. ", "Mrs. ", "Ms. "}));
		comboBox.setSelectedIndex(1);
		
		JLabel lblTitle = new JLabel("Title:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitle)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(374, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
		ctpMain.setLayout(gl_ctpMain);
	}

	// This method contains all of the code for creating events
	private void createEvents() {
		btnmonkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, txtFirstName.getText());
				txtFirstName.setText("blabla");

				if (rdbtnChili.isSelected())
					JOptionPane.showMessageDialog(null, "Chili!!");
				else
					JOptionPane.showMessageDialog(null, "Carne!!");
				
				if (chckbxMildSauce.isSelected())
					JOptionPane.showMessageDialog(null, "Mild!!");
				else
					JOptionPane.showMessageDialog(null, "Carne!!");
				
				System.out.println(textArea.getText());
			}
		});
	}
}
