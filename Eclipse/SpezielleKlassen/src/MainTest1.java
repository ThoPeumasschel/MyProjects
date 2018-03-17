
public class MainTest1 {
	private Datum1[] at = new Datum1[4]; // Array vom Typ Interface

	public MainTest1() {
		at[0] = new Datum2(4, 5, 2000);
		at[1] = new Datum2(12, 12, 2000);
		at[2] = new Datum2();
		at[3] = new Datum2(43, 15, 2035);

		for (int i = 0; i < at.length; i++) {
			if (at[0] instanceof Datum1) {
				at[i].ausgabe();
				at[i].ausgabeLang();
				at[i].ausgabeKurz();
			}
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		new MainTest1();
		System.out.println();
		MainTest1 mt = new MainTest1();
		
		

	}

}
