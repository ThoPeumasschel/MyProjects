package fahrplan;

import java.util.TreeSet;

public class Zuglinie 
{
	private String bezeichner;
	//eine zuglinie besteht aus ihren haltepunkten
	private TreeSet haltepunkte;
	
	
	public Zuglinie(String bezeichner) 
	{
		super();
		this.bezeichner = bezeichner;
		haltepunkte=new TreeSet();
	}

	
	
	
	
	

	public String getBezeichner() {
		return bezeichner;
	}







	public void setBezeichner(String bezeichner) {
		this.bezeichner = bezeichner;
	}







	public TreeSet getHaltepunkte() {
		return haltepunkte;
	}







	public void setHaltepunkte(TreeSet haltepunkte) {
		this.haltepunkte = haltepunkte;
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bezeichner == null) ? 0 : bezeichner.hashCode());
		result = prime * result + ((haltepunkte == null) ? 0 : haltepunkte.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zuglinie other = (Zuglinie) obj;
		if (bezeichner == null) {
			if (other.bezeichner != null)
				return false;
		} else if (!bezeichner.equals(other.bezeichner))
			return false;
		if (haltepunkte == null) {
			if (other.haltepunkte != null)
				return false;
		} else if (!haltepunkte.equals(other.haltepunkte))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	//dienste
	
	//haltepunkt hinzufügen
	public void addHaltepunkt(Haltepunkt punkt)
	{
		haltepunkte.add(punkt);
	}
	
	//haltepunkt entfernen
	public void loescheHaltepunkt(Haltepunkt punkt)
	{
		haltepunkte.remove(punkt);
	}







	@Override
	public String toString() {
		return "Zuglinie [bezeichner=" + bezeichner + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
