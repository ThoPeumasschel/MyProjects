import java.awt.*;

public class SchriftartTesten extends Frame {
	GridLayout fl = new GridLayout(4, 2);
	String message = "This is a text to test the text.";
	Label lb1 = new Label("Schriftart");
	TextField tf1 = new TextField();
	Label lb2 = new Label("Schriftschnitt");
	TextField tf2 = new TextField("0 fuer Plain, 1 fuer Bold oder 2 fuer Italic eingeben");
	Label lb3 = new Label("Schriftgröße");
	TextField tf3 = new TextField();
	static final int s0 = 0;
	static final int s1 = 1;
	static final int s2 = 2;

	Button btn = new Button("Ausprobieren");
	Label lab = new Label(message);

	SchriftartTesten(String title) {
		super(title);
		setLayout(fl);
		lab = new Label(message, Label.CENTER);
		Font g = new Font("Helvetica", Font.PLAIN, 12);
		setFont(g);
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(lb3);
		add(tf3);
		add("Center", lab);
		add(btn);
		add(lab);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target == btn) {

			String textf1 = tf1.getText();
			int textf2 = Integer.parseInt(tf2.getText());
			int textf3 = Integer.parseInt(tf3.getText());
			
			Font f = new Font(textf1, textf2, textf3);

			lab.setFont(f);

		}
		return true;
	}
}