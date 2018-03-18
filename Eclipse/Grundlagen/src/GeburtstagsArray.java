
public class GeburtstagsArray {

	public static void main(String[] args) {
		// Array geb hat 31 Elemente die hineinpassen
		// der Index geht von 0 bis 30
		String[] geb = new String[31];
		for (int i=0; i < geb.length; i++)
			geb[i] = "0";
		for (int i=0; i < geb.length; i++)
		{
			System.out.println(geb[i] + " hat den Index " + i);
		}
		System.out.println();
		geb[0] = "Joachim";
		geb[4] = "Mueller";
		geb[13] = "Mayer E.";
		geb[21] = "Schubert";
		geb[30] = "Meier G.";
		for (int i=0; i < geb.length; i++)
		{
			if (geb[i] != "0")
				System.out.println(geb[i] + " hat am " + (i + 1) + 
						". Tag Geburtstag");
		}
	}

}
