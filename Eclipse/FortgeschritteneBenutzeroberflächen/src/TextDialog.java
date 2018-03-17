import java.awt.*;

public class TextDialog extends Dialog {
	BorderLayout fl = new BorderLayout(01, 10);
	TextField tf;
	BaseFrame2 theFrame;

	TextDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		theFrame = (BaseFrame2) parent;
		setLayout(fl);
		tf = new TextField(theFrame.message, 20);
		add("Center", tf);
		Button b = new Button("OK");
		add("South", b);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {
			String label = (String) arg;
			if (label.equals("OK")) {
				setVisible(false);
				theFrame.lab.setText(tf.getText());

			}
			return true;
		} else
			return false;
	}
}