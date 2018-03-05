public class Dimension1Array {

	//static Scanner sc = new Scanner(System.in);
	static int zaehler2 = 0;
	static long x = 0, z = 0;
	static int dim = 32;

	static void squared(int[] arr) { 


	for(int i = 0; i < arr.length; i++) {
		System.out.print("Die Elemente des array sind: " + arr[i]);
		System.out.println();

		}
	}

	static void fibonaccio(int n) {
		
		int a = 0, b = 1, c = 0;
		System.out.println("1");
		int zaehler = 1;
		while (zaehler < n) {
		zaehler++;
		c = a + b;
		a = b;
		b = c;
		System.out.println(b);
		}
	}

	static long fibonaccio2(int n, long y) {
			 
		if (zaehler2 < n) {
		zaehler2++;
		z = x + y;
		x = y;
		y = z;
		System.out.println("Zahl " + zaehler2 + " : " + y);
		return fibonaccio2(dim, y);
		}
		return -1;
	}
	

	public static void main(String...args) {

		int[] squareNumber = new int[10];
		for(int i = 0; i < squareNumber.length; i++) {
			squareNumber[i] = (i + 1) * (i + 1); //Hier wird in das Array geschrieben. 
			System.out.println("Die Quadratzahl von " + (i + 1) + " ist " 
				+ squareNumber[i]);
		}
		squared(squareNumber);
		fibonaccio(8);
//		int[] fibo = new int[8];
//		for(int j = 0; j < fibo.length; j++) {
//			fibo[j] = fibonaccio(8);
//			System.out.println("Die Fibonaccizahlen " + fibo[j]);
//		}
		
		fibonaccio2(dim, 1);
	}
}
