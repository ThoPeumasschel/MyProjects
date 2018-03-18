import java.awt.*;

public class Alphabet extends Frame {
	FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
	Button a = new Button("A");
	Button b = new Button("B");
	Button c = new Button("C");
	Button d = new Button("D");
	Button e = new Button("E");
	Button f = new Button("F");
	
	Alphabet(String title) {
		super(title);
		setLayout(lm);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		
	}
	
}
