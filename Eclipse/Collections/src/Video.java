import java.util.*;

public class Video {

	static private int anzahlvideos = 0;
	private String videonummer;
	private String titel;
	private int laufzeit;
	private char sprache;
	private char genre; // nur ein Buchstabe möglich!
	public Date ausleihdatum;
	private String ausleihername;

	Video(String nr, String t, int l, char sp, char gen) {
		anzahlvideos++;
		videonummer = nr;
		if (sp == 'd' || sp == 'f' || sp == 'e')
			sprache = sp;
		else
			sprache = 'e';
		laufzeit = l;
		titel = t;
		genre = gen;
	}

	Video() {

	}

	public static int getAnzahlvideos() {
		return anzahlvideos;
	}

	public static void setAnzahlvideos(int anzahlvideos) {
		Video.anzahlvideos = anzahlvideos;
	}

	public String getVideonummer() {
		return videonummer;
	}

	public void setVideonummer(String videonummer) {
		this.videonummer = videonummer;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public char getSprache() {
		return sprache;
	}

	public void setSprache(char sprache) {
		this.sprache = sprache;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}

	public Date getAusleihdatum() {
		return ausleihdatum;
	}

	public void setAusleihdatum(Date ausleihdatum) {
		this.ausleihdatum = ausleihdatum;
	}

	public String getAusleihername() {
		return ausleihername;
	}

	public void setAusleihername(String ausleihername) {
		this.ausleihername = ausleihername;
	}
	
}
	