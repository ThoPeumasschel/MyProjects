package windowSecond.common;

import java.awt.EventQueue;

import windowSecond.views.SecondWBGui;

public abstract class TestMain {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondWBGui frame = new SecondWBGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

}
