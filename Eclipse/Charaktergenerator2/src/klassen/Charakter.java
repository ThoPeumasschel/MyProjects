package klassen;

import java.util.*;

public class Charakter {

	private int spielerID;
	static int index = 1;
	private int spielerPosition;
	private Name name;
	private Geschlecht geschlecht;
	private SpezielleGabe spezielleGabe;
	private Waffe waffe;

	public Charakter(int planquadratID) {
		this.setSpielerPosition(planquadratID);
		this.setName(Name.values()[new Random().nextInt(Name.values().length)]);
		this.setGeschlecht(Geschlecht.values()[new Random().nextInt(Geschlecht.values().length)]);
		this.setSpezielleGabe(SpezielleGabe.values()[new Random().nextInt(SpezielleGabe.values().length)]);
		this.setWaffe(Waffe.values()[new Random().nextInt(Waffe.values().length)]);
		this.setSpielerPosition(getSpielerPosition());
		this.setSpielerID(index);

		System.out.println(
				index + ". Charakter " + this.getName() + " erzeugt auf Planquadrat " + this.getSpielerPosition());
		index++;
	}
	

	enum Name {
		Ougudougu, Ktulhu, Kaan, Isana, Ozzy, Jennifer, Krypia, Obama, Tek, Hyprio, Berti
	}

	enum Geschlecht {
		männlich, weiblich, hybrid, neutral
	}

	enum SpezielleGabe {
		Beschwörung, Zerstörung, Illusion, Heilung, Schleichen, Polymorphie
	}

	enum Waffe {
		Schwert, Armbrust, Hammer, Axt, Morgenstern, Dolch, Speer, Langbogen
	}

	public int getSpielerPosition() {
		return spielerPosition;
	}

	public void setSpielerPosition(int spielerPosition) {
		this.spielerPosition = spielerPosition;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public SpezielleGabe getSpezielleGabe() {
		return spezielleGabe;
	}

	public void setSpezielleGabe(SpezielleGabe spezielleGabe) {
		this.spezielleGabe = spezielleGabe;
	}

	public Waffe getWaffe() {
		return waffe;
	}

	public void setWaffe(Waffe waffe) {
		this.waffe = waffe;
	}

	public int getSpielerID() {
		return spielerID;
	}

	public void setSpielerID(int spielerID) {
		this.spielerID = spielerID;
	}

	
	

}
