
public class Weitergabe {
	
	public void weitergabe() throws ClassNotFoundException {
		Class c1;
		c1 = Class.forName("Diese Klasse existiert nicht.");
	}

	public static void main(String[] args) {
		try {
			Weitergabe w = new Weitergabe();
			w.weitergabe();
		} catch (ClassNotFoundException e) {
			System.out.println("Klasse nicht gefunden!");
			System.out.println("Exception-Text: " + e.getMessage());
		}

	}

}
