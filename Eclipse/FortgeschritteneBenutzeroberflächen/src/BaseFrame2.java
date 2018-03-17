import java.awt.*;

public class BaseFrame2 extends Frame {
	BorderLayout fl = new BorderLayout();
	String message = "This is a window";
	Label lab;
	TextDialog dl;

	BaseFrame2(String title) {
		super(title);
		setLayout(fl);
		lab = new Label(message, Label.CENTER);
		Font f = new Font("Helvetica", Font.PLAIN, 12);
		setFont(f);
		add("Center", lab);
		dl = new TextDialog(this, "Enter Text", true);
		dl.setSize(150, 150);
		Button b = new Button("Set Text");
		add("South", b);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {
			dl.setVisible(true);
			return true;
		} else 
			return false;
	}
}