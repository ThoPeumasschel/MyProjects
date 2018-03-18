import java.awt.*;
import java.awt.event.*;

public class PersonMain {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.menue();
	//	Angestellter ang1 = new Angestellter();
	//	ang1.menue();
		
		FirmaFenster ff = new FirmaFenster("Firmenverwaltung");
		
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		ff.addWindowListener(l);

		ff.setSize(500, 400);
		
		ff.setVisible(true);
		
	}

}
