
import java.awt.*;

public class ColorControls extends Panel {

	TextField tf1, tf2, tf3;
	Label lb1, lb2, lb3;
	ColorTest applet;
	GridLayout gr = new GridLayout(3, 2, 10, 10);

	ColorControls(ColorTest parent, String str1, String str2, String str3) {

		applet = parent;
		setLayout(gr);
		lb1 = new Label(str1, Label.RIGHT);
		tf1 = new TextField("0");
		lb2 = new Label(str2, Label.RIGHT);
		tf2 = new TextField("0");
		lb3 = new Label(str3, Label.RIGHT);
		tf3 = new TextField("0");
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(lb3);
		add(tf3);

	}

	public boolean action(Event evt, Object arg) {

		if (evt.target instanceof TextField) {
			applet.update(this); // this zeigt auf alle Objekte, die global deklariert sind.
			return true;
		} else

			return false;
	}
}