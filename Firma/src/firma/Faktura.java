package firma;

import javax.swing.JOptionPane;

public class Faktura {

	public void zusammenrechnen(Abteilungen[] abt, Aussenstellen aus, Fuhrpark f) {

		double gesamtkosten = 0;
		for (Abteilungen a : abt)
			gesamtkosten += a.getPersonalkosten();

		gesamtkosten += f.kostenRechnung() + aus.getPersonalkosten() + aus.getPersonalkosten();

		JOptionPane.showMessageDialog(null, "Gesamtkosten: " + gesamtkosten + " €");
	}

}
