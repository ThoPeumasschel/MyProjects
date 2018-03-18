import java.awt.*;

public class NamePass extends Frame {
	GridBagLayout gl = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();
	Label label1 = new Label("Name: ");
	TextField tfname = new TextField();
	Label label2 = new Label("Password: ");
	TextField tfpassword = new TextField();
	Button okb = new Button("OK");

	void buildConstraints(GridBagConstraints gbc, int gx, int gy, int gw, int gh, int wx, int wy) {
		gbc.gridx = gx; // Element X
		gbc.gridy = gy; // Element Y
		gbc.gridwidth = gw; // Anzahl Spalten zusammenfassen
		gbc.gridheight = gh; // Anzahl Zeilen zusammenfassen
		gbc.weightx = wx; // Verhältnis Größe in x-Richtung
		gbc.weighty = wy; // Verhältnis Größe in y-Richtung

	}

	NamePass(String title) {
		super(title);
		setLayout(gl);

		// name label
		buildConstraints(constraints, 0, 0, 1, 1, 10, 40);
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		gl.setConstraints(label1, constraints);
		add(label1);

		// name textfield
		buildConstraints(constraints, 1, 0, 1, 1, 90, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		gl.setConstraints(tfname, constraints);
		add(tfname);

		// password label
		buildConstraints(constraints, 0, 1, 1, 1, 0, 40);
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		gl.setConstraints(label2, constraints);
		add(label2);

		// password textfield
		buildConstraints(constraints, 1, 1, 1, 1, 0, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		tfpassword.setEchoChar('*');
		gl.setConstraints(tfpassword, constraints);
		add(tfpassword);

		// OK button
		buildConstraints(constraints, 0, 2, 2, 1, 0, 20);
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		tfpassword.setEchoChar('*');
		gl.setConstraints(okb, constraints);
		add(okb);

	}

}
