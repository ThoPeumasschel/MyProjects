import java.awt.*;
import java.awt.event.*;

public class FensterTest {

	public static void main(String[] args) {
		Frame app = new SchriftartHeld("Aufgabe zu Fenstern");

		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		app.addWindowListener(l);

		app.setSize(300, 300);
	
		app.setVisible(true);
		
	}

}
