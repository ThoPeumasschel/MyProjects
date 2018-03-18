package fensterAufgaben;

import java.awt.*;
import java.awt.event.*;

public class TestProgramm {

	public static void main(String[] args) {
//		Frame app = new 
		DreiButtonsDreiFenster db = new DreiButtonsDreiFenster("Montags Aufgabe");
		
		
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		db.addWindowListener(l);

		db.setSize(500, 400);
		db.setVisible(true);
	}

}
