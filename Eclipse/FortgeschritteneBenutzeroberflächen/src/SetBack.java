import java.awt.*;

public class SetBack extends Frame {
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
	Button redButton, blueButton, greenButton, whiteButton, blackButton;

	SetBack(String title) {

		super(title);
		setLayout(fl);
		redButton = new Button("Red");
		add(redButton);
		blueButton = new Button("Blue");
		add(blueButton);
		greenButton = new Button("Green");
		add(greenButton);
		whiteButton = new Button("White");
		add(whiteButton);
		blackButton = new Button("Black");
		add(blackButton);

	}
	// Ereignisroutine zum Auswerten aller Events von Steuerelementen. 
	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {
			changeColor((Button) evt.target);
			return true; // weitere Eventverarbeitung
		} else

			return false; // schaltet Eventverarbeitung ab
	}

	void changeColor(Button b) {
		if (b == redButton) setBackground(Color.red);
		else if (b == blueButton) setBackground(Color.BLUE);
		else if (b == greenButton) setBackground(Color.green);
		else if (b == whiteButton) setBackground(Color.white);
		else setBackground(Color.BLACK); // Groﬂ oder klein, egal, selber Farbcode. 
		repaint();
	}

}
