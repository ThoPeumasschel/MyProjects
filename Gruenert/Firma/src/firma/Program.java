package firma;

public class Program {

	static double gesamtkosten;
	
	public static void main(String[] args) {

		Produktion prod = new Produktion(45000);
		IT it = new IT(250);
		PR pr = new PR(230000);
		Einkauf ek = new Einkauf(85000);
		Marketing mk = new Marketing(20000);
		Fuhrpark f = new Fuhrpark();
		Aussenstellen aus = new Aussenstellen(123000);

		Abteilungen[] kostenAbt = new Abteilungen[5];

		kostenAbt[0] = prod;
		kostenAbt[1] = it;
		kostenAbt[2] = pr;
		kostenAbt[3] = ek;
		kostenAbt[4] = mk;
		
		
		f.erzeugeFahrzeug("Fiat", 350, 540);
		f.erzeugeFahrzeug("VW", 789, 777);
		f.erzeugeFahrzeug("Audi", 880, 990);
		
		
		new Faktura().zusammenrechnen(kostenAbt, aus, f);

	}

}
