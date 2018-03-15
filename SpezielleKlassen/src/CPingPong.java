
public class CPingPong extends Thread implements Runnable {
	String meldung;
	int zaehler = 0;

	public CPingPong(String m) {
		meldung = m;
	}
	@Override
	public void run() {
		while (zaehler < 100) {
			System.out.println(meldung);
			zaehler++;
			yield();
		}
	}

	public static void main(String[] args) {
		CPingPong ping = new CPingPong("Ich bin Herr Ping.");
		CPingPong pong = new CPingPong("Ich bin Herr Pong.");
		ping.start();
		pong.start();
		
	}
}
