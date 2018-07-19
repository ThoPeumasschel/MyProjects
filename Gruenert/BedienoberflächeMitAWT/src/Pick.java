import java.awt.*;

public class Pick extends Frame {
	FlowLayout fl = new FlowLayout();
	CheckboxGroup p = new CheckboxGroup();
	Checkbox c1 = new Checkbox("Milos", p, false);
	Checkbox c2 = new Checkbox("Paulina", p, false);
	Checkbox c3 = new Checkbox("Ivan", p, false);
	Checkbox c4 = new Checkbox("Tom", p, false);
	Checkbox c5 = new Checkbox("Ivana", p, false);

	Pick(String title) {
		super(title);
		setLayout(fl);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
	}

}
