import java.awt.*;

public class AufgabeBorder extends Frame {
	BorderLayout lm = new BorderLayout();
	Label lab = new Label("Die Action-Events");
	Button btnFs = new Button("Fenster schlie�en");
	TextField tf = new TextField("Wenn Sie hier 'Exit' eingeben, wird das Fenster geschlossen.");

	AufgabeBorder(String title) {
		super(title);
		setLayout(lm);
		setBackground(Color.YELLOW);
		add("North", lab);
		add("South", btnFs);
		add("Center", tf);
		Comparator<>

	}

	public boolean action(Event evt, Object arg) {

		if (evt.target == btnFs)
			System.exit(1);
		else if (evt.target == tf) {
			if (tf.getText().equals("Exit"))
				System.exit(0);
		}

			return true;
	}

}
