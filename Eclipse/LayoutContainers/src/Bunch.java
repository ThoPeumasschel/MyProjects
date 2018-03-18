import java.awt.*;

public class Bunch extends Frame {
	GridLayout lm = new GridLayout(3, 3, 10, 10);
	Button a = new Button("A");
	Button b = new Button("B");
	Button c = new Button("C");
	Button d = new Button("D");
	Button e = new Button("E");
	Button f = new Button("F");
	Button g = new Button("G");
	Button h = new Button("H");
	Button i = new Button("I");
	
	
	
	
	Bunch(String title) {
		super(title);
		setLayout(lm);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		add(g);
		add(h);
		add(i);
		
	}
	
}
