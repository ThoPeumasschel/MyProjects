package fahrplan;

public class Haltepunkt implements Comparable
{
	//haltepunkt gehört zu einem konkreten bahnhof
	private Bahnhof bahnhof;
	private String gleis;
	private String ankunft; //"12:30"
	private String abfahrt;
	
	
	
	
	
	
	
	
	
	public Bahnhof getBahnhof() {
		return bahnhof;
	}









	public void setBahnhof(Bahnhof bahnhof) {
		this.bahnhof = bahnhof;
	}









	public String getGleis() {
		return gleis;
	}









	public void setGleis(String gleis) {
		this.gleis = gleis;
	}









	public String getAnkunft() {
		return ankunft;
	}









	public void setAnkunft(String ankunft) {
		this.ankunft = ankunft;
	}









	public String getAbfahrt() {
		return abfahrt;
	}









	public void setAbfahrt(String abfahrt) {
		this.abfahrt = abfahrt;
	}









	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ankunft == null) ? 0 : ankunft.hashCode());
		result = prime * result + ((bahnhof == null) ? 0 : bahnhof.hashCode());
		result = prime * result + ((gleis == null) ? 0 : gleis.hashCode());
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
		Haltepunkt other = (Haltepunkt) obj;
		if (ankunft == null) {
			if (other.ankunft != null)
				return false;
		} else if (!ankunft.equals(other.ankunft))
			return false;
		if (bahnhof == null) {
			if (other.bahnhof != null)
				return false;
		} else if (!bahnhof.equals(other.bahnhof))
			return false;
		if (gleis == null) {
			if (other.gleis != null)
				return false;
		} else if (!gleis.equals(other.gleis))
			return false;
		return true;
	}









	@Override
	public int compareTo(Object o) 
	{
		//zeitlich aufsteigend sortieren
		if(o instanceof Haltepunkt)
		{
			Haltepunkt temp=(Haltepunkt)o;
			return ankunft.compareTo(temp.getAnkunft());
		}
		return 0;
	}









	@Override
	public String toString() {
		return "Haltepunkt [bahnhof=" + bahnhof + ", gleis=" + gleis + ", ankunft=" + ankunft + "]";
	}
	
	
	
	
	
	
}
