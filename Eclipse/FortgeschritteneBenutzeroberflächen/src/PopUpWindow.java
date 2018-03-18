import java.awt.*;

public class PopUpWindow extends Frame {
	FlowLayout fl = new FlowLayout();
	Button open, close;
	Frame window;

	PopUpWindow(String title) {
		super(title);
		setLayout(fl);
		open = new Button("Open Window");
		add(open);
		close = new Button("Close Window");
		add(close);
		window = new BaseFrame1("A pop up window");
		window.setSize(150, 150);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {
			String label = (String) arg;
			if (label.equals("Open Window")) {
				if (!window.isShowing())
					window.setVisible(true);
			} else {
				if (window.isShowing())
					window.setVisible(false);
			}
			return true;

		} else
			return false;
	}
}