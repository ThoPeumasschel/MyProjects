import java.awt.*;
import java.util.Date;

public class Neko extends java.applet.Applet implements Runnable {
	Image nekoPics[] = new Image[9];
	Image currentImg;
	Thread runner;
	int x, y = 100;

	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start(); // hier wird es zum echten Thread
		}
	}

	public void stop() {
		if (runner != null)
			runner = null;
	}

	public void init() {

		String nekoSrc[] = { "right1.gif", "right2.gif", "stop.gif", "yawn.gif", "scratch1.gif", "scratch2.gif",
				"sleep1.gif", "sleep2.gif", "awake.gif" };
		for (int i = 0; i < nekoPics.length; i++)
			nekoPics[i] = getImage(getCodeBase(), nekoSrc[i]);

	}

	public void run() {
		resize(600, 300);
		// Storybord
		// run from one side of the screen to the middle
		nekoRun(0, getSize().width / 2);
		// stop and pause
		currentImg = nekoPics[2];
		repaint();
		pause(1000);
		// yawn
		currentImg = nekoPics[3];
		repaint();
		pause(1000);
		// scratch four times
		nekoScratch(4);
		// sleep for 5 times
		nekoSleep(4);
		// wake up and run of
		currentImg = nekoPics[8];
		repaint();
		pause(500);
		nekoRun(x, getSize().width + 10);

		// End storyboard

	}

	private void nekoScratch(int numTimes) {
		for (int i = numTimes; i > 0; i--) {
			currentImg = nekoPics[4];
			repaint();
			pause(150);
			currentImg = nekoPics[5];
			repaint();
			pause(150);
		}

	}

	private void nekoSleep(int numTimes) {
		for (int i = numTimes; i > 0; i--) {
			currentImg = nekoPics[6];
			repaint();
			pause(350);
			currentImg = nekoPics[7];
			repaint();
			pause(350);
		}
	}

	private void nekoRun(int start, int end) {
		for (int i = start; i < end; i += 10) {
			x = i;
			// swap images
			if (currentImg == nekoPics[0])
				currentImg = nekoPics[1];
			else
				currentImg = nekoPics[0];
			repaint();
			pause(100);
		}

	}

	private void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics screen) {
		if (currentImg != null)
			screen.drawImage(currentImg, x, y, this);
	}
}
