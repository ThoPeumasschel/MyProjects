
package taschenrechner;

public class Operationen {
	double addieren(double x, double y) {
		double res = x + y;
		return res;
	}

	double subtrahieren(double x, double y) {
		double res = x - y;
		return res;
	}

	double multiplizieren(double x, double y) {
		double res = x * y;
		return res;
	}

	double dividieren(double x, double y) {
		double res = x / y;
		return res;
	}

	double potenzieren(double x, double y) {
		double res;
		res = Math.pow(x, y);
		return res;
	}

	double radizieren(double x, double y) {
		// double res = Math.sqrt(x);
		double res = Math.pow(x, 1 / y);
		return res;
	}

}
