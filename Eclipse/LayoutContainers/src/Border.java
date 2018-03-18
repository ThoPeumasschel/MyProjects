import java.awt.*;

public class Border extends Frame {
	BorderLayout lm = new BorderLayout();
	Button a = new Button("A");
	Button b = new Button("B");
	Button c = new Button("C");
	Button d = new Button("D");
	Button e = new Button("E");

	Border(String title) {
		super(title);
		setLayout(lm);
		add("North", a);
		add("South", b);
		add("East", c);
		add("West", d);
		add("Center", e);

	}

}
