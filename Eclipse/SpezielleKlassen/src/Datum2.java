
public class Datum2 implements Datum1 {

	private int tag, monat, jahr;

	public Datum2() {
		this(1, 1, 2000);
	}

	public Datum2(int i, int j, int k) {
		tag = i; monat = j; jahr = k;
	}

	@Override
	public void ausgabe() {
		System.out.println("Datum: " + tag + "." + monat + "." + jahr);
	}

	@Override
	public void ausgabeLang() {
		System.out.println("Das gespeicherte Datum ist der: " + tag + "." + monat + "." + jahr);
	}

	@Override
	public void ausgabeKurz() {
		System.out.println(tag + "." + monat + "." + jahr);
	}

}
