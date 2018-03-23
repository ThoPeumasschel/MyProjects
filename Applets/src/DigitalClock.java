import java.awt.*;
import java.util.*;

public class DigitalClock extends java.applet.Applet implements Runnable {
	Font f = new Font("TimesRoman", Font.BOLD, 24);
	Date theDate;
	Thread runner;

	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start();
		}
	}

	public void stop() {
		if (runner != null)
			runner = null;

	}

	public void run() {
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			repaint(); // löscht BS und ruft paint() auf
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public void paint(Graphics screen) {
		theDate = new Date();
		screen.setFont(f);
		screen.drawString(theDate.toString(), 10, 50);
		
		
	}

}
