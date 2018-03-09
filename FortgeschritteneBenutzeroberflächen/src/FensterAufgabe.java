import java.awt.*;

public class FensterAufgabe extends Frame {
	FlowLayout fl = new FlowLayout();
	TextField tf = new TextField(25);
	Label lab = new Label("Hallo");

	Button btnOK = new Button("OK");
	Button btnReset = new Button("Reset");
	Button btnBeenden = new Button("Beenden");

	FensterAufgabe(String title) {
		super(title);
		setLayout(fl);
		add(tf);
		add(lab);
		add(btnOK);
		add(btnReset);
		add(btnBeenden);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {// evt ist Event den wir bekommen, darin steht der Instanzname von dem
											// angeklickten Button
											// The target component. This indicates the component over which the event
											// occurred or with which the event is associated
			if (evt.target == btnBeenden)
				System.exit(1);
			else if (evt.target == btnReset) {
				tf.setText("  ");
				lab.setText("");
			} else {
				lab.setText(tf.getText());
			}

			return true;
		} else
			return false;

	}
}