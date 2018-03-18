import java.awt.*;

public class Crosshair extends Frame {
	GridLayout fl = new GridLayout();
	MyCanvas can = new MyCanvas();
	
	Crosshair(String title) {
		super(title);
		setLayout(fl);
		add(can);
	}

}
