
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ord = new String[3];
		// Zuweisungen um das array zu füllen
		ord[0] = "Erster";
		ord[1] = "Zweiter";
		ord[2] = "Dritter";
		// Array in Variable speichern
		String o1 = ord[0];
		String o2 = ord[1];
		String o3 = ord[2];
		// Zuweisungen
		ord[1] = ord[2];
		ord[2] = "Vierter";
		// Arraylänge mit Funktion length
		int cap = ord.length;
		System.out.println(ord[0] + " " + ord[1] + " " + ord[2]);
		System.out.println(o1 + " " + o2 + " " + o3);
		System.out.println("Arraylaenge: " + cap);
		System.out.println();
		
		for (int i=0; i < ord.length; i++)
			System.out.println(ord[i]);
		System.out.println();
		
		int index = -1;
		boolean contains = false;
		for (int i=0; i < ord.length; i++)
		{
			if (ord[i].equals("Dritter"))
			{
				index = i;
				contains = true;
				break;
			}
		}
		System.out.println("Der Eintrag 'Dritter' wurde am Index " + index +
				 " gefunden!");
		System.out.println();
		
		if (contains)
			System.out.println("Der Eintrag 'Dritter' wurde am Index " + index +
					 " gefunden!");
		else
			System.out.println("Der Eintrag 'Dritter' wurde nicht "
					+ "gefunden");
	}

}
