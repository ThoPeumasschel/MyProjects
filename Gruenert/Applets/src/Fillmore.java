import java.awt.*;

public class Fillmore extends java.applet.Applet {
	
	Image whig;
	
	public void init() {	
		whig = getImage(getCodeBase(), "fillmore.jpg");
	
		
	}
			
	public void paint(Graphics screen) {
		int iWidth = whig.getWidth(this);
		int iHeight = whig.getHeight(this);
		int xPos = 10;
		// Bild um Faktor 4 verkleinert
		screen.drawImage(whig, xPos, 10, iWidth / 4, iHeight / 4, this);
		// in Originalgröße
		xPos += iWidth / 4 + 10;
		screen.drawImage(whig, xPos, 10, this);
	}
	
}
