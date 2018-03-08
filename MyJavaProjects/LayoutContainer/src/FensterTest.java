import java.awt.*;
import java.awt.event.*;

public class FensterTest {

	public static void main(String[] args) {
		Frame app = new BurmaShave("Test Layout-Container");

		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		app.addWindowListener(l);

		app.setSize(200, 150);
		app.setVisible(true);

	}

}
