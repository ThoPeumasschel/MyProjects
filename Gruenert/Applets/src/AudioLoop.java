import java.awt.*;
import java.applet.*;

public class AudioLoop extends Applet implements Runnable {
	AudioClip bgSound, beep;
	Thread runner;

	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start(); // hier wird es zum echten Thread
		}
	}

	public void stop() {
		if (runner != null) {
			if (bgSound != null)
				bgSound.stop();
			runner = null;
		}
	}

	public void init() {
		bgSound = getAudioClip(getCodeBase(), "loop.au");
		beep = getAudioClip(getCodeBase(), "beep.au");
	}

	public void run() {
		if (bgSound != null)
			bgSound.loop();
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (beep != null)
				beep.play();
		}

	}

	public void paint(Graphics screen) {
		screen.drawString("Playing Sounds ...", 10, 10);
	}
}
