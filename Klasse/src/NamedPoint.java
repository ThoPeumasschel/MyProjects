import java.awt.Point;

public class NamedPoint extends Point {
	private String name;

	NamedPoint(int x, int y, String name) {
		super(x, y); // gibt x und y an den Konstruktor von Point weiter
		this.name = name;

	}

	public String getName() {
		return name;
	}

}
