import java.awt.*;

public class BurmaShave extends Frame implements Runnable {
	CardLayout fl = new CardLayout();
	Label[] lab = new Label[6];
	int current = 0;
	Thread runner;

	public void start() {
		if (runner == null) {
			runner = new Thread(this);
			runner.start();

		}
	}

	public void stop() {
		runner = null;
	}

	BurmaShave(String title) {
		super(title);
		setLayout(fl);
		lab[0] = new Label("Grandpa's beard");
		lab[1] = new Label("Was stiff and coarse.");
		lab[2] = new Label("And that's what caused");
		lab[3] = new Label("His fifth");
		lab[4] = new Label("Divorce");
		lab[5] = new Label("Burma Shave.");
		for (int i = 0; i < lab.length; i++)
			add("CArd " + i, lab[i]);
	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			fl.show(this, "Card " + current);
			current++;
			if (current > 5)
				current = 0;
			repaint();
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {}

		}
	}

}
