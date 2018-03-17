import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FensterAufgabeTest {

	public static void main(String[] args) {
//		Frame app = new 
		FensterAufgabe af = new FensterAufgabe("Fenster Aufgabe");
		
		
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		af.addWindowListener(l);

		af.setSize(500, 400);
		af.setVisible(true);
	}

}
