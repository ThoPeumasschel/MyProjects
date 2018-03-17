import java.awt.*;

public class Check extends Frame {
	FlowLayout fl = new FlowLayout();
	Checkbox c1 = new Checkbox("Milos");
	Checkbox c2 = new Checkbox("Paulina");
	Checkbox c3 = new Checkbox("Ivan");
	Checkbox c4 = new Checkbox("Tom");
	Checkbox c5 = new Checkbox("Ivana");

	Check(String title) {
		super(title);
		setLayout(fl);
		add(c1);
		c2.setState(true);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
	}

}
