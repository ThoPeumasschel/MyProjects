package taschenrechner;

import javax.swing.JOptionPane;

public class Taschenrechner {

	public static void main(String... pustekuchen) {
		Operationen o = new Operationen();

		String auswahl = JOptionPane.showInputDialog("Auswahl: \n+ f�r Addition, \n- f�r Subtraktion, "
				+ "\n* f�r Multiplikation, \n/ f�r Division, \npot f�r n-te Potenz, \nrad f�r n-te Wurzel");
		double x = Double.parseDouble(JOptionPane.showInputDialog("Geben " + "Sie eine Zahl ein!"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Geben " + "Sie noch eine Zahl ein!"));
		switch (auswahl) {

		case "+":
			JOptionPane.showMessageDialog(null, "Ergebnis: x + y = " + o.addieren(x, y));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "Ergebnis: x - y = " + o.subtrahieren(x, y));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "Ergebnis: x * y = " + o.multiplizieren(x, y));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "Ergebnis: x / y = " + o.dividieren(x, y));
			break;
		case "pot":
			JOptionPane.showMessageDialog(null, "Ergebnis: x^y = " + o.potenzieren(x, y));
			break;
		case "rad":
			JOptionPane.showMessageDialog(null, "Ergebnis: x^(1/y) = " + o.radizieren(x, y));
			break;
		}

	}

}
