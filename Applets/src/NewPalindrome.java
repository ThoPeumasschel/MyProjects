import java.awt.*;

public class NewPalindrome extends java.applet.Applet {

	Font f = new Font("TimesRoman", Font.BOLD, 24);
	String palindrome;
	
	public void init() {
		palindrome = "Dennis and Edna sinned";
	}
	
	public void paint(Graphics screen) {
		screen.setFont(f);
		screen.setColor(Color.BLUE);
		screen.drawString(palindrome, 5, 40);
		
		
	}
	
	
}
