package fahrplan;

public class Zug 
{
	private String id;
	private int anzWagons;
	private String zugfuehrer;
	
	
	public Zug(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAnzWagons() {
		return anzWagons;
	}
	public void setAnzWagons(int anzWagons) {
		this.anzWagons = anzWagons;
	}
	public String getZugfuehrer() {
		return zugfuehrer;
	}
	public void setZugfuehrer(String zugfuehrer) {
		this.zugfuehrer = zugfuehrer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anzWagons;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((zugfuehrer == null) ? 0 : zugfuehrer.hashCode());
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
		Zug other = (Zug) obj;
		if (anzWagons != other.anzWagons)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (zugfuehrer == null) {
			if (other.zugfuehrer != null)
				return false;
		} else if (!zugfuehrer.equals(other.zugfuehrer))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Zug [id=" + id + ", anzWagons=" + anzWagons + ", zugfuehrer=" + zugfuehrer + "]";
	}
	
	
	
	
	
	
	
	
	
}
