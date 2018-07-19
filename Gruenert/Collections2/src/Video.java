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
		videonummer = null;
		titel = null;
		laufzeit = 0;		
		sprache = 'd';
		genre = ' ';
		
	}
	
	void ausleihen(String a) {
		ausleihername = a;
		ausleihdatum = new Date();
		
	}

	int istVideoda(String nr,  Video[] v) {
		int index = -1;
			
			for (int i = 0; i<v.length ; i++) {
				if (v[i].getVideonummer() == nr) {
					index = i;
					break;
				}
			}

		return index;
		
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
	
	String videotoString() {
		String str = "Anzahl Videos: " + anzahlvideos;
		if (videonummer != null)
			str += " Videonummer: " + videonummer;
		else
			str += " Videonummer nicht vorhanden. ";
		str += " Sprache: " + sprache;
		if (titel != null)
			str += " Titel: " + titel;
		else
			str += " Titel nicht vorhanden. ";
		str += " Laufzeit: " + laufzeit + " min";
		if (genre == 'k')
			str += " Krimi";
		else if (genre == 't')
			str += " Thriller";
		else if (genre == 'a')
			str += " Action";
		else if (genre == 'd')
			str += " Drama";
		if (ausleihdatum == null)
			str += " nicht ausgeliehen";
		else
			str += " ausgeliehen";
		return str;
	}
	
	
}
	