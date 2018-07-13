import java.awt.*;

public class FirmaFenster extends Frame {
	FlowLayout fl = new FlowLayout();
	String message = "Mit diesem Programm können Sie neue Mitarbeiter erfassen";
	Label lab;
	TextDialog c1;
	Person p1 = new Person();
	Button case1 = new Button("Angestellte eingeben");
	Button case2 = new Button("Arbeiter eingeben");
	Button case3 = new Button("Alle Angestellten auflisten");
	Button case4 = new Button("Alle Arbeiter auflisten");
	Button case5 = new Button("Mitarbeiter Zahlen ausgeben");
	Button case0 = new Button("Programm beenden");

	FirmaFenster(String title) {
		super(title);
		setLayout(fl);
		
		lab = new Label(message);
		Font f = new Font("Helvetica", Font.PLAIN, 12);
		setFont(f);
		add("North", lab);
		c1 = new TextDialog(this, "Enter Text", true);
		c1.setSize(150, 150);
		add(case1);
		add(case2);
		add(case3);
		add(case4);
		add(case5);
		add(case0);

	}

	public boolean action(Event evt, Object arg) {
		if (evt.target instanceof Button) {
			auswahl((Button) evt.target);
//			dl.setVisible(true);
			return true;
		} else 
			return false;
	}
	void auswahl(Button b) {
		if (b == case1) {
			System.out.println("Angestellte eingeben");
			p1.getAngestellte();}
		else if (b == case2) setBackground(Color.BLUE);
		else if (b == case3) setBackground(Color.green);
		else if (b == case4) setBackground(Color.white);
		else if (b == case5) setBackground(Color.white);
		else System.exit(1); 
		repaint();
	}
}
