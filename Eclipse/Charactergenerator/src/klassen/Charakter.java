package klassen;

import java.util.*;

public class Charakter 
{
	private int IDplanquadrat;
	private Name name;
	private Geschlecht geschlecht;
	private SpezielleGabe spezielleGabe;
	private Waffe waffe;
	
	
	public Charakter() 
	{
		this.setName(Name.values()[new Random().nextInt(Name.values().length)]);
		this.setGeschlecht(Geschlecht.values()[new Random().nextInt(Geschlecht.values().length)]);
		this.setSpezielleGabe(SpezielleGabe.values()[new Random().nextInt(SpezielleGabe.values().length)]);
		this.setWaffe(Waffe.values()[new Random().nextInt(Waffe.values().length)]);
		this.setIDplanquadrat(IDplanquadrat);
		
		
		System.out.println("Charakter erzeugt: \nName: "+this.getName()+"\nGeschlecht: "+this.getGeschlecht()
		+"\nSpezielle Gabe: "+this.getSpezielleGabe()+"\nWaffe: "+this.getWaffe());
		System.out.println();
		
		
	}
	
	public String zeigeCharakter() 
	{
		return "Charakter erzeugt: \nName: "+this.getName()+"\nGeschlecht: "+this.getGeschlecht()
		+"\nSpezielle Gabe: "+this.getSpezielleGabe()+"\nWaffe: "+this.getWaffe();
	}

	enum Name 
	{
		Ougudougu, Ktulhu, Kaan, Isana, Ozzy, Jennifer, Krypia, Obama, Tek, Hyprio, Berti
	}

	enum Geschlecht 
	{
		männlich, weiblich, hybrid, neutral
	}

	enum SpezielleGabe 
	{
		Beschwörung, Zerstörung, Illusion, Heilung, Schleichen, Polymorphie
	}

	enum Waffe 
	{
		Schwert, Armbrust, Hammer, Axt, Morgenstern, Dolch, Speer, Langbogen
	}
	
	public int getIDplanquadrat() {
		return IDplanquadrat;
	}

	public void setIDplanquadrat(int iDplanquadrat) {
		IDplanquadrat = iDplanquadrat;
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


	
	

}
