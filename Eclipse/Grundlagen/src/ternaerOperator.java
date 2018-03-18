
public class ternaerOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myScore = 8, yourScore = 5, ourBestScore = 0;
		if (myScore > yourScore)
			ourBestScore = myScore;
		else
			ourBestScore = yourScore;
		System.out.println(ourBestScore);
		// ternär Operator
		// wenn Bedingung wahr ist, wird der Wert der Variablen nach dem 
		// Fragezeichen zugewiesen
		// wenn Bedingung falsch ist, wird der Wert der Variablen nach dem 
		// Doppelpunkt zugewiesen
		ourBestScore = myScore > yourScore ? myScore : yourScore;
		System.out.println(ourBestScore);
	}

}
