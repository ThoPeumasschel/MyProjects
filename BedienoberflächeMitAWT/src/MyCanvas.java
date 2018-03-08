import java.awt.*;

public class MyCanvas extends Canvas {
	public void paint(Graphics g) {
		int x = getSize().width / 2;
		int y = getSize().height / 2;
		g.drawLine(x-10, y, x-2, y);
		g.drawLine(x+10, y, x+2, y);
		g.drawLine(x, y-10, x, y-2);
		g.drawLine(x, y+10, x, y+2);
	}
	
	
	
}