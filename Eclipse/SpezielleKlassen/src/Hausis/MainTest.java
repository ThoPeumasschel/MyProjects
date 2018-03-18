package Hausis;



public class MainTest {

	

	public static void main(String[] args) {
		
		Window w = new Window();
		w.frame.setVisible(true);
		w.initialize();
		
		Messwert mw = new Messwert();
		mw.append();
		mw.display();
		
		
		
	}

	

}
