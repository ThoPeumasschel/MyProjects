package collections;

public class Auto 
{
	private int ps;
	private String typ;
	private String motor;
	private String farbe;
	private String reifentyp;
	private int anzTueren;
	
	
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getReifentyp() {
		return reifentyp;
	}
	public void setReifentyp(String reifentyp) {
		this.reifentyp = reifentyp;
	}
	public int getAnzTueren() {
		return anzTueren;
	}
	public void setAnzTueren(int anzTueren) {
		this.anzTueren = anzTueren;
	}
	public Auto(int ps, String typ) {
		super();
		this.ps = ps;
		this.typ = typ;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	@Override
	public String toString() {
		return "Auto [ps=" + ps + ", typ=" + typ + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		//dasselbe objekt? identische speicheradressen?
		if(this==o)
		{
			return true;
		}
		
		//man darf nur autos miteinander vergleichen! -> hier sind 2 autos gleich, wenn ps, typ und motor inhaltlich gleich sind:
		if(o instanceof Auto)
		{
			Auto temp=(Auto)o;
			if(this.ps==temp.getPs() && 
					this.typ.equals(temp.getTyp()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int faktor=51;
		int hash=1;
		hash*=faktor + (typ==null ? 0 : typ.hashCode());
		hash*=33 + ps;
		return hash;
	}
	
	
	
	
}

/*
 * 	EQUALS UND HASHCODE
 * 
 * 
 * 		1. Solange sich ein Objekt nicht verändert, muss sein hashCode() immer denselben Wert liefern!!
 * 
 * 		2. Wenn für 2 Objekte die hashCode() identische Werte liefert, dann KÖNNEN diese beiden Objekte inhaltlich gleich sein, MÜSSEN ABER NICHT!
 * 
 * 		3. Wenn für 2 Objekte die hashCode() verschiedene Werte liefert, dann ist deren Gleichheit AUSGESCHLOSSEN!
 * 
 * 		4. In Collections, welche mit Hashfunktionen arbeiten(Set, Map), wird die equals() nur dann zusätzlich aufgerufen, wenn für 2 Objekte
 * 		   die hashCode() identische Werte liefert(Kollision -> Die Objekte KÖNNTEN gleich sein!)
 * 
 * 				-> Die equals wird NICHT immer aufgerufen, weil die Collections dann zu langsam wären!
 * 
 * 		5. Logischerweise muss die hashCode zweier Objekte immer dann auch identische Werte liefern, wenn der Vergleich dieser Objekte per
 * 			equals true liefert!
 * 
 * 		6. In der hashCode sollten alle Attribute in die Berechnung einfliessen, welche auch in der equals miteinander verglichen werden!
 * 
 * 		7. Die Berechnung des Hashcodes sollte möglichst schnell sein
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */










