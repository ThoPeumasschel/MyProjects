package windowSecond.common;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	private String vorname, nachname, strasse, hausnr, ort, plz;

	public Person(String v, String n, String s, String h, String o, String p) {

		vorname = v;
		nachname = n;
		strasse = s;
		hausnr = h;
		ort = o;
		plz = p;

	}

	public Person() {

		vorname = null;
		nachname = null;
		strasse = null;
		hausnr = null;
		ort = null;
		plz = null;

	}

	public String toString() {

		return nachname + ", " + vorname + "\n" + strasse + " " + hausnr + "\n" + plz + " " + ort;

	}
	
	

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnr() {
		return hausnr;
	}

	public void setHausnr(String hausnr) {
		this.hausnr = hausnr;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

}
