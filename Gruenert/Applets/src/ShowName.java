import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class ShowName extends java.applet.Applet {

	
	public void paint(Graphics screen) {
		Font f = new Font("TimesRoman", Font.BOLD, 48);
		Font g = new Font("Tahoma", Font.ITALIC, 36);
		Font h = new Font("Helvetica", Font.BOLD, 24);
		FontMetrics fm = getFontMetrics(f);
		screen.setFont(f);
		
		String s = "Thomas Peuschel";
		int x = (getSize().width - fm.stringWidth(s)) / 2;
		int y = getSize().height / 2;
		screen.drawString(s, x, y);
		
		FontMetrics gm = getFontMetrics(g);
		screen.setFont(g);
		String t = "Freischaffend";
		int a = (getSize().width - gm.stringWidth(t)) / 2;
		int b = getSize().height / 4;
		screen.drawString(t, a, b);
		
		FontMetrics hm = getFontMetrics(h);
		screen.setFont(h);
		String u = "0190/123 456";
		int c = (getSize().width - hm.stringWidth(u)) / 2;
		int d = (getSize().height / 2) + 100;
		screen.drawString(u, c, d);
	}
	
}
