package rechner2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Rechner {

	private JFrame frame;
	private JTextField txtDisplay;

	double x;
	double y;
	double result;
	String operations;
	String answer;

	Operationen o = new Operationen();
	private JButton btnDiv_1;
	private JButton btnDiv_2;
	private JButton btnDiv_3;
	private JButton btnDiv_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner window = new Rechner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rechner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 310, 27);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 49, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 49, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 49, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 110, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 110, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				// o.addieren(x, y);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(190, 49, 50, 50);
		frame.getContentPane().add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(190, 110, 50, 50);
		frame.getContentPane().add(btnMinus);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 171, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(67, 171, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 171, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(190, 171, 50, 50);
		frame.getContentPane().add(btnMult);

		JButton btn0;
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 232, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btnDot;
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(70, 232, 50, 50);
		frame.getContentPane().add(btnDot);

		JButton btnErg;
		btnErg = new JButton("=");
		btnErg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				y = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") {
					result = x + y;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					// txtDisplay.setText(result);
				} else if (operations == "-") {
					result = x - y;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if (operations == "*") {
					result = x * y;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if (operations == "/") {
					result = x / y;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

			}
		});
		btnErg.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnErg.setBounds(130, 232, 50, 50);
		frame.getContentPane().add(btnErg);

		JButton btnDiv;
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(190, 232, 50, 50);
		frame.getContentPane().add(btnDiv);

		JButton btnRad;
		btnDiv_2 = new JButton("\u00B2\u221A");
		btnDiv_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				res = Math.sqrt(res);
				txtDisplay.setText(String.valueOf(res));
			}
		});
		btnDiv_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_2.setBounds(250, 232, 70, 50);
		frame.getContentPane().add(btnDiv_2);

		JButton btnPow;
		btnDiv_3 = new JButton("x\u00B2");
		btnDiv_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				res = Math.pow(res, 2);
				txtDisplay.setText(String.valueOf(res));

			}
		});
		btnDiv_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_3.setBounds(250, 171, 70, 50);
		frame.getContentPane().add(btnDiv_3);

		JButton btnErase;
		btnDiv_1 = new JButton("C");
		btnDiv_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnDiv_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_1.setBounds(250, 110, 70, 50);
		frame.getContentPane().add(btnDiv_1);

		JButton btnBack;
		btnDiv_4 = new JButton("CE");
		btnDiv_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;

				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);

				}
			}
		});
		btnDiv_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_4.setBounds(250, 49, 70, 50);
		frame.getContentPane().add(btnDiv_4);
	}
}
