import java.awt.*;

public class SoLong extends java.applet.Applet {

	
	public void paint(Graphics screen) {
		Font f = new Font("Courier", Font.BOLD, 18);
		FontMetrics fm = getFontMetrics(f);
		screen.setFont(f);
		String s = "So long, and thanks for all the fish.";
		int x = (getSize().width - fm.stringWidth(s)) / 2;
		int y = getSize().height / 2;
		screen.drawString(s, x, y);
		
	}
	
}
