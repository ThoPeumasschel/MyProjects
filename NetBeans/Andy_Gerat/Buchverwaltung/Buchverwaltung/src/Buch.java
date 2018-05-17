
public class Buch {
	private String isbn;
	private String buchTitel;
	private double preis;
	
	public Buch(String isbn, String buchTitel, double preis){
		this.isbn = isbn;
		this.buchTitel = buchTitel;
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return isbn + " - " + buchTitel + " - " + preis;
	}
}
