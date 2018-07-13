import java.awt.*;

public class Checkers extends java.applet.Applet implements Runnable {
	Thread runner;
	int xPos = 5;
	int xMove = 4;
	Image offscreenImg;
	Graphics offscreen;

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

		offscreenImg = createImage(getSize().width, getSize().height);
		offscreen = offscreenImg.getGraphics();

	}

	public void run() {
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			xPos += xMove;
			if ((xPos > 105) | (xPos < 5))
				xMove *= -1;
			repaint(); // löscht Bildschirm und ruft paint() auf
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void update(Graphics screen) {
		paint(screen);
	}

	public void paint(Graphics screen) {
		// Draw background
		offscreen.setColor(Color.black);
		offscreen.fillRect(0, 0, 100, 100);
		offscreen.setColor(Color.white);
		offscreen.fillRect(100, 0, 100, 100);
		// Draw checker
		offscreen.setColor(Color.red);
		offscreen.fillOval(xPos, 5, 90, 90);
		// show offscreen image
		screen.drawImage(offscreenImg, 0, 0, this);

	}
	
	public void  destroy() {
		offscreen.dispose();
		
	}
	
}
