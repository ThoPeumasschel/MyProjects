import java.awt.*;

public class SchriftartHeld extends Frame {

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();
	Label font = new Label("Bitte Schriftart benennen: ");
	TextField fontf = new TextField("Helvetica");
	Label design = new Label("Bitte Zahl eingeben:(0) Plain / (1) Bold / (2) Italic : ");
	TextField designf = new TextField("0");
	Label size = new Label("Bitte Schriftgröße eingeben: ");
	TextField sizef = new TextField("12");
	Label extext = new Label("Beispieltext");
	Button ok = new Button("OK");

	void buildConstraints(GridBagConstraints gbc, int gx, int gy, int gw, int gh, int wx, int wy) {
		gbc.gridx = gx; // Element x
		gbc.gridy = gy; // Element y
		gbc.gridwidth = gw; // Anzahl Spalten zusammenfassen
		gbc.gridheight = gh; // Anzahl Zeilen zusammenfassen
		gbc.weightx = wx; // Verhältnis Größe in x-Richtung
		gbc.weighty = wy; // Verhältnis Größe in y-Richtung

	}

	SchriftartHeld(String title) {

		super(title);
		setLayout(gbl);

		// name Label
		buildConstraints(constraints, 0, 0, 1, 1, 10, 40);
		constraints.fill = GridBagConstraints.NONE; // ist für den Hintergrund,
													// Fyllfarbe oder Muster
													// etc.
		constraints.anchor = GridBagConstraints.EAST;
		gbl.setConstraints(font, constraints);
		add(font);

		// name Textfeld
		buildConstraints(constraints, 1, 0, 1, 1, 90, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL; // ist für den
															// Hintergrund,
															// Fyllfarbe oder
															// Muster etc.
		gbl.setConstraints(fontf, constraints);
		add(fontf);

		// name Label
		buildConstraints(constraints, 0, 1, 1, 1, 10, 40);
		constraints.fill = GridBagConstraints.NONE; // ist für den Hintergrund,
													// Fyllfarbe oder Muster
													// etc.
		constraints.anchor = GridBagConstraints.EAST;
		gbl.setConstraints(design, constraints);
		add(design);

		// name Textfeld
		buildConstraints(constraints, 1, 1, 1, 1, 90, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL; // ist für den
															// Hintergrund,
															// Fyllfarbe oder
															// Muster etc.
		gbl.setConstraints(designf, constraints);
		add(designf);

		// name Label
		buildConstraints(constraints, 0, 2, 1, 1, 10, 40);
		constraints.fill = GridBagConstraints.NONE; // ist für den Hintergrund,
													// Fyllfarbe oder Muster
													// etc.
		constraints.anchor = GridBagConstraints.EAST;
		gbl.setConstraints(size, constraints);
		add(size);

		// name Textfeld
		buildConstraints(constraints, 1, 2, 1, 1, 90, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL; // ist für den
															// Hintergrund,
															// Fyllfarbe oder
															// Muster etc.
		gbl.setConstraints(sizef, constraints);
		add(sizef);

		// name Label
		buildConstraints(constraints, 0, 3, 1, 1, 10, 40);
		constraints.fill = GridBagConstraints.NONE; // ist für den Hintergrund,
													// Fyllfarbe oder Muster
													// etc.
		constraints.anchor = GridBagConstraints.EAST;
		gbl.setConstraints(extext, constraints);
		add(extext);

		// 'OK' Button
		buildConstraints(constraints, 0, 4, 2, 1, 0, 50);
		constraints.fill = GridBagConstraints.NONE; // ist für den Hintergrund,
													// Fyllfarbe oder Muster
													// etc.
		constraints.anchor = GridBagConstraints.CENTER;
		gbl.setConstraints(ok, constraints);
		add(ok);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target == ok) {

			String style = fontf.getText();
			int designf2 = Integer.parseInt(designf.getText());
			int size = Integer.parseInt(sizef.getText());
			Font f = new Font(style, designf2, size);
			extext.setFont(f);

		}
		return true;

	}
}