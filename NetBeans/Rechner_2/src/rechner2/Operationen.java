package rechner2;

public class Operationen {

	double addieren(double x, double y) {
		double erg = x + y;
		return erg;
	}

	double subtrahieren(double x, double y) {
		double erg = x - y;
		return erg;
	}

	double mutliplizieren(double x, double y) {
		double erg = x * y;
		return erg;
	}

	double dividieren(double x, double y) {
		double erg = x / y;
		return erg;
	}

	double potenzieren(double x) {
		double erg = Math.pow(x, 2);
		return erg;
	}

	double radizieren(double x) {
		double erg = Math.pow(x, 1 / 2);
		return erg;
	}

}
