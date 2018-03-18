

public class Verbrauch {

	public static void main(String[] args) {
		
		int km = 323;
		double verbrauch100 = 7.2;
		double verbrauch, v;
		//falsche Variante
		//verbrauch = km / 100 * verbrauch100;
		// 1. richtige Variante
		//verbrauch = (double)km / 100 * verbrauch100;
		//2. richtige Variante
		//verbrauch = km / 100.0 * verbrauch100;
		//3. richtige Variante
		verbrauch = km / (double)100 * verbrauch100;
		
		System.out.println("Verbrauch fuer " + km + " km: " + verbrauch + " Liter");

		v = Math.round(verbrauch * 100);
		System.out.println("Verbrauch fuer " + km + " km: " + v / 100 + " Liter");
		
	}

}
