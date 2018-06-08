package firma;

public class Fuhrpark {

	private static int fahrzeugnr;

	Fahrzeug[] fuhrpark = new Fahrzeug[100];

	protected double kostenRechnung() {
		
		double erg = 0;
		
		for(int i = 0; fuhrpark[i]!=null;++i) {
			
		
		erg = (fuhrpark[i].getVerbrauch())+(fuhrpark[i].getVersicherungskosten());
		
		}
		
		return erg;
		
	}

	protected void erzeugeFahrzeug(String model, double verbrauchskosten, double versicherungskosten) {

		Fahrzeug f = new Fahrzeug(model, verbrauchskosten, versicherungskosten);

		fuhrpark[fahrzeugnr] = f;

		fahrzeugnr++;
		
		

	}

	public static int getFahrzeugnr() {
		return fahrzeugnr;
	}

	public static void setFahrzeugnr(int fahrzeugnr) {
		Fuhrpark.fahrzeugnr = fahrzeugnr;
	}

}
