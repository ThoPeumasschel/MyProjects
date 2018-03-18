

public class Array1 {

	public static void main(String[] args) {
		String[] ord = new String[3];
		// Zuweisung um das Array zu füllen. 
		ord[0] = "Erster";
		ord[1] = "Zweiter";
		ord[2] = "Dritter";
		//Array in Variable speichern. 
		String o1 = ord[0];
		String o2 = ord[1];
		String o3 = ord[2];
		// Zuweisungen
		ord[1] = ord[2];
		ord[2] = null;
		// Arraylänge mit Funtion length
		int cap = ord.length;
		System.out.println(ord[0] + " " + ord[1] + " " + ord[2]);
		System.out.println(o1 + " " + o2 + " " + o3);
		System.out.println("Arraylength: " + cap);
		
		for (int i=0; i < ord.length; i++)
			System.out.println(ord[i]);
		System.out.println(5/7);
		
	}

}
